package com.example.madmath;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMeum extends Activity {
	Button Mtable, MTQ, TwoD, TwoAdd, TwoSub;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);

		Mtable = (Button) findViewById(R.id.Mp);
		MTQ = (Button) findViewById(R.id.MQ);
		TwoD = (Button) findViewById(R.id.M12);
		TwoAdd = (Button) findViewById(R.id.add12);
		TwoSub = (Button) findViewById(R.id.sub12);
		TwoAdd.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainMeum.this,
						TwoDigitADD.class);
				startActivity(intent);
				
			}
		});
		
		TwoSub.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainMeum.this,
						TwoDigitSub.class);
				startActivity(intent);
				
			}
		});
		
		Mtable.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainMeum.this,
						MultiplicationTable.class);
				startActivity(intent);
				
			}
		});

		MTQ.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainMeum.this, MulQuiz.class);
				startActivity(intent);
				
			}
		});

		TwoD.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainMeum.this, TwoDigitMul.class);
				startActivity(intent);
			
			}
		});

		
	}

}
