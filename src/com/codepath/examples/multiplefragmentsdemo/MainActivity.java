package com.codepath.examples.multiplefragmentsdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
	
	int fragmentCount = 0;
	TextView txtCount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtCount = (TextView) findViewById(R.id.txtCount);
		appendFragment();
		appendFragment();
		appendFragment();  
	}
	
	public void appendFragment(View v) {
		appendFragment();
	}
	
	public void appendFragment() {
		fragmentCount++;
		txtCount.setText(String.valueOf(fragmentCount));
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.add(R.id.llContainer, DemoFragment.newInstance(fragmentCount));
		ft.commit();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
