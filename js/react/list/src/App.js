import React, { useState } from 'react'
import './App.css';

const  App= ()  => {
  const [todoTask, setTodoTask] = useState([ // state varible
    {
      id: 1,
      text: "Take out trash and recycling",
      completed: true,
      completeStatus:"todo complete"
      
    },
    {
      id: 2,
      text: "Pick up dry cleaning",
      completed: true,
      completeStatus:"todo"
    },
    {
      id: 3,
      text: "Get oil change",
      completed: false,
      completeStatus:"todo"
    },
    {
      id: 4,
      text: "Write thank-you notes",
      completed: false,
      completeStatus:"todo"
    },
    {
    id: 5,
      text: "Take a walk",
      completed: true,
      completeStatus:"todo"
    }
  ]);
  console.log("task",todoTask)

  //----------------------------------------------------

  // 
  const [completetask,setCompletetask] = useState("")
  const handleClick = (task) => {
    console.log("i am being Clicked")
    console.log("Task Selected:",task)
    const todoStatus = task.completed
    console.log("Todo is : ",todoStatus)//  show which task is being selected and is checking if the complete is true or False
    const todo = todoTask 
    todo.forEach(todo => {
      if (todo.completed === true){
        setCompletetask(todo.completeStatus = "todo complete")
      
      }else if(todo.completed === false) {
        return setCompletetask (todo.completeStatus = "todo")

      }
    })
  
  
}

// i having a problem of crossing the line everytime the checked box is being clicked.
// i tried using if staments but i think i am missing something.
// i am using className but is not working.
// i the problem is from .map(line 54)

  return (
  <div>

      <div className="app"/>
        <h1>Things to Do : </h1>
        {todoTask.map((task) => <div id="main-todo-list"  className="todo-list" key={task.id}
        onClick={()=> handleClick(task)}     // i just want to know which task is being selected. Also the "task" is each individual of the objects.
        >
        <div className={task.completeStatus}>
          <input type="checkbox"  className="todo-checkbox" />
          <span className="todo-text"> {task.text}  </span>
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
  //.map .filter .find