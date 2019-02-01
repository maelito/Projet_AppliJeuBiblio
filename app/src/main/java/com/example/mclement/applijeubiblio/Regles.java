package com.example.mclement.applijeubiblio;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Regles extends Activity implements View.OnClickListener {

    
    TextView regles;
    Button btnRetour;
    String txtRegles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regles);

        regles = (TextView) findViewById(R.id.txtRegles);;
        btnRetour = findViewById(R.id.retour);


        txtRegles = "Les règles du Memory :" +
                "\n \n Il te faut trouver toutes les paires des différents personnages." +
                "\n \n Le but étant de le faire en moins de coups possible !" +
                "\n \n Tu as 8 paires à trouver ! " +
                "\n \n Le jeu s'arrête quand tu as trouvé toutes les paires !";

        regles.setText(txtRegles);

        //bouton retour qui fait revenir a la page d'acceuil
        btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(getApplicationContext(), Menu.class);
                startActivity(intent);*/
                finish();
            }
        });
    }


    @Override
    public void onClick(View v) {

    }

}
