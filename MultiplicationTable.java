package com.example.madmath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MultiplicationTable extends Activity {
	Button next;
	int first = 1, second = 1 ;
	TextView multiplication;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mtable);
		next = (Button) findViewById(R.id.next);
		multiplication = (TextView) findViewById(R.id.multTable);
		next.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String display = "";
				if (first > 12 ) {
					first = 1;
					second = 1;
				}
				for(int i = second; i <=12; i++){
					if(i == 12) display += first +" X " +i+" = " + (first*i);
					else display += first +" X " +i+" = " + (first*i)+"\n";
				}
				first++;second++;
				multiplication.setText(display);

			}
		});
	}

}
