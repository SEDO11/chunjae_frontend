// 테스트1 컴포넌트 생성, 이름은 대문자로 생성

import './App.css';

function Test1() {
    const name = "홍길동";
    const param = undefined;
    const style = {
        backgroundColor: "deeppink",
        color: "while",
        fontSize: "32px",
        fontWeight: "900",
        padding: "10px",
    }
    return (
      <div className="App">
        {/* 표현식, if, or 연산  */}
        <h2 className="title">{name} Hello Test1</h2> 
        <h3 className="item_tit">{name === '홍길동' ? '천재' : '바보'}</h3> 
        <h4 className='cate_tit'>{param || <span>천재</span>}</h4>
        
        {/* 내부 스타일링 */}
        <p style={style}> 내부 스타일 방식 </p>

        {/* 인라인 스타일링 */}
        <div style={{
            backgroundColor : "deepskyblue",
            color:"white",
            fontSize:"20px"
        }}>{name} 인라인 스타일 방식</div>
        <p className='comment'>안녕하세요~! Test1 입니다~!</p>
      </div>
    );
  }
  
  export default Test1;