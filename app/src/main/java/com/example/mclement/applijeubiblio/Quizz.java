package com.example.mclement.applijeubiblio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Quizz extends AppCompatActivity implements View.OnClickListener {

    //
    private int score = 0;
    //boutons
    private Button btnRetour, btnReinitialiser, btnRegles;

    private String pseudo;


    @Override
    //sauvegarde l'instance
    public void onSaveInstanceState(Bundle savedInstanceState) {
        //sauvegarde le score
        savedInstanceState.putInt("monNbCoup", score);
        //sauvegarde les imagesViews et leur etat
        //

        super.onSaveInstanceState(savedInstanceState);

        //instanciation boutons
        btnRetour = (Button) findViewById(R.id.btnRetour);
        btnReinitialiser = (Button) findViewById(R.id.btnReinitialiser);
        btnRegles = (Button) findViewById(R.id.btnRegles);

    }



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz); //on assigne le layout memory_lanscape à l'activité

        //boutons
        //bouton retour qui fait revenir a la page d'acceuil
        btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Theme.class);
                intent.putExtra("pseudo", pseudo);
                startActivity(intent);

            }
        });

        //bouton reinitialiser qui relance la partie
        btnReinitialiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Quizz.class);
                startActivity(intent);

            }
        });

        btnRegles.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent unIntent = new Intent(getApplicationContext(), Regles.class);
                //unIntent.putExtra("pseudo",pseudo);
                startActivity(unIntent);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
