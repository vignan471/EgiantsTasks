import React, {Component} from 'react';
import members from './members.json';
import classNames from 'classnames';

class Roommates extends Component {

	constructor(props) {
	  super(props);

	  this.state = {
	  	members: members,
	  	currentPosition: 0,
	  	currentTick: 0,
	  };
	  this.next = this.next.bind(this);
	  this.prev = this.prev.bind(this);
	}

	next() {

		if (this.state.currentPosition === this.state.members.length-1){
					this.setState({currentPosition: 0});
			}
		else{
						this.setState({currentPosition: this.state.currentPosition+1});
	} }
	prev() {
		if(this.state.currentPosition > 0){
			this.setState({currentPosition: this.state.currentPosition-1});
		} else {
			this.setState({currentPosition: this.state.members.length-1});
		}
	}

	render() {
		let showWord = this.state.currentTick === 2 ? true : false;
		return (

			<div className="game">

					<div className="option">

							<div className="fields">
									<div className="field-block">
												{this.state.members[this.state.currentPosition].name}
								  </div>
						  </div>

							<div className="buttons">
									<a onClick={this.prev} className="button prev">Previous</a>
									<a onClick={this.next} className="button next">Next</a>
							</div>

					<div className="fields">
						<div className="field-block">
							<div className="left-field">
								<div className='placeholder-span'> Technology : {this.state.members[this.state.currentPosition].technology}</div>
								</div>
							</div>
					</div>
				</div>
		</div>

		);
	}

}

export default Roommates;
