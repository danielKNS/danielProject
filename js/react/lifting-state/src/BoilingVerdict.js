import React from "react"

const BoilingVerdict = (props) => {
    return props.temperature >= 100 
    ? (<p> the water would boil</p>)
    : (<p> the water would NOT boil</p>)
  }

export default BoilingVerdict