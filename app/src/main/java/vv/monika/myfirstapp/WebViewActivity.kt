package vv.monika.myfirstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.addCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_web_view)

        val mywebview = findViewById<WebView>(R.id.webview)
        mywebview.loadUrl("https://neatroots.com/")
        mywebview.settings.javaScriptEnabled = true

        Intent(Intent.ACTION_VIEW, Uri.parse("https://neatroots.com/")).apply {
            startActivity(this)
        }
mywebview.webViewClient = WebViewClient()

        onBackPressedDispatcher.addCallback {
            if (mywebview.canGoBack())
            {
            mywebview.goBack()
            }
        }

        }

}