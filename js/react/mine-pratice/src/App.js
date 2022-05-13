import React from 'react';
import './App.css';
import Destructuring from './Destructuring'

const App =() => {
  const friends = [
    {
      name: "Victoria",
      age: 17,
      favoriteColor: 'blue',
      favoriteSport: 'VolleyBall'
    },
    {
      name: "Emre",
      age: 20,
      favoriteColor: 'black',
      favoriteSport: 'soccer'
    },
    {
      name: "Rafael",
      age: 16,
      favoriteColor: 'Purple',
      favoriteSport: 'tennis'
    },
    {
        name: "Pedro",
        age: 12,
        favoriteColor: 'orange',
        favoriteSport: 'bowling'
      }
  ]

  return (
    <div>
  
  <h1>My Friends Informations :</h1>
      {friends.map(Myfriend => (
          <Destructuring
          friend={Myfriend}
          />
      )
      )}</div>
      )
}


export default App;



// const App =() => {

//   let todos = [
//     {id: 1, text: "Take out trash and recycling", complete: true},
//     {id: 2, text: "Pick up dry cleaning", complete: false},
//     {id: 3, text: "Get oil change", complete: false},
//     {id: 4, text: "Write thank-you notes", complete: false},
//     {id: 5, text: "Take a walk", complete: false},
//   ];

//    const handleClick = () => {
//      console.log("i am being Clicked")
//    }

//   return (
//     <div>
//       <div>
//       <title>Things to do (JavaScript)</title>
//   </div>
//   <body>
//     <div class="app">
//       <h1>Things to do</h1>
//       {todos.map((e) => 
//       <div id="main-todo-list" class="todo-list"
//       key={e.id} onClick={()=> handleClick(e.text)}
//       >
//         <div className="todo">
//           <input type="checkbox" class="todo-checkbox" />
//           <span class="todo-text">{e.text} </span>
//         </div>

//       </div>
//       )}
//       <div id="main-todo-list" class="todo-list"
//       >
//         <div className="todo">
//           <input type="checkbox" class="todo-checkbox" />
//           <span class="todo-text">Clean the room </span>
//         </div>
//       </div>
        
//       <input type="text" placeholder="New todo"/>
//       <p><span id="remaining-count">0</span> items remain</p>
//     </div>
//     <script src="script/todo.js"></script>
//   </body>
//       </div>
//   );
// }

// export default App;