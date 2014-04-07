package com.example.pivotaltrackercommunication;

import com.example.pivotaltrackercommunication.services.*;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CurrentStoriesActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.current_stories_layout);
		ListView storiesListView = (ListView) findViewById(R.id.storiesListView);
		ArrayAdapter<Story> storiesAdapter = new ArrayAdapter<Story>(this,
				android.R.layout.simple_list_item_1, Facade.getInstance().getCurrentStories());
		storiesListView.setAdapter(storiesAdapter);
	}
}
