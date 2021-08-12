import React, { Component } from 'react';

class search extends Component {
    constructor() {
        super();
        this.state = {
            filter: "",
            Data: []
        };
    }
    componentDidMount() {
        this.fetchmenu();
    }

    fetchmenu() {
        fetch("http://localhost:8081/class/getClassDetails")
            .then(function (res) {
                console.log(res);
                return res.json();
            })
            .then((json) => {
                
                this.setState({
                    Data: json,
                });
                console.log(json);
            });
    };
    searchtxt(e) {
        this.setState({ filter: e.target.value });
    }

    render() {
        let { filter, Data } = this.state;
        let dataget = Data.filter(item => {
            return Object.keys(item).some(key =>
                item[key].toLowerCase().includes(filter.toLowerCase()))
        });
        return (
            <div >
                search:<input style={{ width: "30%" }} value={filter} type="text" onChange={this.searchtxt.bind(this)} />
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>age</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        (dataget.map(item =>
                            <tr>
                                <td>{item.name}</td>
                                <td>{item.age}</td>
                            </tr>
                        ))
                    }
                </tbody>



            </div>

        );
    }
}

export default search;