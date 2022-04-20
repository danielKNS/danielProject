import React from "react";

import MyInfo from "./MyInfoo.js"
import MyHobby from "./MyHobbi.js"
// import MyProfile from "./MyProfile"
// import Mylogo from "./MyLogo"
// import MyFriendList from "./MyFriendList.js";

const myInfo = [
    {
      name: "Name : Daniel",
      lastName: "Last Name : Ribeiro" 
    ,
    
      myBirthDate: "Date of Birth : 18/05/2005",
      myCurrentAge: "My Age : 16"
    ,
    
      favoriteColour: "Favorite Colour : Black and White",
      myDream: "My Dream : Its to play Competitive VolleyBall"
    }
  ];
  const myHobby = ["Play VolleyBall", "Play Video Games with my friends","Watch Anime","Read Manga"]


 const MainComponent = (props) => (
  <>
    {/* <div style = {{backgroundColor: "black", display: "grid" }}>
      <Mylogo/>
    </div>

    <div style = {{backgroundColor: "blue"}}>
      <MyProfile/>
    </div> */}
    <div style ={{backgroundColor: "white"}} >
      <MyInfo
      myInfo={myInfo}/>
    </div>
    <h1> hi iiidhcisdos</h1>
    <MyHobby
      myHobby={myHobby}/>
    <hr/>

    {/* <MyFriendList/> */}

    <hr/>
    </>
)


export default MainComponent;