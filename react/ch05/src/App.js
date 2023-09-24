import React, {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import './App.css';
import Home from './pages/Home';
import About from './pages/About';
import Profile from './pages/Profile';
import Layout from './Layout';
import Articles from './pages/Articles';
import Article from './pages/Article';

function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Layout />}> {/** Layout 에서 안의 모든 정보를 표시 */}
          <Route index element={<Home/>}/> {/** 인덱스 지정 */}
          <Route path="/about" element={<About/>} /> {/** about 사이트 이동 */}
          <Route path="/profile/:username" element={<Profile/>} /> {/** profile username */}
          <Route path='/articles' element={<Articles />}>
            <Route path=':id' element={<Article />}/>
          </Route>
        </Route>
      </Routes>
    </Router>
  );
}

export default App;
