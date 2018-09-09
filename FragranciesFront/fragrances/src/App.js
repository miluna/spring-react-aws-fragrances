import React, {Component} from 'react';
import Button from '@material-ui/core/Button';
import Paper from '@material-ui/core/Paper';
import Typography from '@material-ui/core/Typography';
import InputField from "./components/InputField";
import List from "./components/FragranceList";
import config from "./config";

const axios = require("axios");

class App extends Component {
    state = {
        searchNumberValue: "",
        searchTextValue: "",
        searchData: []
    };

    handleNumberFieldChange = (e) => {
        this.setState({searchNumberValue: e.target.value})
    };

    handleTextFieldChange = (e) => {
        this.setState({searchTextValue: e.target.value})
    };

    handleSearch = () => {
        let searchUrl = config.API_URL;
        if (this.state.searchTextValue === "") {
            searchUrl += "/number/" + this.state.searchNumberValue
        } else {
            searchUrl += "/name/" + this.state.searchTextValue
        }

        if (searchUrl.endsWith("/")) {
            searchUrl = config.API_URL;
        }

        axios.get(searchUrl)
            .then(res => this.setState({searchData: res.data}))
            .catch(err => console.log(err))
    };

    render() {


        return (
            <div style={{
                maxWidth: "85%",
                display: "flex",
                flexDirection: "column",
                alignItems: "center",
                justifyContent: "center"
            }}>
                <Paper>
                    <div style={{
                        padding: "1rem",
                        display: "flex",
                        flexDirection: "column",
                        alignItems: "center",
                        justifyContent: "center"
                    }}>
                        <Typography variant="headline">Busqueda de fragancias</Typography>
                        <Typography variant="body1">Busqueda por numero</Typography>
                        <InputField text="Busqueda por numero" handleChangeFunction={this.handleNumberFieldChange}/>
                        <Typography variant="body1">Busqueda por nombre</Typography>
                        <InputField text="Busqueda por nombre" handleChangeFunction={this.handleTextFieldChange}/>
                        <br/>
                        <Button variant="contained" color="primary" onClick={this.handleSearch}>Buscar</Button>
                        <List data={this.state.searchData}/>
                    </div>
                </Paper>
            </div>
        );
    }
}

export default App;
