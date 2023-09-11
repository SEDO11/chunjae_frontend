// node는 app이 main 이다.
const http = require("http");
const fs = require("fs");
const url = require("url");
const qs = require("querystring");
const path = require("path");

let tmp1 = {
    HTML: function (title, list, body, control) {
        return `
        <!doctype html>
        <html>
        <head>
          <title>WEB1 - ${title}</title>
          <meta charset="utf-8">
          <style>
            body {
                display: flex;
                flex-direction: column;
                align-items: center;
                background-color: lightgray;
            }
            #background {
                background-color: white;
                height: auto;
                width: 90%;
                max-width: 450px;
                box-shadow: 0px 40px 30px -20px rgba(0, 0, 0, 0.3);
            }
            .titlebar {
                background-color: #F9F9F9;
                font-weight: 400;
                border: none; border-bottom: 1px solid #CCCCCC;
                padding: 18px;
            }
            .content {
                padding: 20px;
                max-height: max-content;
            }
            .btncover {
                display: flex;
                padding: 20px 10px 10px 10px;
            }
            .btn {
                font-size: 15px;
                text-decoration: none;
                text-align: center;
                background-color: white;
                color: black;
                border: 1px solid lightgray;
                padding: 5px 10px;
                margin: 5px;
                display: inline-block;
                cursor: pointer;
                border-radius: 3px;
            }
          </style>
        </head>
        <body>
          <h2><a href="/" style="color:black; text-decoration: none; text-align: center;">Node.js 게시판 구현</a></h2>
          <div id="background">
            <div class="titlebar">글 목록</button></div>
            <div class="content">
                ${list}
            </div>
            <div class="titlebar">글 내용</button></div>
            <div class="content">
                ${body}
                ${control}
            </div>
          </div>
        </body>
        </html>
        `;
    }, list: function (filelist) {
        var list = '<ul>';
        var i = 0;
        while (i < filelist.length) {
            list = list + `<li><a href="/?id=${filelist[i]}">${filelist[i]}</a></li>`;
            i = i + 1;
        }
        list = list + '</ul>';
        return list;
    }
}

