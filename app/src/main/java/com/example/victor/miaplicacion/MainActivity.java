package com.example.victor.miaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    EditText edit;

    //holaaaa commit
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.bot);
        b.setOnClickListener(this);
        edit = (EditText) findViewById(R.id.edit);

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
