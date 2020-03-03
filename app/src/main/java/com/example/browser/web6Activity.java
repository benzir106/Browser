package com.example.browser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web6Activity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web6);

        webView=findViewById(R.id.web6);

        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String url="https://twitter.com";
        webView.loadUrl(url);

    }
    public class MyViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }

    }

}
