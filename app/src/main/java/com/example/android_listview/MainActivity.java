package com.example.android_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView l;
    String days[]={"day1","2","3","4","5","6","7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.lv);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,days);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView temp=(TextView) view;
        Toast.makeText(this, "You clicked "+ temp.getText() +" at "+ position, Toast.LENGTH_SHORT).show();
    }
}