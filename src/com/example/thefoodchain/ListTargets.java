package com.example.thefoodchain;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class ListTargets extends Activity{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_targets);
		
		Typeface typefaceFont = Typeface.createFromAsset(getAssets(),"fonts/Track.ttf");
		
		ListView list = (ListView) findViewById(R.id.listView1);
		list.setVisibility(View.VISIBLE);
		
		TextView orderID = (TextView) findViewById(R.id.textView_orderid);
		TextView postCode = (TextView) findViewById(R.id.textView_postcode);
		TextView delivered = (TextView) findViewById(R.id.textView_delivered);
		
		orderID.setTypeface(typefaceFont);
		postCode.setTypeface(typefaceFont);
		delivered.setTypeface(typefaceFont);
		
	}

}
