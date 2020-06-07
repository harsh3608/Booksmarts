package com.example.booksmarts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView booksmarts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        booksmarts= (WebView)findViewById(R.id.booksmarts);
        WebSettings webSettings= booksmarts.getSettings();
        webSettings.setJavaScriptEnabled(true);
        booksmarts.loadUrl("https://booksmarts.in");
        booksmarts.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        if(booksmarts.canGoBack()){
            booksmarts.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
