package com.example.pivotaltrackercommunication.services;

public class Story {
	public String name;
	public String description;
	public int estimated; // number of points 1,2,3
	public String current_state; // It is used to put hem in diff columns
									// started/unscheduled
	public String story_type; // feature/chore

	public Story(String name, String state) {
		this.name = name;
		this.current_state = state;
	}

	public Story() {
	};
	
	@Override
	public String toString() {
	  return name;
		//return this.name.length() + this.current_state.length() > 20 ? this.name
			//	.substring(10) + "  " + this.current_state
				//: this.name + "  " + this.current_state;
	}
}
