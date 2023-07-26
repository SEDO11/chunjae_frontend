var btn1 = document.getElementById("btn1")
var btn2 = document.getElementById("btn2")
var btn3 = document.getElementById("btn3")
var btn4 = document.getElementById("btn4")
var btn5 = document.getElementById("btn5")
var btn6 = document.getElementById("btn6")
var btn7 = document.getElementById("btn7")
var btn8 = document.getElementById("btn8")
var btn9 = document.getElementById("btn9")

var res = document.getElementById("res")
var html = ""

function objectInfo() {
    for(var key in location) {
        html += "<p>" + key+" : "+location[key] + "</p>"
    }
    res.innerHTML = html
}

function historyInfo() {
    for(var key in history) {
        html += "<p>" + key+" : "+history[key] + "</p>"
    }
    res.innerHTML = html
}

// 현재 url 출력후 특정 url로 이동
function urlInfo() {
    html += "<p>" + location.href + "</p>"
    res.innerHTML = html
    setTimeout(function() { // 일정시간 딜레이 후 해당 함수를 실행
        /*
        href 는 속성이기에 값을 대입해주는 형식으로 사용
        뒤로가기는 가능하다.
        */
        location.href = "https://www.naver.com"
    }, 2000) // 2초
}

btn1.addEventListener("click", function() {
    objectInfo()
})

btn2.addEventListener("click", function() {
    urlInfo()
})

btn3.addEventListener("click", function() {
    location.reload() // f5, 새로 고침
})

btn4.addEventListener("click", function() {
    /*
    replace는 메소드 이기에 매개변수를 넣어서 사용
    뒤로가기는 불가능 하다
    */
    location.replace('https://www.naver.com')
})

btn5.addEventListener("click", function() {
    // 뒤로가기 가능한 사이트 이동 메소드
    location.assign('https://www.daum.net')
})

btn6.addEventListener("click", function() {
    historyInfo()
})

btn7.addEventListener("click", function() {
    history.back() // 뒤로가기
})

btn8.addEventListener("click", function() {
    history.forward() // 앞으로 가기
})

btn9.addEventListener("click", function() {
    /*
    원하는 곳으로 가기
    ...
    -2 : 두 단계 뒤로
    -1 : 한 단계 뒤로
    0 : 변화 없음
    1 : 한 단계 앞으로
    2 : 두 단계 앞으로
    ...
    */
    history.go(2) // 원하는 곳으로 가기
})

for(var key in location) {
    console.log(key+" : "+location[key])
}

function moving() { // select안의 option 값이 변할 경우 해당 사이트 이동
    var sel = document.getElementById('sel')
    var url = sel.value
    if(url != "") {
        location.assign(url)
    }
}