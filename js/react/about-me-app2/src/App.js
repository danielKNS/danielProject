import React, { useState } from 'react'
import './App.css';

const initialTodos = [
  { id: 1, text: "Take out trash and recycling", complete: true, },
  { id: 2, text: "Pick up dry cleaning", complete: false },
  { id: 3, text: "Get oil change", complete: false },
  { id: 4, text: "Write thank-you notes", complete: false },
];

const App = () => {

  const [todos, setTodos] = useState(initialTodos)
  const [hideItems, setHideItems] = useState(false)

  const handleItemClick = (clickedTodo) => {
    const newTodos = todos.map(todo => {
      if (todo.id === clickedTodo.id) {
        return {
          ...todo,
          complete: !todo.complete
        }
      }
      return todo
    })

    setTodos(newTodos)
  }

  const handleNewTodo = (e) => {
    if (e.key === "Enter") {
      const newTodo = {
        id: todos.at(-1).id + 1,
        text: e.target.value,
        complete: false
      }
  
      setTodos((previousState) => [
        ...previousState,
        newTodo
      ])
      e.target.value = ""
    }
  }

  const handleButtonClick = () => {
    setHideItems((previousState) => !previousState)
  }

  const itemsRemaining = todos.filter(todo => todo.complete === false).length
  
  return (
    <div className="app">
      <h1>Things to do</h1>
      <div id="main-todo-list" className="todo-list">
        {todos.map(todo => !(hideItems && todo.complete) && ( // if hide items is true and the item is completed, hide it
          <div key={todo.id} className={todo.complete ? "todo complete" : "todo"} onClick={() => handleItemClick(todo)} >
            <img key={todo.id} src={"dogProfile.jpeg"}></img>
            <input 
              type="checkbox" 
              className="todo-checkbox" 
              checked={todo.complete}
              readOnly={true}
            />
            <span className="todo-text" >{todo.text}</span>
          </div>
        ))}
      </div>
      <input type="text" placeholder="New Task" onKeyDown={handleNewTodo} />
      <p><span id="remaining-count">{itemsRemaining}</span> items remain</p>

      <button onClick={handleButtonClick}>{hideItems ? "Show completed items" : "Hide Completed items"}</button>
    </div>
  );
}

export default App;