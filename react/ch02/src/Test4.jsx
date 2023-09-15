import React, { Component } from 'react'
import './Test4.css'

// fcc
class Test4 extends Component {
    input = React.createRef() // ref 생성
    state = {
        pw : '',
        clicked : false,
        validated : false
    }
    handleChange = (e) => {
        this.setState({
            pw:e.target.value
        })
    }
    handleButtonClick = (e) => {
        this.setState({
            clicked : true,
            validated : this.state.pw === '1234'
        })
        this.input.current.focus() // focus()
    }
  render() {
    return (
        <div className='App'>
            <h2>폼 검증 ref</h2>
            <input type="password" value={this.state.pw} ref={this.input} onChange={this.handleChange}
            className={
                this.state.clicked 
                ? this.state.validated // true 
                    ? "success" // true
                    : "failure" // false
                : "" // false
            } />
            <button onClick={this.handleButtonClick}>검증</button>
        </div>
    )
  }
}

export default Test4
