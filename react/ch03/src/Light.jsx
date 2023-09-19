import React from 'react'

const Light = ({room, on, toggle}) => {
    console.log({room, on})
    return (
        <button onClick={toggle}>
            {room} {on ? "🤨" : "🤪"}
        </button>
    )
}

export default Light