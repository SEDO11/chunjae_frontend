// 로그인 창 : 아이디와 비밀번호를 입력한 후
// 아이디가 admin 이고, 비밀번호가 1234 인 경우 "로그인 환영" 메세지 출력
// 아니면, "아이디 또는 비밀번호가 일치하지 않습니다." 라는 메시지
// 원래 폼을 다시 로딩 시킴
// 그리고, 성공과 실패시 모두 원래 폼을 초기화 하여 다시 로딩 시킴

import React, {useState} from 'react'

const Test3 = () => {
    const [form, setForm] = useState({
        id : '',
        pw : '',
        chk : '로그인 전',
    })
    const {id, pw, chk} = form // 폼 객체 분리

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
        if(id === 'admin' && pw === '1234') {
            alert(`로그인 환영`)
            setForm({
            id : '',
            pw : '',
            chk : '로그인 확인'
        })
        } else {
            alert('아이디 또는 비밀번호가 일치하지 않습니다.')
            setForm({
                id : '',
                pw : '',
                chk : '로그인 실패'
        })
        }
    }
    const onKeyPress = (e) => {
        if(e.key === 'Enter') { // enter를 누르면 이벤트 발생, 트리거
            onClick()
        }
    }
  return (
    <div className='App'>
        <h1>복수(여러개)의 컨트롤 이벤트</h1>
        <input type='text' name='id' placeholder='유저 이름' 
            value={id} onChange={onChange} />
        <input type='text' name='pw' placeholder='메세지' value={pw} onChange={onChange} onKeyPress={onKeyPress}/>
        <button onClick={onClick}>확인</button>
        <div>{chk}</div>
    </div>
  )
}

export default Test3