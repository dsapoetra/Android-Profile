package com.example.dimassaputra.zenius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView myTextView=(TextView)findViewById(R.id.founder);
        Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/Gotham-Book.otf");
        myTextView.setTypeface(typeFace);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
