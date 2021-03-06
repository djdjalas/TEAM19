package com.example.thefoodchain;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{

	
	
	private TextView enterIdTextView;
	private Button requestButton ;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Typeface typefaceFont = Typeface.createFromAsset(getAssets(),"fonts/Track.ttf");
		
		
		Button requestButton = (Button)findViewById(R.id.button1);
		requestButton.setOnClickListener(new ButtonListener());
		
		requestButton.setTypeface(typefaceFont);
		
		enterIdTextView =(TextView)findViewById(R.id.textView1);
		enterIdTextView.setTypeface(typefaceFont);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private class ButtonListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			new TheAsynkTask().execute();
		}
		
	}
	
	private class TheAsynkTask extends AsyncTask<String, String, String>{

		@Override
		protected String doInBackground(String... params) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		protected void onPostExecute(String result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			
			startActivity(new Intent(MainActivity.this, ListTargets.class));

		}
		
	} 

}
