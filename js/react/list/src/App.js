import React, { useState } from 'react'
import './App.css';

const  App= ()  => {
  const [todoTask, setTodoTask] = useState([ // state varible
    {
      id: 1,
      text: "Take out trash and recycling",
      completed: true,
      
    },
    {
      id: 2,
      text: "Pick up dry cleaning",
      completed: false
    },
    {
      id: 3,
      text: "Get oil change",
      completed: false
    },
    {
      id: 4,
      text: "Write thank-you notes",
      completed: false
    },
    {
    id: 5,
      text: "Take a walk",
      completed: false
    }
  ]);
  console.log("task",todoTask)

  //----------------------------------------------------

  // i need to to something here where you know the guy that was clicked and the event to know whether it was CHEACKED or UNCHECKED.
  //and then you need to be able to re-render state 

  

  const handleClick = (task) => {
    console.log("i am being Clicked")
    console.log("Task Selected:",task)
    const todoStatus = task.completed
    console.log("Todo is : ",todoStatus) //  show which task is being selected and is checking if the complete is true or False.
  }
  
  return (
  <div>

      <div className="app"/>
        <h1>Things to Do : </h1>
        {todoTask.map((task) => <div id="main-todo-list"  className="todo-list" key={task.id}
        onClick={()=> handleClick(task)}      // i just want to know which task is being selected. Also the "task" is each individual of the objects.
        >
        <div className="todo">
          <input type="checkbox" className="todo-checkbox"/>
          <span className="todo-text"> {task.text} </span>
          <div ></div>
        </div>
          </div>
        )}
      <input type ="text" placeholder="Add more Task "/>
      <p><span id="remaining-count">0</span> Task remaining</p>
        <script src="script/todo.js"></script>
      
  </div>)
  }
  
  export default App;
  

  // on line 53 i am mapping through all the task(array of object) 

  // the first need to be checked completed 