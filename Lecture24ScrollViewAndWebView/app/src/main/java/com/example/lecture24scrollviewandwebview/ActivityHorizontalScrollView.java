package com.example.lecture24scrollviewandwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ActivityHorizontalScrollView extends AppCompatActivity {
  WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_scroll_view);
        webView = findViewById(R.id.webview);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        }

    }






    public void jAVAclick(View view) {
        Toast.makeText(this, "java course loading", Toast.LENGTH_SHORT).show();
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://github.com/SyedMuhammadArsalanShah/Java");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    public void androidclick(View view) {


        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://github.com/SyedMuhammadArsalanShah/AndroidCourse");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Toast.makeText(this, "Andoid course loading", Toast.LENGTH_SHORT).show();
    }

    public void html(View view) {
        String abc="<html><body><h1>Arsalan</h1><h2>Arsalan</h2><h3>Arsalan</h3><h4>Arsalan</h4><h5>Arsalan</h5><h6>Arsalan</h6></body></html>";
        Toast.makeText(this, " html page loading", Toast.LENGTH_SHORT).show();
        webView.loadData(abc,  "text/html", "UTF-8");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    public void facebook(View view) {

        Toast.makeText(this, "facebook webpage loading", Toast.LENGTH_SHORT).show();
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}