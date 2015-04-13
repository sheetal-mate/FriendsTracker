package com.example.friendstracker;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SplashScreen extends Activity implements OnClickListener 
{
	TextView appName,appName1;
	RelativeLayout layout;
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		
		getActionBar().hide();
		
		appName= (TextView) findViewById(R.id.txtv_appName);
		Typeface type1 = Typeface.createFromAsset(getAssets(), "fonts/OSWALD.REGULAR.TTF");
		appName.setTypeface(type1);
		
		appName1= (TextView) findViewById(R.id.txtv_appName1);
		Typeface type2 = Typeface.createFromAsset(getAssets(), "fonts/OSWALD.LIGHT.TTF");
		appName1.setTypeface(type2);
		
		layout=(RelativeLayout)findViewById(R.id.layout1);
		layout.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_screen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) 
	{
		int id=v.getId();
		
		if(id==R.id.layout1)
		{
			Intent intent=new Intent(SplashScreen.this,HomeScreen.class);
			startActivity(intent);
		}
		
	}
}
