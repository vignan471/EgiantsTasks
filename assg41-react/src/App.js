import React, { Component } from 'react';
import './App.css';
import Roommates from './Roommates';

class App extends Component {
  render() {
    return (
      <div className="App">
        <div className="App-header">
          <h1>4010 Roomies</h1>
        </div>
        <Roommates/>
      </div>
    );
  }
}

export default App;
