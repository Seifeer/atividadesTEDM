package com.example.testes;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.JobIntentService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView numero, site_edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero= findViewById(R.id.edit_numero);
        site_edit= findViewById(R.id.site_in);
    }

    public void Ligar(View view) {
        String discado= numero.getText().toString();
        Uri test= Uri.parse("tel: "+discado);
        Intent ligar = new Intent(Intent.ACTION_DIAL, test);

        startActivity(ligar);
    }

    public void Abrir_site(View view) {
        String site= site_edit.getText().toString();
        Uri test= Uri.parse("http://"+site);
        Intent entSite= new Intent(Intent.ACTION_VIEW, test);

        startActivity(entSite);
    }
}
