import React from 'react';
import logo from './logo.svg';
import './App.css';


// You can return JSX elements and the entire componets

// const renderFaveMusic = (faveMusic) => {
//   let musicParagraph;
//   if (faveMusic === "peace") {
//     musicParagraph = <p> Peace is awesome</p>;
//   } else if (faveMusic === "house") {
//     musicParagraph = <p>House is better </p>;
//   } else {
//     musicParagraph = <p>I guess country it is....</p>;
//   }
//   return musicParagraph;
// }

// const App = () => {
//   const faveMusic = "peace";
//   return (
//     <div>
//       <div className="header-div">
//         <h1 style={{color: "Green"}}>Practice on Conditional Rendering : </h1>
//       </div>
//       <div id="name-div">
//         I am red
//       </div>
//       <div>
//         {renderFaveMusic(faveMusic)}
//       </div>
//     </div>
//   )
// }

//inline If with Logical && Operators:

// If the condition is true the element right after && will appear in the output. If it is false, React will ignore and skip it.

// const App =() => {
// {
//     return(<div>
//             {
//                 (10 > 5) && alert("This alert will be shown! IF it show IT WORKS YAY")
//             }
//            </div>
//         );
// }
// }

const name = 'Lucas';

const App = () => {
  const isBusy = false;
  // keep everything the same
  <div>
    Name: { name ? name : 'not provided'}
  </div>
}





export default App;
