package com.stylingandroid.spans;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.util.Linkify;
import android.widget.TextView;
import android.widget.TextView.BufferType;

import com.stylingandroid.spans.R;

public class MainActivity extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.main );
		TextView textView = (TextView)findViewById( R.id.TextView );
		Spannable spannable = (Spannable)textView.getText();
		StyleSpan boldSpan = new StyleSpan( Typeface.BOLD );
		spannable.setSpan( boldSpan, 41, 52, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
		
		TextView textView2 = (TextView)findViewById( R.id.TextView2 );
		SpannableStringBuilder ssb = new SpannableStringBuilder( "Here's a smiley  , and here's a link http://blog.stylingandroid.com" );
		Bitmap smiley = BitmapFactory.decodeResource( getResources(), R.drawable.emoticon );
		ssb.setSpan( new ImageSpan( smiley ), 16, 17, Spannable.SPAN_INCLUSIVE_INCLUSIVE );
		textView2.setText( ssb, BufferType.SPANNABLE );
		Linkify.addLinks( textView2, Linkify.WEB_URLS );
	}
}