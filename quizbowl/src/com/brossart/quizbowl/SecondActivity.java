package com.brossart.quizbowl;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends Activity {
	
	private Button gButton;
	private String question = "What is 2 + 2?";
	private String answer = "4";
	TreeMap<String, String> dataSet = new TreeMap<String, String>();
	String[] questionSet;
	double r = Math.random();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		final TextView newQuestion = (TextView) findViewById(R.id.textView3);
		newQuestion.setText(question);
		final TextView goat = (TextView) findViewById(R.id.textView4);
		final TextView sheep = (TextView) findViewById(R.id.textView5);
		final EditText ET = (EditText) findViewById(R.id.editText1);
		Button B1 = (Button) findViewById(R.id.button1);
		B1.setOnClickListener(new View.OnClickListener() {

		                public void onClick(View v) {
		                    ET.setVisibility(View.INVISIBLE);
		                    if(ET.getText().toString().equalsIgnoreCase(answer))
		                    {
		                    	goat.setText("Correct!");
		                    	sheep.setText("");
		                    } else {
		                		sheep.setText("Incorrect. The answer is " + answer + ".");
		                		goat.setText("");
		                    }
		                    ET.setVisibility(View.VISIBLE);
		                } });
		gButton = (Button) findViewById(R.id.button2);
        gButton.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		int n = (int)r*dataSet.size();
        		questionSet = new String[dataSet.size()];
        		questionSet = (String[]) dataSet.keySet().toArray();
        		question = questionSet[n];
        		newQuestion.setText("question");
        		ET.setText("");
        		goat.setText("");
        		sheep.setText("");
        		answer = "Lima";
        	}
        	
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}


/*
 * final EditText ET = (EditText) findViewById(R.id.EnterText);
Button B1 = (Button) findViewById(R.id.EnterButton);
B1.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    ET.setVisibility(View.INVISIBLE);
                    if(ET.getText().toString() == "BYE")
                    {
                        //do something if it is "BYE"
                    } else {
                        Context context = getApplicationContext();
                    CharSequence text = "Please enter BYE";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show(); 
                    }
                    ET.setVisibility(View.VISIBLE);
                } });
 */
