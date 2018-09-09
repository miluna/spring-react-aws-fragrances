import React from 'react';
import ListItem from '@material-ui/core/ListItem';
import ListItemText from '@material-ui/core/ListItemText';

const fragrance = ({data}) => {
    return (
        <ListItem>
            <ListItemText primary={data.number + " - " + data.name}/>
        </ListItem>
    )
};

export default fragrance;
