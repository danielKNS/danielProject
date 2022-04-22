import React, { useState } from "react"
const ImageCoin = () => {

    const [headMessage, SetHeadMessage, ] = useState("")

    const handleCoinClick = (Coin) =>{ // Coin is now Head
        const randomNumber = Math.floor(Math.random() * 2)
        console.log("randomNumber",randomNumber)
        const result = randomNumber === 1 ? "Head" : "Tail"
        console.log("result", result)
        if (Coin === result){
            SetHeadMessage(`YOU choose, ${Coin} , CPU picked ${result}, YOU WON!!`)
        }else {
            SetHeadMessage(`YOU choose, ${Coin} , CPU picked ${result}, YOU LOST!!`)
        }
       
    }

    return(
        <div className="intro">
            <h1 style={{color:"yellow"}}> Let the game BEGIN!!</h1>
            <h2 style={{color:"blue"}}> Choose: Head or Tails :</h2>
            <div>
                <button onClick={(Coin) => handleCoinClick("Head")}> {/* anonynous funtion */}
                    <img width={100} height={150} alt= "ImageCoin" src ="headImage.jpeg"></img> 
                </button>
                <button onClick={(Coin) => handleCoinClick("Tail")}> 
                    <img width={100} height={150} alt= "ImageCoin" src ="tailImage.jpeg"></img> 
                </button>
            </div>
            <div>
                <p style= {{color: "yellow"}}>The results :</p>
                <h2 style={{color: "green"}}>{headMessage} </h2>
            </div>
        </div>
        
    );
}


export default ImageCoin;