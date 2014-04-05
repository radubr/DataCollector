package com.stihlapp;

import android.os.Bundle;
import org.apache.cordova.*;;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//super.loadUrl("http://stihl.xceed.ro");
	    super.loadUrl(Config.getStartUrl());
	}
}
