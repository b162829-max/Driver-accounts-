package com.driveraccounts.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b) {
    super.onCreate(b);
    getWindow().setStatusBarColor(Color.rgb(22,59,50));
    getWindow().getDecorView().setSystemUiVisibility(0);
    WebView w = new WebView(this);
    w.setBackgroundColor(Color.WHITE);
    WebSettings s = w.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setAllowFileAccess(true);
    w.setOverScrollMode(View.OVER_SCROLL_NEVER);
    setContentView(w);
    w.loadUrl("file:///android_asset/index.html");
  }
}
