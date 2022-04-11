import React from "react";

import MyInfo from "./MyInfo.js"
import MyHobby from "./MyHobby.js"
import MyProfile from "./MyProfile"
import Mylogo from "./MyLogo"
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
  <div>
    <MyProfile
    />
    <Mylogo
    />
    <MyInfo
      myInfo={myInfo}
    />
    <MyHobby
      myHobby={myHobby}
    />
  </div>
)

export default MainComponent;