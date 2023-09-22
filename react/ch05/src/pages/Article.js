import React from 'react'
import { Outlet, useParams } from 'react-router-dom'

const Article = () => {
    const {id} = useParams()
    return (
        <div>
            <h2>게시글 {id} 번째 제목</h2>
            <p>게시글 {id} 번째 글의 내용입니다.</p>
        </div>
  )
}

export default Article