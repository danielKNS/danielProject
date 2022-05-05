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
      completed: false,
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
      completed: false,
      completeStatus:"todo"
    }
  ]); 
  // const event = { // look back in objects 
  //   target: {
  //     value:" hi "
  //   }
  // }
  // 
  //----------------------------------------------------//
  const [testId,setTestId] = useState("")
  const [completetask,setCompletetask] = useState("") // is a hook fuction from react to create state varible
  const [taskRemain,setTaskRemain] = useState(todoTask.length)
  const handleClick = (task,e) => {
    console.log("e",e)
    console.log("Task Selected:",task)
    const todoStatus = task.completed
    console.log("Todo is : ",todoStatus)//  show which task is being selected and is checking if the complete is true or False 
    if (todoStatus === true){
      const newTask = todoTask.map(todo => {
        if (todo.id === task.id){
        return {...setCompletetask(todo, todo.completed = false ,todo.completeStatus = "todo")}
      }
      return todo
    });
    setTestId(newTask)

    const taskRemaining = newTask.filter(todo => todo.completed === false).length 
    console.log("Tasks Remaining :",taskRemaining)
    setTaskRemain(taskRemaining)

  }else if (todoStatus === false){
    const newTask = todoTask.map(todo => {
      if (todo.id === task.id){
      return{...setCompletetask(todo, todo.completed = true ,todo.completeStatus = "todo complete")}

    }
    return todo
  });
  setTestId(newTask)
  
  const taskRemaining = newTask.filter(todo => todo.completed === false).length
  console.log("Tasks Remaining :",taskRemaining)
  setTaskRemain(taskRemaining)
}
  
}
// fix remain, allow to add more task, do the checkbox and finally remove the ones that are done.

 return (
  <div>

      <div className="app"/>
        <h1>Things to Do : </h1>
        {todoTask.map((task) => <div id="main-todo-list"  className="todo-list"
        key={task.id} onClick={(e)=> handleClick (task,e)}     // i just want to know which task is being selected. Also the "task" is each individual of the objects.
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
  
//  use the id  .map .filter .id .find
  // on line 53 i am mapping through all the task(array of object) 

  // the first need to be checked completed 
  //.map .filter .find