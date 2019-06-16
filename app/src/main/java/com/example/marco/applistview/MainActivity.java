package com.example.marco.applistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private ListView lv1;

    private String nombres [] = {"Andres","Marco","Juana","Petra","Juanito","Didiere","Vega"};
    private String edad [] = {"15","14","16","17","18","19","20"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.tv1);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter <String> Adapter = new ArrayAdapter<String>(this, R.layout.list_item_marco, nombres);
        lv1.setAdapter(Adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                tv1.setText("La edad de "+lv1.getItemAtPosition(i)+" es :"+ edad[i]+" años ");
            }
        });
    }

}
