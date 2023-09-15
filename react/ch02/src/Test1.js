// 이벤트 : 사용자가 특정 요소를 건드리는 사건
// 이벤트의 종류 : Mouse, Keyboard, Form, Touch, Image, Video, File
// React는 개체에 따라서 많은 이벤트를 지원

import React, {Component} from 'react'

class Test1 extends Component {
    state = {msg : ''}
    render() {
        return (
            <div className='App'>
                <h1>이벤트</h1>
                <input type='text' name='msg' placeholder='메세지 입력' value={this.state.msg} onChange={(e)=>{
                    // console.log(e)
                    // console.log(e.target.value) // 값 출력
                    this.setState({msg : e.target.value})
                }} />
                <button onclick={()=> {
                    this.setState({msg:''})
                }}>지우기</button>

                <button onClick={()=>{
                    alert(this.state.msg)
                }}>확인</button>
            </div>
        )
    }

}

export default Test1