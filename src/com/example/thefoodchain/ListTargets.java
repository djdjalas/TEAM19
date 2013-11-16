package com.example.thefoodchain;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class ListTargets extends Activity{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_targets);
		
		Typeface typefaceFont = Typeface.createFromAsset(getAssets(),"fonts/Track.ttf");
		
		
		TextView orderID = (TextView) findViewById(R.id.textView_orderid);
		TextView postCode = (TextView) findViewById(R.id.textView_postcode);
		
		orderID.setTypeface(typefaceFont);
		postCode.setTypeface(typefaceFont);
		
	}

}
