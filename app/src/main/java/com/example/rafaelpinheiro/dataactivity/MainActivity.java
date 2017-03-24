package com.example.rafaelpinheiro.dataactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button botaoPassarDadosId;
    private EditText editTextData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextData = (EditText) findViewById(R.id.editTextDataId);

        botaoPassarDadosId = (Button) findViewById(R.id.botaoPassarDadosId);

        botaoPassarDadosId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("textoNomeId",editTextData.getText().toString());

                startActivity(intent);
            }
        });
    }
}
