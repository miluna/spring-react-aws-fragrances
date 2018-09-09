import React, {Component} from 'react';
import Fragrance from "./Fragrance"
import List from '@material-ui/core/List';

class FragranceList extends Component {
    render() {

        const list = this.props.data;

        const component = list.map(element => <Fragrance key={element.id} data={element}/>);

        return (
            <List component="nav">
                {component}
            </List>
        );
    }
}

export default FragranceList;