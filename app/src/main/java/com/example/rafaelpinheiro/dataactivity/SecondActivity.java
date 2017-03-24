package com.example.rafaelpinheiro.dataactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textoPadrao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textoPadrao = (TextView) findViewById(R.id.textoPadraoId);

        Bundle extraData = getIntent().getExtras();

        String data = extraData.getString("textoNomeId");

        if(data.isEmpty()){
            Toast.makeText(this, "Valor inválido", Toast.LENGTH_SHORT).show();
        }
        else{
            textoPadrao.setText(data);
        }

    }
}
