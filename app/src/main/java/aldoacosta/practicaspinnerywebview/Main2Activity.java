package aldoacosta.practicaspinnerywebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    WebView web;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        web = (WebView) findViewById(R.id.web);
        String urlPaginas = getIntent().getStringExtra("paginaWeb");
        web.setWebViewClient(new WebViewClient());
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.loadUrl(urlPaginas);
    }

    public void clicAtras(View v){
        web.stopLoading();
        web.destroy();
        finish();
    }
}
