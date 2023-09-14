// 클래스 형의 state(상태 정보)
import { Component } from "react"

class Test8 extends Component {
  // 생성자 생성
  constructor(props) {
    super(props);
    this.state = {
      number: 0
    }
  }
  render() {
    const {number} = this.state;
    return (
      <div className="App">
          <h2>{number}</h2>
          <button onClick={()=> this.setState({number:number+1})}>증가</button>
          <button onClick={()=> this.setState({number:number-1})}>감소</button>
      </div>
    )
  }
}

export default Test8