package com.example.testes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tela1IntentResultActivity extends AppCompatActivity {

    private static final int OBTER_TELEFONE_CODE = 190;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1_intent_result);
    }

    public void obter_telefone(View view) {
        Intent intent=new Intent(this,Tela2IntentResultActivity);
        startActivityForResult(intent,OBTER_TELEFONE_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode)
}
