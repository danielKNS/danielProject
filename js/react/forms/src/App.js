import React, { useState } from 'react'
import './App.css';

const App =() => {

  const [fistName,setFistName] = useState("Daniel")
  const [lastName,setLastName] = useState("Ribeiro")

  const [fullName, setFullName] = useState(fistName + " " + lastName)

 

  const handleFistNameChange = (e) => {
    setFistName(e.target.value)
  }

  const handleLastNameChange = (e) => {
    setLastName(e.target.value)
  } 


  const handleSubmit = (e) => {
    e.preventDefault()
    console.log("im being submited with event :")
    setFullName(fistName + " " + lastName)
  } 

  return (
    <div className="App">
      <h1> this is my form!</h1>

      <form onSubmit={handleSubmit}>
        <p>First Name</p>
        <input type={"text"}  onChange={handleFistNameChange}/>


        <p>last name </p>
        <input type={"text"} onChange={handleLastNameChange}/>

        <div>
          <button>Click me </button>
        </div>
      </form>
      <div>
        <p>My name is {fullName}</p>
      </div>


    </div>
  );
}

export default App;
