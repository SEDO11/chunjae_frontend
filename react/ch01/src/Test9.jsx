import React, {useState} from 'react'

const Test9 = () => {
    const [message, setMessage] = useState('')
    // 이벤트
    const onClickEnter = ()=> setMessage("안녕")
    const onclickLeave = () => setMessage("잘가")
    const [color, setColor] = useState('black')
  return (
    <div className='App'>
        <hr/>
        <button onClick={onClickEnter}>입실</button>
        <button onClick={onclickLeave}>퇴실</button>
        <hr/>
        <h1 style={{color}}>{message}</h1>
        <button onClick={()=>setColor('gold')}>금</button>
        <button onClick={()=>setColor('silver')}>은</button>
        <button onClick={()=>setColor('brown')}>동</button>
    </div>
  )
}

export default Test9