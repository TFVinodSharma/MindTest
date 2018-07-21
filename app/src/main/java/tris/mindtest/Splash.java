package tris.mindtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Splash extends AppCompatActivity {
WebView WebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /*WebView=findViewById(R.id.webview);
        WebView.loadUrl("file:///android_asset.digitalquiz.html");
        WebView.getSettings().setLoadWithOverviewMode(true);
        WebView.getSettings().setUseWideViewPort(true);
*/

/*
        ImageView GifImage=(ImageView)findViewById(R.id.clickhere);
        GifImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Splash.this,MainActivity.class);
                startActivity(i);
            }
        });
*/

    }
}
