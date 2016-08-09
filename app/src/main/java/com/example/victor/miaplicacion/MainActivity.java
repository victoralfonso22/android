package com.example.victor.miaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    EditText edit;
    ListView listView;

    String[] valor = new String[]{"HOla","HOla2","HOla3","HOla4","HOla5","Brazil","México","España"};

    //holaaaa commit
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.bot);
        b.setOnClickListener(this);
        edit = (EditText) findViewById(R.id.edit);
        listView = (ListView) findViewById(R.id.lista);

/*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,valor);

        listView.setAdapter(adapter);

      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),"posicion "+listView.getItemAtPosition(i),Toast.LENGTH_LONG).show();
            }
        });*/


        Bandas bandas_dato[] = new Bandas[]{
                new Bandas(R.mipmap.ic_launcher,"GOODING"),
                new Bandas(R.mipmap.ic_launcher,"FUDRER"),
                new Bandas(R.mipmap.ic_launcher,"ROCKY"),
                new Bandas(R.mipmap.ic_launcher,"GMARKING"),
                new Bandas(R.mipmap.ic_launcher,"SPARTIY"),
                new Bandas(R.mipmap.ic_launcher,"LINKER"),
                new Bandas(R.mipmap.ic_launcher,"REALING"),
                new Bandas(R.mipmap.ic_launcher,"WARTYYR"),
                new Bandas(R.mipmap.ic_launcher,"FLYERS"),
                new Bandas(R.mipmap.ic_launcher,"DRYNKER"),
                new Bandas(R.mipmap.ic_launcher,"QIRTY"),
                new Bandas(R.mipmap.ic_launcher,"PERLAYING"),

        };

    BandasAdapter adapter1 = new BandasAdapter(this,R.layout.list_view_item_row,bandas_dato);
        listView = (ListView) findViewById(R.id.lista);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row,null);
        listView.addHeaderView(header);
        listView.setAdapter(adapter1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView v = (TextView) findViewById(R.id.textoa);
                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bot:
                String dato = edit.getText().toString();
                Intent inte = new Intent(MainActivity.this,SegundaActivity.class);
                inte.putExtra("DATO",dato);
                startActivity(inte);
                break;

        }
    }
}
