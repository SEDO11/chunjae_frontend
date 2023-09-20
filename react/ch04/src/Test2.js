import React from 'react'

const Test2 = () => {
  const generateSnowflakes = () => {
      const snowflakes = [];
      for (let i = 0; i < 500; i++) { // 몇개의 눈을 보여줄 건지 확인
          snowflakes.push(<div key={i} className='snow'></div>);
      }
      return snowflakes;
  };

  return (
      <div>
          {generateSnowflakes()}
      </div>
  );
};

export default Test2