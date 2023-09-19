// 현재 상태 변수인 state 객체와 행동, 객체를 인자로 받아서 새로운 상태를 반환하는 훅
// useState 보다 더 복잡하고, 다양한 변수나 객체를 관리
import React, {useReducer} from 'react'

const Test7 = ({step=1, min=0, max=10}) => { // props
    const initState = {count : 0}
    const reducer = (state, action) => {
        switch(action.type) {
            case "COUNTUP": // 증가
                return state.count < action.max ? {count: state.count + action.step} : state.count;
            case "COUNTDOWN": // 감소
                return state.count > action.min ? {count: state.count - action.step} : state.count;
            case "RANDOM": // 랜덤 난수
                return {
                    count : Math.floor(Math.random() * (action.max - action.min)) + action.min
                }
            case "RESET": // 리셋
                return initState;
            default : // 그 이외의 값, 에러
                throw new Error(`action.type 에러 ${action.type}`);
        }
    }
    return (
        <div>
            <p>단계 : {step}, 최대 : {max}, 최소 : {min}</p>
            <h2>현재 값 : {}</h2>
            <hr/>
            <button onClick={()=>{dispatchEvent({type:"COUNTUP", step, max})}}>증가</button>
            <button onClick={()=>{dispatchEvent({type:"COUNTDOWN", step, min})}}>감소</button>
            <button onClick={()=>{dispatchEvent({type:"RANDOM", min, max})}}>랜덤</button>
            <button onClick={()=>{dispatchEvent({type:"RESET"})}}>초기화</button>
        </div>
    )
}

export default Test7