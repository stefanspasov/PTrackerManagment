package com.example.pivotaltrackercommunication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity{
	Button getCurrentButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_layout);
		getCurrentButton = (Button) findViewById(R.id.getCurrentButton);
		getCurrentButton.setOnClickListener( new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent currentStoriesIntent = new Intent("android.intent.action.CURRENTSTORIES");
				startActivity(currentStoriesIntent);
			}
		});	
	}
}
