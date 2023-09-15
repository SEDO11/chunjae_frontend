import React, { useState } from 'react'

const Test2 = () => {
    const [form, setForm] = useState({
        username : '',
        msg : ''
    })
    const {username, msg} = form // 폼 객체 분리

    // 이벤트 기술
    const onChange = (e) => {
        setTimeout(()=> console.log(e), 500)
        const nextForm = { // form 객체
            ...form,
            [e.target.name] : e.target.value
        }
        setForm(nextForm)
    }
    const onClick = () => {
        alert(`당신의 이름 : ${username}, 메세지 : ${msg}`)
        setForm({
            username : '',
            msg : ''
        })
    }
    const onKeyPress = (e) => {
        if(e.key === 'Enter') { // enter를 누르면 이벤트 발생, 트리거
            onClick()
        }
    }
  return (
    <div className='App'>
        <h1>복수(여러개)의 컨트롤 이벤트</h1>
        <input type='text' name='username' placeholder='유저 이름' 
            value={username} onChange={onChange} />
        <input type='text' name='msg' placeholder='메세지' value={msg} onChange={onChange} onKeyPress={onKeyPress}/>
        <button onClick={onClick}>확인</button>
    </div>
  )
}

export default Test2