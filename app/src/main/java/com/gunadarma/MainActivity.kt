package com.gunadarma

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webview)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        // GANTI URL di sini
        webView.loadUrl("http://10.0.2.2/iksan/uas/login.php")
    }
}
