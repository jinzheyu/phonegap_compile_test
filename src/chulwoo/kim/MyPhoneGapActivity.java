package chulwoo.kim;

import org.apache.cordova.DroidGap;
import org.apache.cordova.api.LOG;

import android.os.Bundle;

public class MyPhoneGapActivity extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		long startTme=System.currentTimeMillis();
		super.loadUrl("file:///android_asset/www/index2.html");
		LOG.e("TIME", "loading page costs "+(System.currentTimeMillis()-startTme) +"milli.");
	}
}
