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
  const [change,setChange] = useState("")
  const [completetask,setCompletetask] = useState("") // is a hook fuction from react to create state varible
  const [taskRemain,setTaskRemain] = useState("")
  const handleClick = (task,e) => {
    console.log("e",e)
    console.log("Task Selected:",task)//  show which task is being selected and is checking if the complete is true or False 
    const todoStatus = task.completed // assign task.completed to see which one is completed or not (true/ false)
    console.log("Todo is : ",todoStatus) //Line 54 is mapping through all the todoTask(array of object) 
      if (todoStatus === true){
        const newTask = todoTask.map(todo => { 
          if (todo.id === task.id){
            const something = setCompletetask([])
            console.log("something",something)
        setCompletetask(
          todo,
          todo.completed = false,
          todo.completeStatus = "todo")
        }
        return todo //doing .map MUST return after an iteration, EVEN if unchanged.
      });
    setChange(newTask)

    const taskRemaining = newTask.filter(todo => todo.completed === false).length 
    console.log("Tasks Remaining :",taskRemaining)
    setTaskRemain(taskRemaining)

  }else if (todoStatus === false){
    const newTask = todoTask.map(todo => {
      if (todo.id === task.id){
      return{...setCompletetask(
        todo,
        todo.completed = true ,
        todo.completeStatus = "todo complete")}
    }
    return todo
  });
  setChange(newTask) // this will cause the browser to re-render and show the change.
  
  const taskRemaining = newTask.filter(todo => todo.completed === false).length // .filter will return an array tha meet the codition.
  console.log("Tasks Remaining :",taskRemaining)// .lenght the number of array that the filter is returning 
  setTaskRemain(taskRemaining)
  
}
  
}
const handleSubmit = (e) => {
  e.preventDefault()
  console.log("i am being submited by the event:", e)
  const newTodoTask = todoTask[todoTask.length -1]
  console.log("newTask:",newTodoTask.id + 1)

  setTodoTask(
    [
      ...todoTask,
      {
        id:newTodoTask.id +1,
        text:e.target.addMoreTask.value,
        completed: false,
        completeStatus:"todo"
      }
    ]
  )
  e.target.addMoreTask.value = (" ")
  // console.log("id:",newTodoTask.id)
}

const [completedTask,setCompletedTask] = useState("")
const handleClickedCompleted= (e) => {
  console.log("i am being Clicked")
} 


 const defaultchecked = () => {

 }

// fix remain, do the checkbox and finally remove the ones that are done(new array).
// Line 119 is mapping through all the task(array of object) 
 return (
  <div> 

      <div className="app"/>
        <h1>Things to Do : </h1>
        {todoTask.map((task) => <div id="main-todo-list"  className="todo-list"
        key={task.id} onClick={(e)=> handleClick (task,e)} // i just want to know which task is being selected. Also the "task" is each individual of the objects. 
        >
        <div className={task.completeStatus}>
          <input type="checkbox" checked={task.completed} className="todo-checkbox" onChange={defaultchecked}/>
          <span className="todo-text" > {task.text} </span> 
        </div>
          </div>
        )}
        <form onSubmit={handleSubmit}> 
      <input  type="text" name={"addMoreTask"} placeholder="Add more Task "/>
      </form>
      <p><span id="remaining-count">0</span> Task remaining</p>

      <button onClick={(e)=> handleClickedCompleted(e)}>Hide completed Task</button>
  </div>)
}
  
  export default App;
  
//  use the id  .map .filter .find

  // Notes:
//the .map object holds the key value pair and remembers the original insertion order of the keys.any value(both objects and primitive value) may be used as either a key or a value.
//The filter() method creates a new array with all elements that passes the test implemented by the provided function| Returns the elements of an array that meet the condition specified in a callback function.
//(...)Spread operator lets you expand an iterable like an object,string or array into elements.This is very useful when you want to make an exact copy of an existing array.