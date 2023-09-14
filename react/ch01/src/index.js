import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Test1 from './Test1';
import Test2 from './Test2';
import Test3 from './Test3';
import Test4 from './Test4';
import Test5 from './Test5';
import Test6 from './Test6';
import Test7 from './Test7';
import Test8 from './Test8';

// 실제 구동 파일
// app.js 파일을 여기에서 출력한다.
// 컴포넌트를 추가하면 해당 화면에 보여준다.
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
    <Test1 /> 
    <Test2 />
    <Test3 />
    <Test4 />
    {/* 입력 값 */}
    <Test5 irum="강감찬" age="26" addr="서울시 동작구" />
    <Test5 irum="이순신" age="41" gender="남자" />
    <Test5 age="78" gender="여자" />
    <Test6 irum="김철수" age="19" addr="경기도 하남시" />
    <Test7 irum="홍진호" age="33" addr="경기도 부평시" />
    <Test8 />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
