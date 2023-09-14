import "./App.css";

const Test3 = () => {
    const season = ["봄", "여름", "가을", "겨울"];

  return (
    <div className="App">
      <h2 className="item_tit">Test3</h2>
      <ul>
        {season.map((element, index) => (
          <li>{element}</li>
        ))}
      </ul>
    </div>
  )
}

export default Test3