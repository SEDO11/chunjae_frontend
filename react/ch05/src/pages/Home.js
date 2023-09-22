import React from 'react'
import {Link} from 'react-router-dom'

const Home = () => {
  return (
    <div>
        <h2>Home</h2>
        <hr/>
        <ul>
            <li>
                <Link to='/about'>Intro</Link>
            </li>

            {/* 데이터를 전송할 때에는 콜론은 안쓰고 값만 기입 */}
            <li>
                <Link to='/profile/sangmin'>Sangmin</Link>
            </li>
            <li>
                <Link to='/profile/yeun'>Yeun</Link>
            </li>
            <li>
                <Link to='/profile/sehoon'>Sehoon</Link>
            </li>
        </ul>
    </div>
  )
}

export default Home