// 구조 분리
const Test6 = (props) => {
    const {irum, age, addr} = props;
  return (
    <div className="App">
        <h2 className="item_tit">Test6</h2>
        <h2>저의 이름은 {irum} 입니다.</h2>
        <h2>나이는 {age} 세 입니다.</h2>
        <h2>주소는 {addr} 입니다.</h2>
    </div>
  )
}

export default Test6