// 표현식과 내부 스타일링, 인라인 스타일링, 조건 연산자

import "./App.css";

// 애로우 함수로 자동 생성
const Test2 = () => {
    const name = '강감찬';
    const param = undefined;
    const style = {
        color:"gold",
        backgroundColor:"green"
    }
  return (
    <div className="App">
        {/* 표현식, if, or 연산  */}
        <h2 className="title">{name} Hello Test2</h2> 
        <h3 className="item_tit">{name === '강감찬' ? '강감찬 입니다.' : '강감찬이 아닙니다.'}</h3> 
        <h4 className='cate_tit'>{param || <span>Test2</span>}</h4>
        
        {/* 내부 스타일링 */}
        <p style={style}> 내부 스타일 방식 </p>

        {/* 인라인 스타일링 */}
        <div style={{
            backgroundColor : "brown",
            color:"gold",
            fontSize:"5rem"
        }}> 인라인 스타일 방식</div>
        <p className='comment'>안녕하세요~! Test2 입니다~!</p>
    </div>
  )
}

export default Test2