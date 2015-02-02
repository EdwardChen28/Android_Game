package com.example.reactiontest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button redBar, greenBar, starButton,stopButton, nameEnterButton;
	TextView name, score;
	boolean stop;
	long startTime, endTime;
	double time, timeShow=100;
	static double timefinal;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		name = (TextView) findViewById(R.id.nameShow);
		score = (TextView) findViewById(R.id.scoreShow);
		redBar = (Button) findViewById(R.id.button1);
		greenBar = (Button) findViewById(R.id.button2);
		starButton = (Button) findViewById(R.id.button3);
		stopButton = (Button) findViewById(R.id.button4);
		nameEnterButton = (Button) findViewById(R.id.entername);
		
		starButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				redBar.setBackgroundColor(Color.parseColor("#FF0000"));
				if(!stop){
					try{				
						double a = Math.random()*5+1;
						Thread.sleep((int)(a*1000));
						}catch(InterruptedException e){
					e.printStackTrace();
				}
					greenBar.setBackgroundColor(Color.parseColor("#00CC00"));
					startTime=System.currentTimeMillis();
					stop=true;
			} 
			}
		});
		
		
		
		stopButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (stop == true) {
					endTime = System.currentTimeMillis();
					greenBar.setBackgroundColor(Color.parseColor("#99FF99"));
					stop=false;
					time = endTime - startTime;
					AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
					builder.setTitle("Time");
					timefinal=time/1000;
					builder.setMessage(""+timefinal);
					builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					});
					builder.show();

				}
				
			
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;

	}

}
