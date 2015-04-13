package com.example.friendstracker;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreen extends Activity implements OnClickListener 
{
	TextView appName,appName1;
	Button f_signin,signin,signup;
	SpannableString facebook;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);
		
		setActionBar();
		
		f_signin=(Button)findViewById(R.id.btn_signupfacebook);
		String str=f_signin.getText().toString();
		
		signin=(Button)findViewById(R.id.btn_signin);
		signin.setOnClickListener(this);
		signup=(Button)findViewById(R.id.btn_signup);
		signup.setOnClickListener(this);
		
		facebook = new SpannableString(str);
		facebook.setSpan(new ForegroundColorSpan(Color.parseColor("#2182cd")), 12,20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		f_signin.setText(facebook);
		
		Typeface type1 = Typeface.createFromAsset(getAssets(), "fonts/OSWALD.REGULAR.TTF");
		signin.setTypeface(type1);
		
		Typeface type2 = Typeface.createFromAsset(getAssets(), "fonts/OSWALD.REGULAR.TTF");
		signup.setTypeface(type2);
		
		Typeface type3 = Typeface.createFromAsset(getAssets(), "fonts/OSWALD.REGULAR.TTF");
		f_signin.setTypeface(type3);
		
		
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
		txtv_title.setText("LOGIN");
		lay_action_back = (RelativeLayout) findViewById(R.id.layout_action_back);
		lay_action_back.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				HomeScreen.this.finish();
			}
		});
		
		
	}

	@Override
	public void onClick(View v) 
	{
		int id=v.getId();
		
		if(id==R.id.btn_signin)
		{
			
		}
		else if(id==R.id.btn_signup)
		{
			Intent intent=new Intent(HomeScreen.this,SignUpScreen.class);
			startActivity(intent);
		}
		
	}
}
