import React, { useState } from 'react'
// import React from 'react'
import './App.css';

// // funtional component needs to return jxs and are allowed to use hooks
const App = () => {

    // let myName = "daniel2"


// //  if (myName === "daniel") {
// //   return (
// //   <div>
// //     <h1> hi daniel </h1>
// //   </div>
// //   )
// //   } else {  
// //     return null
// //   }
// // }

// // return myName === "daniel" && (
// //   <div>
// //     <h1> hi daniel </h1>
// //   </div>
// // )




  const people = [
    {
      name: "Daniel"
    },
    {
      name: "Victoria"
    },
    {
      name: "Emre"
    }
  ]

  const [myName, setMyName] = useState("daniel") // Hook
  const [myPeople, setMyPeople] = useState(people)

  const handleButtonClick = () => {
    console.log(" I WAS CLICKED!!!!")
    // myName = "Another name"
    if (myName === "daniel") {
      setMyName("Another name")
    } else {
      setMyName("daniel")
    }

  }
  console.log("my name: ", myName)

  return (
    <div>
      {/* <h1>Hello there</h1>
      {myName === "Lucas" && (
        <div>
          <p>This person's name is Lucas!!!</p>
          <p>asdasdasd</p>
        </div>
      )}
      {myName.length === 5 ? (
        <div>
          <p>This name has a length of 5</p>
        </div>
      ) : (
        <div>
          <p>The length of this name is NOT 5</p>
        </div>
      )} */}
      <p>My name is: {myName}</p>
      <p>My people are: {myPeople.map(person => (
        <div>Person's name: {person.name} </div>
      ))}</p>

      <p>Here's daniel....{myPeople.find(person => person.name === "Daniel").name}</p>
      <button onClick={handleButtonClick}>Click me!</button>
    </div>
  )
}


// // class componets return jxs your not allowed to use hooks
// class App extends React.Component{

//   constructor(){
//    super()
//    this.state = {myName: "daniel"}
//     }

// render(){
//     return(
//         <div>
//             <h1>hello there</h1>
//             {this.state.myName === "daniel" && (
//             <div>
//                 <p>this person name is daniel</p>
//             </div>
//         )}
//         {this.state.myName.length === 5 ? (
//             <div>
//                 <p>this name has length of 5 </p>
//             </div>
//         ) : (
//             <div>
//                 <p> the length of this name is NOT 5</p>
//             </div>
//         )}
//         </div>
//     )
// }
// }
export default App;
