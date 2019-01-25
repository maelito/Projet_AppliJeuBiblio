package com.example.mclement.applijeubiblio;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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
        pseudo = edtTxtPseudo.getText().toString();


        btnMemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( pseudo == "")
                {
                    //On affiche une boite de dialogue annonçant que le nom n'as pas été rentré
                    AlertDialog.Builder alertDialogBuilder1 = new AlertDialog.Builder(Menu.this);
                    alertDialogBuilder1
                            .setMessage("Rentre un pseudo !")
                            //empêche l'annulation
                            .setCancelable(false)
                            //on recommence une partie
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int i) {
                                    Intent intent = new Intent(getApplicationContext(), Menu.class);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                }
            }
        });
    }
}
