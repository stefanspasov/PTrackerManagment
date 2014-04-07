package com.example.pivotaltrackercommunication.services;
import com.example.pivotaltrackercommunication.Context;

import com.google.*;
import com.google.gson.Gson;
public class CurrentStories implements IStoryContainer {
	@Override
	public Story[] getStories() {
	try{	
		String URLstories = "https://www.pivotaltracker.com/services/v5/projects/1043914/stories";
		String response = ConnectionManager.getResponse(URLstories, "GET", Context.token);	
		Gson gson = new Gson();
		  Story[] stories =
		  gson.fromJson(response.toString(), Story[].class);
		return stories;
	}
	catch(Exception e) { return null;}
	}
}
