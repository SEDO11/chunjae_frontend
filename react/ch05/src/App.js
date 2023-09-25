import React, {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import './App.css';
import Home from './pages/Home';
import About from './pages/About';
import Profile from './pages/Profile';
import Layout from './Layout';
import Articles from './pages/Articles';
import Article from './pages/Article';
import Login from './pages/Login';
import MyPage from './pages/MyPage';
import NotFound from './pages/NotFound';

import 'bootstrap/dist/css/bootstrap.min.css';
import Container from 'react-bootstrap/esm/Container';
import './css/App.sass';

function App() {
  return (
    <Container>
      <Router>
        <Routes>
          <Route path='/' element={<Layout />}> {/** Layout 에서 안의 모든 정보를 표시 */}
            <Route index element={<Home/>}/> {/** 인덱스 지정 */}
            <Route path="/about" element={<About/>} /> {/** about 사이트 이동 */}
            <Route path="/profile/:username" element={<Profile/>} /> {/** profile username */}
            <Route path='/articles' element={<Articles />}>
              <Route path=':id' element={<Article />}/>
            </Route>
            <Route path="/login" element={<Login />} />  
            <Route path="/mypage" element={<MyPage />} />
            <Route path="*" element={<NotFound />} />  
          </Route>
        </Routes>
      </Router>
    </Container>
  );
}

export default App;
