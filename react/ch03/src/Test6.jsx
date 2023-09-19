//useMemo : 컴포넌트에서 활용한 데이터를 메모리에 저장에 두었다가 동일한 입력이 들어오면,
//재활용할 수 있도록 해주는 훅(hook)
import React, { useMemo, useEffect, useState } from 'react'
const Test6 = () => {
    const [ number, setNumber ] = useState(0); // 기본값 0
    const [ isKorea, setIsKorea ] = useState(true); // 기본값 true
    const location = useMemo(() => {
        return { country : isKorea ? '대한민국' : '하와이' }
    }, [isKorea]) //[] 안에 기재된 내용은 항상 기억이 되어 반복 사용이 가능하도록 함.
    useEffect(() => {
        console.log('useEffect... 호출');
    }, [location])
    return (
        <div>
            <header>
                <h2>하루에 몇 끼 드세요?</h2>
                <input type="number" value={number} onChange={(e) => 
                    setNumber(e.target.value)}/>
                <hr />
                <h2>어느 나라에 계세요?</h2>
                <p>국가 : {location.country}</p>
                <button onClick={() => setIsKorea(!isKorea)}>갱신</button>
            </header>
        </div>
    )
}
export default Test6