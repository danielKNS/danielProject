import React from 'react';
import HeadCoin from '../Head';
import TailCoin from '../Tail';
import ImageCoin from './ImageCoin';

const FlipCoin = () => {


return (
    <div>
        <div> 
            <h1>Flip Coin Game!!!</h1>
            <h1 style={{color:"blue"}}> Choose: Head or Tails</h1>
        </div>
        <ImageCoin />
    </div>
);
}

export default FlipCoin;
