import React, {useMemo, useEffect, useState} from 'react'

const Test6 = () => {
  return (
    <div>
        <header>
            <h2>하루에 몇 끼 드세요?</h2>
            <input type='number' value={number} onChange={(e)=> {
                SVGAnimatedNumber(e.target.value)
            }}/>
            <h2>어느 나라에 계세요?</h2>
            <p>국가 : {location.country}</p>
            <button onClick={()=> {setIsKorea(!isKorea)}}>갱신</button>
        </header>
    </div>
  )
}

export default Test6