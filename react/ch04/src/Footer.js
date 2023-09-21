import React from 'react'
import './Footer.scss'

const Footer = () => {
  return (
    <div>
      <div class="vstack gap-3">
        <div class="bg-light border">First item</div>
        <div class="bg-light border">Second item</div>
        <div class="bg-light border">Third item</div>
        <nav class="navbar navbar-light bg-light">
          <div class="container-fluid">
            <a class="navbar-brand" href="#">Navbar</a>
          </div>
        </nav>

        <nav class="navbar navbar-light bg-light">
          <div class="container-fluid">
            <span class="navbar-brand mb-0 h1">Navbar</span>
          </div>
        </nav>
      </div>

      <div class="container">

      </div>
    </div>
  )
}

export default Footer