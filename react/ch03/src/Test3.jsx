import React, {useRef, useState} from 'react'
// useRef 렌더링 하지 않는 객체를 사용할 때 이용
// set이 존재하지 않고 자체가 객체이다.
// 프로그램 상에서 데이터 공유할 때 많이 씀

const Test3 = () => {
    const korScore = useRef(0);
    const [engScore, setEngScore] = useState(0);
    const onUseRef = (e) => {
        korScore.current += 10;
        console.log(`국어 : ${korScore.current}`)
    }
    const onUseState = (e) => {
        setEngScore(engScore+10)
        console.log(`영어 : ${engScore}`)
    }
  return (
    <div className='App'>
        <button onClick={onUseRef}>useRef</button>
        <button onClick={onUseState}>useState</button>
        <hr/>
        <h2>{`국어 : ${korScore.current}`}</h2>
        <h2>{`영어 : ${engScore}`}</h2>
    </div>
  )
}

export default Test3