import React from 'react'
import { NavLink, Outlet } from 'react-router-dom'

const Articles = () => {
  return (
    <div>
        <h1>글 목록</h1>
        <ul>
            <ArticleItem id={1} /> <ArticleItem id={2} /> <ArticleItem id={3}/>
        </ul>
        <div>
            <Outlet/>
        </div>
    </div>
  )
}

const ArticleItem = ({id}) => {
    const activeStyle = {color:'blue', fontSize:'24px' }
    return (
        <li>
            <NavLink to={`/articles/${id}`} style={({isActive}) => 
                isActive ? activeStyle : undefined
            }>게시글 {id} 번째</NavLink>
        </li>
    )
}

export default Articles