let app = http.createServer((req, res) => {
    let _url = req.url;
    let queryData = url.parse(_url, true).query;
    let pathname = url.parse(_url, true).pathname;
    if (pathname === '/') { // root 이면
        // 메인페이지 표시
        if(queryData.id === undefined) { // id 값이 없으면
            fs.readdir("./data/", (err, filelist) => {
                var title = '타이틀';
                var description = '내용';
                var list = tmp1.list(filelist);
                var html = tmp1.HTML(title, list, `
                    <h2>${title}</h2>
                `, 
                `<div class="btncover">
                    <a class="btn" href="/create">글작성</a>
                    <a class="btn" href="/update?id=${queryData.id}">글수정</a>
                    <a class="btn" href="/delete?id=${queryData.id}">글삭제</a>
                </div>`);
                res.writeHead(200, { 'Content-Type': 'text/html; charset=UTF-8' });
                res.end(html);
            });
        } else {
                fs.readFile('./data/'+queryData.id, 'utf-8', (err, data) => {
                fs.readdir("./data/", (err, filelist) => {
                    var title = queryData.id;
                    var list = tmp1.list(filelist);
                    var html = tmp1.HTML(title, list, `
                        <h2>${title}</h2>
                    `, 
                    `<div>
                        ${data}
                    </div>
                    <div class="btncover">
                        <a class="btn" href="/create">글작성</a>
                        <a class="btn" href="/update?id=${queryData.id}">글수정</a>
                        <a class="btn" href="/delete?id=${queryData.id}">글삭제</a>
                    </div>`);
                    res.writeHead(200, { 'Content-Type': 'text/html; charset=UTF-8' });
                    res.end(html);
                    })
            })
        }
    } else if (pathname === '/create') {
        // 글쓰기창 표시
        fs.readdir("./data/", (err, filelist) => {
            let title = 'WEB - create';
            let decoration = 'Hello Node File Board';
            let list = tmp1.list(filelist);
            let html = tmp1.HTML(title, list, 
                `
                <h2>${title}</h2>
                `,
                `
                <form action="/create_pro" method="post">
                    <p><input type="text" name="title" placeholder="title"></p>
                    <p><textarea name="description" placeholder="description"></textarea></p>
                    <p><input type="submit" value="글 작성"></p>
                </form>
                `)
                res.writeHead(200, { 'Content-Type': 'text/html; charset=UTF-8' });
                res.end(html);
        });
    } else if (pathname === '/create_pro') {
        // 글쓰기 내용을 파일로 저장 후 다시 메인 페이지로 이동
        var body = '';
        req.on('data', (data) => { // 입력받은 데이터 저장
            body = body + data;
        })
        req.on('end', () => {
            var post = qs.parse(body);
            var title = post.title;
            var description = post.description;
            fs.writeFile('./data/' + title + '.txt', description, (err) => { 
                console.log(title + " 파일 생성");
            })
            fs.readdir("./data/", (err, filelist) => {
                var title = '타이틀';
                var description = '내용';
                var list = tmp1.list(filelist);
                var html = tmp1.HTML(title, list, `
                    <h2>${title}</h2>
                `, 
                `<div class="btncover">
                    <a class="btn" href="/create">글작성</a>
                    <a class="btn" href="/update?id=${queryData.id}">글수정</a>
                    <a class="btn" href="/delete?id=${queryData.id}">글삭제</a>
                </div>`);
                res.writeHead(200, { 'Content-Type': 'text/html; charset=UTF-8' });
                res.end(html);
            });
            
        })
    } else if (pathname === '/update') {
        // 해당 내용을 수정할 수 있게 폼으로 로딩
        console.log('queryData.id : '+queryData.id)
        fs.readFile('./data/'+queryData.id, 'utf-8', (err, data) => {
            fs.readdir("./data/", (err, filelist) => {
                var title = "글 수정";
                var list = tmp1.list(filelist);
                var html = tmp1.HTML(title, list, `
                    <h2>${title}</h2>
                `, 
                `
                <form action="/update_pro" method="post">
                    <p><input type="text" name="title" placeholder="title" value=${queryData.id}></p>
                    <p><textarea name="description" placeholder="description">${data}</textarea></p>
                    <p><input type="submit" value="글 수정"></p>
                </form>`);
                res.writeHead(200, { 'Content-Type': 'text/html; charset=UTF-8' });
                res.end(html);
                })
        })
    } else if (pathname === '/update_pro') {
        // 해당 글의 내용을 수정하고, 다시 메인 페이지로 이동
        var body = '';
        req.on('data', (data) => { // 입력받은 데이터 저장
            body = body + data;
        })
        req.on('end', () => {
            var post = qs.parse(body);
            var title = post.title;
            var description = post.description;
            fs.writeFile('./data/' + title + '.txt', description, (err) => { 
                console.log(title + " 파일 수정");
            })
            fs.readdir("./data/", (err, filelist) => {
                var title = '타이틀';
                var description = '내용';
                var list = tmp1.list(filelist);
                var html = tmp1.HTML(title, list, `
                    <h2>${title}</h2>
                `, 
                `<div class="btncover">
                    <a class="btn" href="/create">글작성</a>
                    <a class="btn" href="/update?id=${queryData.id}">글수정</a>
                    <a class="btn" href="/delete?id=${queryData.id}">글삭제</a>
                </div>`);
                res.writeHead(200, { 'Content-Type': 'text/html; charset=UTF-8' });
                res.end(html);
            });
            
        })
    } else if (pathname === '/delete') {
        // 해당 글의 내용을 삭제하고 다시 메인페이지로 이동
        var body = '';
      req.on('data', function(data){
          body = body + data;
      });
      req.on('end', function(){
        fs.readdir("./data/", (err, filelist) => {
          var post = qs.parse(body);
          var id = post.id;
        //   var filteredId = path.parse(id).base;
          var title = '타이틀';
        var description = '내용';
        var list = tmp1.list(filelist);
        var html = tmp1.HTML(title, list, `
            <h2>${title}</h2>
        `, 
        `<div class="btncover">
            <a class="btn" href="/create">글작성</a>
            <a class="btn" href="/update?id=${queryData.id}">글수정</a>
            <a class="btn" href="/delete?id=${queryData.id}">글삭제</a>
        </div>`);
          fs.unlink(`./data/${queryData.id}`, function(error){
            res.writeHead(200, {Location: `/`}); 
            res.end(html);
          });
        });
      });
    } else {
        res.writeHead(404);
        res.end('Not Found Page')
    }
});
app.listen(3100);