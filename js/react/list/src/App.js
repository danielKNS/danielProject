import React from 'react'
import './App.css';

const App =() => {

  let todoTask = [
    {id: 1, text: "Take out trash and recycling", complete: true},
    {id: 2, text: "Pick up dry cleaning", complete: false},
    {id: 3, text: "Get oil change", complete: false},
    {id: 4, text: "Write thank-you notes", complete: false},
    {id: 5, text: "Take a walk", complete: false},
  ];
  console.log("todoTask", todoTask)

   const handleClick = () => {
     console.log("i am being Clicked")
   }

  return (
    <div>
      <div>
      <title>Things to do (JavaScript)</title>
  </div>
  <body>
    <div class="app">
      <h1>Things to do</h1>

      <div id="main-todo-list" class="todo-list"
      onClick={() => handleClick ()}
      >
        <div className="todo">
          <input type="checkbox" class="todo-checkbox" />
          <span class="todo-text">{todoTask[0].text} </span>
        </div>
        <div className="todo">
          <input type="checkbox" class="todo-checkbox" />
          <span class="todo-text"> {todoTask[1].text}</span>
        </div>
        <div className="todo">
          <input type="checkbox" class="todo-checkbox" />
          <span class="todo-text"> {todoTask[2].text} </span>
        </div>
        <div className="todo">
          <input type="checkbox" class="todo-checkbox" />
          <span class="todo-text">{todoTask[3].text} </span>
        </div>
        <div className="todo">
          <input type="checkbox" class="todo-checkbox" />
          <span class="todo-text">{todoTask[4].text} </span>
        </div>
      </div>
        
      <input type="text" placeholder="New todo"/>
      <p><span id="remaining-count">0</span> items remain</p>
    </div>
    <script src="script/todo.js"></script>
  </body>
      </div>
  );
}

export default App;
