package com.example.thefoodchain;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class SingleTarget extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_target);
		
		
		WebView map = (WebView) findViewById(R.id.map);
		map.loadUrl("https://maps.google.co.uk/maps?q=map+route&client=safari&hq=route&hnear=London,+United+Kingdom&t=m&z=11");
	}
	


}
