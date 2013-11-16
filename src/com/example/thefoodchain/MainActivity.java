package com.example.thefoodchain;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Typeface typefaceFont = Typeface.createFromAsset(getAssets(),"fonts/Track.ttf");
		
		Button enterIdLabel = (Button)findViewById(R.id.button1);		
		enterIdLabel.setTypeface(typefaceFont);
		
		TextView requestButton =(TextView)findViewById(R.id.textView1);
		requestButton.setTypeface(typefaceFont);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
