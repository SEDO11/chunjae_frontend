import React from 'react'
import { Outlet, useNavigate } from 'react-router-dom'
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';

const Layout = () => {
    const navigate = useNavigate();
    const goBack = () => { navigate(-1);}
    const goHome = () => { navigate('/', {replace: true})}
    const goArticles = () => { navigate('/Articles', {replace:true})}
    const goLogin = () => { navigate('/Login', {replace:true})}
    const goMyPage = () => { navigate('/MyPage', {replace:true})}
  return (
    <div>
      <Navbar expand="lg" bg="primary" data-bs-theme="dark" className="bg-body-tertiary">
        <Container>
          <Navbar.Brand onClick={goHome}>React-Bootstrap</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link onClick={goHome}>홈</Nav.Link>
              <Nav.Link onClick={goBack}>뒤로가기</Nav.Link>
              <NavDropdown title="게시판" id="basic-nav-dropdown">
                <NavDropdown.Item onClick={goArticles}>게시판</NavDropdown.Item>
              </NavDropdown>
            </Nav>
            <Nav>
            <Nav.Link onClick={goLogin}>로그인</Nav.Link>
            <Nav.Link onClick={goMyPage}>마이페이지</Nav.Link>
          </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      <main>
        <Outlet/>
      </main>
    </div>
    
    // <div>
    //     <header style={{background:'#aaa', padding:20, fontSize:30 }}>
    //         <button onClick={goBack}>뒤로가기</button>
    //         <button onClick={goHome}>홈</button>
    //         <button onClick={goArticles}>게시판</button>
    //     </header>
    //     <main>
    //         <Outlet/> {/** 태그 내의 정보를 출력 */}
    //     </main>
    // </div>
  )
}

export default Layout