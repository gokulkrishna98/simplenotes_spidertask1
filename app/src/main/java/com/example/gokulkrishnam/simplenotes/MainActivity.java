package com.example.gokulkrishnam.simplenotes;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView mlistview;
    Boolean flag=false;
    List<String> arr = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlistview=(ListView)findViewById(R.id.main_listview_notes);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        mlistview.setAdapter(adapter);
        mlistview.setOnItemClickListener(this);
    }

    @Override
    protected void onResume() {

        super.onResume();

        SharedPreferences getback = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String alpha= getback.getString("string","none");
        String[] arr=alpha.split(",");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        mlistview.setAdapter(adapter);
    }

    public void add(View v)
    {
        flag=true;
        Intent newactivity= new Intent(this,noteactivity.class);
        startActivity(newactivity);

    }

    public void delete_all (View v)
    {
        SharedPreferences save = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor eee= save.edit();
        String bi="";
        eee.putString("string",bi);
        eee.commit();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        mlistview.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView temp=(TextView) view;
        String b= temp.getText().toString();
        Intent g= new Intent(this,displaytask.class);
        g.putExtra("hell",b);
        startActivity(g);
    }
}
