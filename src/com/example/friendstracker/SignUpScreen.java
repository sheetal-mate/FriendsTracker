package com.example.friendstracker;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SignUpScreen extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up_screen);
		
		setActionBar();
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("NewApi")
	public void setActionBar()
	{
		RelativeLayout lay_action_back;
		TextView txtv_title,txtv_logout;
		ImageView img_previous;
		getActionBar().hide();
		img_previous = (ImageView) findViewById(R.id.img_prev_screen);
		txtv_title = (TextView) findViewById(R.id.txtv_actionbar_title);
		txtv_title.setText("SIGN UP");
		lay_action_back = (RelativeLayout) findViewById(R.id.layout_action_back);
		lay_action_back.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				SignUpScreen.this.finish();
			}
		});
		
		
	}
}
