import React from 'react';

const input = ({handleChangeFunction, text}) => {
    return (
        <div>
            <input className="" placeholder={text} onChange={e => handleChangeFunction(e)}/>
        </div>
    )
};

export default input;
