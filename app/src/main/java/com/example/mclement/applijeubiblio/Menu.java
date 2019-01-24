package com.example.mclement.applijeubiblio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Menu extends AppCompatActivity {

    private Button btnMemory;
    private EditText edtTxtPseudo;
    private String pseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        edtTxtPseudo = (EditText) findViewById(R.id.EdtTxtPseudo);



        btnMemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( pseudo == "")
                {

                }
            }
        });
    }
}
