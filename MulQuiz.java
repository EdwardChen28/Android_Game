package com.example.madmath;

import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MulQuiz extends Activity {
	Button startB, submition;
	TextView scores, equation;
	EditText inputs;

	int first = 0, second = 0, point = 0, ans = 0;
	boolean started = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mul_quiz);
		startB = (Button) findViewById(R.id.quizStart);
		startB.setBackgroundColor(Color.rgb(255, 128, 0));
		scores = (TextView) findViewById(R.id.score);
		equation = (TextView) findViewById(R.id.question);
		inputs = (EditText) findViewById(R.id.input);
		submition = (Button) findViewById(R.id.submit);
		startB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (started == false) {
					point = 0;
					scores.setText("score: " + point);
					Random rand = new Random();
					first = rand.nextInt(12) + 1;
					second = rand.nextInt(12) + 1;
					ans = first * second;
					equation.setText(first + " X " + second + " = ?");
					started = true;
				}
			}
		});

		submition.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (started) {
					String str = inputs.getText().toString();
					if(str.matches("")){
						Toast.makeText(getApplicationContext(), "You did not enter an answer", Toast.LENGTH_LONG).show();
					}
					else if (Integer.parseInt(str) == ans) {
						point++;
						scores.setText("score: " + point);
						Random rand = new Random();
						first = rand.nextInt(12) + 1;
						second = rand.nextInt(12) + 1;
						equation.setText(first + " X " + second + " = ?");
						inputs.setText("");
						ans = first * second;

					} else {
						AlertDialog.Builder builder = new AlertDialog.Builder(
								MulQuiz.this);
						builder.setTitle("Wrong Answer!");
						builder.setMessage("score: " + point);
						builder.setNegativeButton("Main Menu",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										Intent restart = new Intent(
												MulQuiz.this, MainMeum.class);
										startActivity(restart);
										finish();
									}
								});
						builder.setPositiveButton("Restart",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										Intent restart = new Intent(
												"com.example.madmath.MULQUIZ");
										startActivity(restart);
										finish();
									}
								});
						builder.show();
					}
				}else{
					Toast.makeText(getApplicationContext(), "Click Start to Begin", Toast.LENGTH_LONG).show();
				}

			}
		});

	}

}
