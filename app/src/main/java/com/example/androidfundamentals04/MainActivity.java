package com.example.androidfundamentals04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  static final String ANDROID_URL = "https://developer.android.com/";
    private WebView webView;
    private Spinner spinner;
    private List<String> fructe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        /*setContentView(R.layout.webview_sample);
        webView = findViewById(R.id.webViewAndroid);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(ANDROID_URL);*/
        setContentView(R.layout.spinner_sample);
        spinner = findViewById(R.id.spinnerFructe);
        setSpinnerSource();
        spinner.setAdapter(getSpinnerAdapter());
    }
        private void setSpinnerSource() {
            fructe = new ArrayList<>();
            fructe.add("Mar");
            fructe.add("Pere");
            fructe.add("Chirese");
            fructe.add("Kutya");
            fructe.add("Alma");

    }
        private ArrayAdapter<String> getSpinnerAdapter(){

            return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fructe);

        }


}
