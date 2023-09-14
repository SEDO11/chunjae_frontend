import "./App.css";

const Test5 = (props) => {
  return (
    <div className="App">
        <h2 className="item_tit">Test 5</h2>
        <h2>저의 이름은 {props.irum}</h2>
        <h2>나이는 {props.age} 세 입니다.</h2>
        <h2>사는 곳은 {props.addr} 입니다.</h2>
        <h2>성별은 {props.gender} 입니다.</h2>
    </div>
  )
}

// 기본값
Test5.defaultProps = {
    irum : '홍길동',
    age : 26,
    addr : '서울시 구로구',
    gender : '남자'
}

export default Test5