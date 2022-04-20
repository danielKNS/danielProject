import React from 'react'
import './App.css';

const  App = () => {
  return (
   <> {/* React fragemnet */}
   <hr/>
   <h1> Grid And FlexBox</h1>
   <h2> Grid</h2>
      <div style={{ backgroundColor: 'white', display: 'grid', padding: 1 }}>
          <div style={{ backgroundColor: 'blue', gridColumn: '1' }}>1</div>
          <div style={{ backgroundColor: 'yellow', gridColumn: '2' }}>2</div>
          <div style={{ backgroundColor: 'gray', gridColumn: '3' }}>3</div>
          <div style={{ backgroundColor: 'purple', gridColumn: '4' }}>4</div>
          <div style={{ backgroundColor: 'green', gridColumn: '5' }}>5</div>
          <div style={{ backgroundColor: 'pink', gridColumn: '6' }}>6</div>
          <div style={{ backgroundColor: 'yellow', gridColumn: '7' }}>7</div>
          <div style={{ backgroundColor: 'violet', gridColumn: '8' }}>8</div>
          <div style={{ backgroundColor: 'whites', gridColumn: '9' }}>9</div>
          <div style={{ backgroundColor: 'orange', gridColumn: '10' }}>10</div>
          <div style={{ backgroundColor: 'blue', gridColumn: '11' }}>11</div>
          <div style={{ backgroundColor: 'orange', gridColumn: '12' }}>12</div>
          <div style={{ backgroundColor: 'pink', gridColumn: '13' }}>13</div>
        </div>
        <div style={{ backgroundColor: 'black', display: 'grid', padding: 1 }}></div>
        <div style={{ backgroundColor: 'blue', gridColumn: '1/2' }}>1</div>
        <div style={{ backgroundColor: 'yellow', gridColumn: '2/4' }}>2</div>
        <div style={{ backgroundColor: 'white', gridColumn: '4/12', display: 'grid' }}></div>
        <div style={{ backgroundColor: 'purple', gridColumn: '1/3' }}>another one</div>
        <div style={{ backgroundColor: 'red', gridColumn: '3/6' }}>another one</div>
            <div style={{ backgroundColor: 'blue', gridColumn: '6/9' }}>another one</div>
            <div style={{ backgroundColor: 'gray', gridColumn: '9/12' }}>another one</div>

   
   <div>this is a div</div>
   <div>
     <p>these are my headers !</p>
     <h1>This is a H1</h1>
     <h2>This is a H2</h2>
     <h3>This is a H3</h3>
     <p>i think header go alll the way to h6 .... maybe h7</p>
   </div>

   <div>
     <h3>this is a unordered list</h3>
     <ult>
       <li> this is my first list items</li>
       <li> this is my second list items</li>
       <li> this is my third list items</li>
     </ult>
     <div>
       <h3> this is ordered list </h3>

      <ol>
        <li>first thing</li>
        <li>second thing</li>
        <li>third thing</li>
      </ol>
     </div>
     <div>
       <h3 style={{color:"blue", fontSize:"30px" }}> this is a table...</h3>
       <table style={{border:"3px solid blue"}}>
         <thead>
           <tr>
             <td> first header</td>
             <td> second header</td>
             <td> third header</td>
           </tr>
         </thead>
         <tbody>
           <tr>
             <td>another first items top left</td>
             <td> another items top middle</td>
             <td> another  items top right</td>
           </tr>
           <tr>
             <td> Another</td>
             <td> Another</td>
             <td> Another</td>
           </tr>
         </tbody>
       </table>
     </div>
   </div>

   <br/>
   <p> there was a break up top me </p>

   <hr/>
   <p> there was some human stuf happening above me </p>

   <div>
     <p> this is an "A href" tag</p>
     
     <a href='https://www.google.com/'> visit google</a>
   </div>

   <div>
     <p> this is img tag</p>

     <img width={450} height={250} alt="puppy" src = "https://media.istockphoto.com/photos/dog-surfing-on-a-wave-picture-id912592258?k=20m=912592258s=612x612w=0h=L2ax3nYfFfqH2RwEpOyFGizo2vi2bVNDAuqDVhNeIpU=" />
   </div>
   <div>
     <h3>this is a button</h3>
     <button>click here </button>
   </div>
  
   </>
  );
}

export default App;



