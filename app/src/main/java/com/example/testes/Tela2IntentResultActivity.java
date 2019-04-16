package com.example.testes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Tela2IntentResultActivity extends AppCompatActivity {
    EditText numero_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2_intent_result);

        numero_t=findViewById(R.id.edit_numero);
    }


public void finalizar_resultado(View view) {

    }
}
