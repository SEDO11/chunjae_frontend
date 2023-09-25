import './App.css';
import TodoTemplate from './TodoTemplate';
import TodoList from './TodoList';
import TodoListItem from './TodoListItem';
import TodoInsert from './TodoInsert';
import {useState} from 'react';

function App() {
  // 할 일 목록 데이터 및 관련 함수들을 설정하세요.
  const [todos, setTodos] = useState([]);
  const [input, setInput] = useState('');

  // Todo 추가 함수
  const onInsert = text => {
    if (text.trim() === '') return; // 빈 문자열은 추가하지 않음

    const newTodo = {
      id: new Date().getTime(), // 고유한 ID 생성
      text,
      checked: false, // 체크 상태 초기값은 false
    };

    setTodos([...todos, newTodo]);
    setInput(''); // 입력값 초기화
  };

  // Todo 삭제 함수
  const onRemove = id => {
    const updatedTodos = todos.filter(todo => todo.id !== id);
    setTodos(updatedTodos);
  };

  // Todo 완료/미완료 토글 함수
  const onToggle = id => {
    const updatedTodos = todos.map(todo =>
      todo.id === id ? { ...todo, checked: !todo.checked } : todo
    );
    setTodos(updatedTodos);
  };

  return (
    <div className="App">
      <TodoTemplate>
        <TodoInsert onInsert={onInsert} />
        <TodoList todos={todos} onRemove={onRemove} onToggle={onToggle} />
      </TodoTemplate>
    </div>
  );
}

export default App;
