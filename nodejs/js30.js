const dbCon = require("./model/sample.js");
const express = require("express");
const bodyPaser = require('body-parser');
const app = express();
app.use(bodyPaser.urlencoded({extended: false}));
let title = "";
let tmp1 = `<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>샘플</title>
</head>
<body>
    <ul>
        <li><a href="/list">목록</a></li>
        <li><a href="/addSample">샘플 추가</a></li>
    </ul>
    <hr>
`;
let tmp2 = `</body></html>`;

app.get('/', (req, res) => {
    res.sendFile(__dirname + "/sampleMain.html");
});

app.get('/list', (req, res) => {
    title = `<h2>샘플 항목</h2>`;
    let li = `<ul>`;
    dbCon.getSampleList()
        .then((rows) => {
            // 만약 rows가 객체로 반환된다면 처리 방법을 수정해야 함
            rows.forEach((item) => {
                li += `<li><a href="/get/${item.NO}">${item.NAME}</a></li>`;
              });
              
              // ul을 닫아서 완전한 HTML 목록을 만듦
              li += '</ul>';
            res.send(tmp1 + title + li + tmp2);
            console.log(rows);
        })
        .catch((errMsg) => {
            res.send(tmp1 + title + errMsg + tmp2);
        });
});

app.get('/get/:no', (req, res) => {
    title = `<h2>샘플 상세보기</h2>`;
    let body = "";
    dbCon.getSample(req.params.no)
        .then((row) => {
            console.log(row);
            row.forEach((item) => {
                body = `<p>no : ${item.NO}, name : ${item.NAME }</p>`;
              });
            res.send(tmp1 + title + body + tmp2);
        })
        .catch((errMsg) => {
            res.send(errMsg);
        });
});

app.get('/addSample', (req, res) => {
    res.sendFile(__dirname + "/sampleForm.html");
});

app.post('/addSamplePro', (req, res) => {
    const { no, name } = req.body;
    // 가져온 데이터를 sample 객체에 저장
    const sample = { no, name };
    console.log(no);
    console.log(name);
    dbCon.addSample(sample)
        .then((msg) => {
            console.log(msg);
        })
        .catch((errMsg) => {
            console.log(errMsg);
        });
    res.sendFile(__dirname + "/sampleMain.html");
});

let port = 4000;
app.listen(port, () => {
    console.log(`Sever Starting on ${port}`);
});