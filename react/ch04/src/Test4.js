import React from 'react'
import Header from './Header'
import Contents from './Contents'
import Footer from './Footer'

// yarn add react-bootstrap bootstrap
import 'bootstrap/dist/css/bootstrap.min.css';
import './Common.scss'

const Test4 = () => {
  return (
    <div className='App'>
        <Header/>
        <Contents/>
        <Footer/>
    </div>
  )
}

export default Test4