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
    private String leChooixTheme;
    private String pseudo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);

        choixTheme = (TextView) findViewById(R.id.txtChoixTheme);
        btnTheme1 = (Button) findViewById(R.id.btnbd);
        btnTheme2 = (Button) findViewById(R.id.btnmanga);
        btnTheme3 = (Button) findViewById(R.id.btncomics);
        pseudo = this.getIntent().getExtras().getString("pseudo");
        //choixTheme.setText(choixTheme.getText() + pseudo);


        //lancement du jeu
        btnTheme1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent unIntent = new Intent(Theme.this, Memory.class);
                unIntent.putExtra("pseudo",pseudo);
                startActivity(unIntent);
                leChooixTheme = "bd";
            }
        });

        btnTheme2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent unIntent = new Intent(Theme.this, Memory.class);
                unIntent.putExtra("pseudo",pseudo);
                startActivity(unIntent);
                leChooixTheme = "manga";
            }
        });

        btnTheme3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent unIntent = new Intent(Theme.this, Memory.class);
                unIntent.putExtra("pseudo",pseudo);
                startActivity(unIntent);
                leChooixTheme = "comics";
            }
        });
        
    }
}
