import React from 'react'
import { Outlet, useNavigate } from 'react-router-dom'
const Layout = () => {
    const navigate = useNavigate();
    const goBack = () => { navigate(-1);}
    const goHome = () => { navigate('/', {replace: true})}
    const goArticles = () => { navigate('/Articles', {replace:true})}
  return (
    <div>
        <header style={{background:'#aaa', padding:20, fontSize:30 }}>
            <button onClick={goBack}>뒤로가기</button>
            <button onClick={goHome}>홈</button>
            <button onClick={goArticles}>게시판</button>
        </header>
        <main>
            <Outlet/> {/** 태그 내의 정보를 출력 */}
        </main>
    </div>
  )
}

export default Layout