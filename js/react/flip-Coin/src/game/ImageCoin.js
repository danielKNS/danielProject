import React, { useState } from "react"
const ImageCoin = () => {

    const [headMessage, SetHeadMessage] = useState("")


    const handleCoinClick = (Coin) =>{
        if (Coin === "Head"){
            console.log("Head")
            SetHeadMessage ("you choose Head")
        }
        else{
            console.log("Tail")
            SetHeadMessage("you choose Tail")
        }
    }

    return(
        <div className="intro">
            <h2 style={{color:"yellow"}}> Let the game BEGIN!!</h2>
            <div>
                <button onClick={(Coin) => handleCoinClick("Head")}> {/* anonynous funtion */}
                    <img width={100} height={150} alt= "ImageCoin" src ="headImage.jpeg"></img> 
                </button>
                <button onClick={handleCoinClick}> 
                    <img width={100} height={150} alt= "ImageCoin" src ="tailImage.jpeg"></img> 
                </button>
            </div>
            <div>
                <p style={{color: "green"}}>{headMessage}</p>
                
            </div>
        </div>
        
    );
}

export default ImageCoin;