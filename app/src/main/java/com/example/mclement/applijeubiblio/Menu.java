package com.example.mclement.applijeubiblio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Menu extends Activity {

    private Button btnMemory, btnQuizz;
    private Button btnRegles;
    private EditText edtTxtPseudo;
    private String pseudo;
    private String jeux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        configBoutons();
    }


    private void configBoutons()
    {
        edtTxtPseudo = (EditText) findViewById(R.id.EdtTxtPseudo);
        btnMemory = (Button) findViewById(R.id.btnJeu2);
        btnQuizz = (Button) findViewById(R.id.btnJeu1);
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
                { //on lance la page de thème du jeu du mémory

                    //Intent intent = new Intent(getApplicationContext(), Memory.class);
                    Intent unIntent = new Intent(Menu.this, Theme.class);
                    unIntent.putExtra("pseudo",pseudo);
                    startActivity(unIntent);
                    //finish();
                }
            }
        });

        btnQuizz.setOnClickListener(new View.OnClickListener() {
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
                { //on lance la page de thème du jeu du mémory

                    //Intent intent = new Intent(getApplicationContext(), Memory.class);
                    Intent unIntent = new Intent(Menu.this, Theme.class);
                    unIntent.putExtra("pseudo",pseudo);
                    startActivity(unIntent);
                    //finish();
                }
            }
        });


        btnRegles.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent unIntent = new Intent(Menu.this, Regles.class);
                unIntent.putExtra("pseudo",pseudo);
                startActivity(unIntent);
            }
        });
    }
}
