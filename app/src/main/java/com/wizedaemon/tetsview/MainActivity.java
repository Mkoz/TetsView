package com.wizedaemon.tetsview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //New button declaration
    private TextView textLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLabel = (TextView)findViewById(R.id.textView);
    }



    public void onClick(View view) {
        textLabel.setText("eba-na");
    }
}
