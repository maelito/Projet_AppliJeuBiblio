package com.example.mclement.applijeubiblio;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class Regles extends AppCompatActivity {
    TextView regles;
    Button retour;
    String txtRegles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regles);

        regles = (TextView) findViewById(R.id.txtRegles);;

        txtRegles = "Les règles du Memory :" +
                "\n \n - Il te faut trouver toutes les paires des différents personnages." +
                "\n \n - Le but étant de le faire en moins de coups possible !" +
                "\n \n - Tu as 8 paires à trouver ! " +
                "\n \n Le jeu s'arrête quand tu as trouvé toutes les paires !";

        regles.setText(txtRegles);
        //Regles();
    }

    private void Regles()
    {

    }


}
