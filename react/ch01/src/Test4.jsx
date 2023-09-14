// 클래스 형태로 선언
// 옛날에 사용하던 방식

import { Component } from "react";
import Test1 from "./Test1";

// Component 상속
class Test4 extends Component {
    render() {
        return(
            <div className="App">
                <Test1 />                
            </div>
        );
    }
}

export default Test4;