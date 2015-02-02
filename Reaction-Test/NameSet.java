package com.example.reactiontest;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameSet extends Activity {

	EditText name;
	Button send;
	static String playerName;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.set_name);
		
		name = (EditText) findViewById(R.id.et_name);
		send = (Button) findViewById(R.id.enter);
		playerName = name.getText().toString();

		send.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(playerName.length()>0){
					SharedPreferences nameValue = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
					SharedPreferences.Editor editor = nameValue.edit();
					editor.putString("whatever", playerName);
					editor.commit();
					}
				Intent backToMenu = new Intent(NameSet.this, Menu.class);
				startActivity(backToMenu);
			}
		});
	}

	

}
