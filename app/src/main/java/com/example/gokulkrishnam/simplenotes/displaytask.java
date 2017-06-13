package com.example.gokulkrishnam.simplenotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class displaytask extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaytask);
        t= (TextView) findViewById(R.id.textView);
        Bundle b= getIntent().getExtras();
        t.setText(b.getString("hell"));
    }
}
