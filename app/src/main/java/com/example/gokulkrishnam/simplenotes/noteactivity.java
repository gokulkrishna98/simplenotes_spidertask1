package com.example.gokulkrishnam.simplenotes;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class noteactivity extends AppCompatActivity {
    EditText et;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noteactivity);
        et=(EditText) findViewById(R.id.editText1);

        SharedPreferences save = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor eee= save.edit();

    }

    public void saveit(View v)
    {
        a=et.getText().toString()+",";

        SharedPreferences save = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor eee= save.edit();
        String bi= save.getString("string","");
        bi=bi+a;
        eee.putString("string",bi);
        eee.commit();

        Log.d("vivz", "saveit: "+a);
        Intent g= new Intent(this,MainActivity.class);
        g.putExtra("hello",a);
        startActivity(g);

    }


}
