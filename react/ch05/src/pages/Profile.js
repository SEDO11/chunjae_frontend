import React from 'react'
import { useParams } from 'react-router-dom'
import sang from '../img/sangmin.jpg'
import ye from '../img/yeun.jpg'
const Profile = () => {
    const data = {
        sangmin: { // profile 
            name:'이상민', // profile.name
            desc: '프론트 엔드를 좋아함', // profile.desc
            src: sang,
        },
        yeun: { // profile 
            name:'신예은', // profile.name
            desc: '백 엔드를 좋아함', // profile.desc
            src: ye,
        },
    }
    const params = useParams()
    const profile = data[params.username]; // data 에서 해당 params.username(키)와 일치하는 객체를 찾음
  return (
    <div>
        <h2>Profile</h2>
        {profile ? (
            <div>
                <h2>{profile.name}</h2>
                <p>{profile.desc}</p>
                <img src={profile.src} className='image'/>
            </div>
        ) : (
            <p>존재하지 않습니다.</p>
        )}
    </div>
  )
}

export default Profile