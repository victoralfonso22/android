package com.example.victor.miaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Bundle extras = getIntent().getExtras();
        texto = (TextView) findViewById(R.id.sText);

        if(extras!= null){
            String t = extras.getString("DATO");
            texto.setText(t);
        }


    }

}
