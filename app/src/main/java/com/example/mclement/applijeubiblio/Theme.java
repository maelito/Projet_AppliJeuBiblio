package com.example.mclement.applijeubiblio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Theme extends Activity  {

    private TextView choixTheme;
    private Button btnTheme1;
    private Button btnTheme2;
    private Button btnTheme3;
    private Button btnRetour;
    private String leChoixTheme;
    private String pseudo ;
    private String jeux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);

        choixTheme = (TextView) findViewById(R.id.txtChoixTheme);
        btnTheme1 = (Button) findViewById(R.id.btnbd);
        btnTheme2 = (Button) findViewById(R.id.btnmanga);
        btnTheme3 = (Button) findViewById(R.id.btncomics);
        btnRetour = (Button) findViewById(R.id.btnRetour);
        pseudo = this.getIntent().getExtras().getString("pseudo");
        jeux = this.getIntent().getExtras().getString("jeux");
        //jeux = "memory";
        //jeux = "quizz";
        //choixTheme.setText(choixTheme.getText() + pseudo);

        //lancement du jeu
        btnTheme1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (jeux == "memory") { //on lance le jeu du memory si il on a appuyé sur le bouton memory
                    Intent unIntent = new Intent(Theme.this, Memory.class);
                    unIntent.putExtra("pseudo", pseudo);
                    leChoixTheme = "bd";
                    unIntent.putExtra("theme", leChoixTheme);
                    unIntent.putExtra("jeux", jeux);
                    startActivity(unIntent);
                } else if(jeux == "quizz") //on lance le jeu du quizz dans l autre cas
                {
                    Intent unIntent = new Intent(Theme.this, Quizz.class);
                    unIntent.putExtra("pseudo", pseudo);
                    leChoixTheme = "bd";
                    unIntent.putExtra("theme", leChoixTheme);
                    unIntent.putExtra("jeux", jeux);
                    startActivity(unIntent);
                }
            }
        });

        btnTheme2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (jeux == "memory") { //on lance le jeu du memory si il on a appuyé sur le bouton memory
                    Intent unIntent = new Intent(Theme.this, Memory.class);
                    unIntent.putExtra("pseudo", pseudo);
                    leChoixTheme = "manga";
                    unIntent.putExtra("theme", leChoixTheme);
                    unIntent.putExtra("jeux", jeux);
                    startActivity(unIntent);
                }else //on lance le jeu du quizz dans l autre cas
                {
                    Intent unIntent = new Intent(Theme.this, Quizz.class);
                    unIntent.putExtra("pseudo", pseudo);
                    leChoixTheme = "manga";
                    unIntent.putExtra("theme", leChoixTheme);
                    unIntent.putExtra("jeux", jeux);
                    startActivity(unIntent);
                }
            }
        });

        btnTheme3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (jeux == "memory") //on lance le jeu du memory si il on a appuyé sur le bouton memory
                {
                    Intent unIntent = new Intent(Theme.this, Memory.class);
                    unIntent.putExtra("pseudo",pseudo);
                    leChoixTheme = "comics";
                    unIntent.putExtra("theme", leChoixTheme);
                    unIntent.putExtra("jeux", jeux);
                    startActivity(unIntent);
                } else //on lance le jeu du quizz dans l autre cas
                {
                    Intent unIntent = new Intent(Theme.this, Quizz.class);
                    unIntent.putExtra("pseudo", pseudo);
                    leChoixTheme = "comics";
                    unIntent.putExtra("theme", leChoixTheme);
                    unIntent.putExtra("jeux", jeux);
                    startActivity(unIntent);
                }
            }
        });

        btnRetour.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });;
        
    }
}
