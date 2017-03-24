package com.example.rafaelpinheiro.dataactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoPassarDadosId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoPassarDadosId = (Button) findViewById(R.id.botaoPassarDadosId);

        botaoPassarDadosId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("textoNomeId","Rafael");

                startActivity(intent);
            }
        });
    }
}
