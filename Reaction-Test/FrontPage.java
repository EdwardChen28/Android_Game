package com.example.reactiontest;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class FrontPage extends Activity {
	// TextView score11, score12,score13, score21,Oscore22, score23;
	// Double[] level1=new Double[3];
	static TextView nameShow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.front_page);
		 nameShow=(TextView) findViewById(R.id.tv_name);
		 SharedPreferences nameValue = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
		 String name = nameValue.getString("whatever", "Fuck");
		 nameShow.setText("Hi! "+ name);
		// setVar();
		// topThree(MainActivity.timefinal);

		// level1ScoreReset();
	}

	
	
	/*
	 * public static void update(String str){ nameShow.setText("Hi! "+str);
	 * 
	 * }
	 * 
	 * private void level1ScoreReset() { // TODO Auto-generated method stub
	 * score11.setText("Top: "+level1[0]); score12.setText("2nd: "+level1[1]);
	 * score13.setText("3rd: "+level1[2]); }
	 * 
	 * private void setVar() { // TODO Auto-generated method stub
	 * score11=(TextView) findViewById(R.id.score11); score12=(TextView)
	 * findViewById(R.id.score12); score13=(TextView)
	 * findViewById(R.id.score13); score21=(TextView)
	 * findViewById(R.id.score21); score21=(TextView)
	 * findViewById(R.id.score21); score21=(TextView)
	 * findViewById(R.id.score21); //player=(TextView)
	 * findViewById(R.id.tv_name); }
	 * 
	 * private void topThree(double num){ for(int i =0; i <level1.length;i++){
	 * if(num<level1[i]){ level1[i]=num; } } }
	 */
}
