package com.example.mclement.applijeubiblio;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Menu extends Activity implements View.OnClickListener{

    private Button btnMemory;
    private Button btnRegles;
    private EditText edtTxtPseudo;
    private String pseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        configBouttons();


    }


    private void configBouttons()
    {
        edtTxtPseudo = (EditText) findViewById(R.id.EdtTxtPseudo);
        btnMemory = (Button) findViewById(R.id.btnJeu2);
        btnRegles = (Button) findViewById(R.id.btnRegles);

        btnMemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pseudo = edtTxtPseudo.getText().toString();

                if ( pseudo.equals("")) //on empeche le joueur de jouer si il n'a pas rentré de pseudo
                {
                    //On affiche une boite de dialogue annonçant que le pseudo n'as pas été rentré
                    AlertDialog.Builder alertDialogBuilder1 = new AlertDialog.Builder(Menu.this);
                    alertDialogBuilder1
                            .setMessage("Rentre un pseudo !")
                            //empêche l'annulation
                            .setCancelable(false);
                            //on reviens au menu
                }
                else
                { //on lance le jeu du mémory

                    //Intent intent = new Intent(getApplicationContext(), Memory.class);
                    startActivity(new Intent(Menu.this, Theme.class));
                    //finish();
                }
            }
        });

        btnRegles.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent unIntent = new Intent(Menu.this, Regles.class);
                startActivity(unIntent);
            }
        });




    }

    @Override
    public void onClick(View v) {

    }
}
