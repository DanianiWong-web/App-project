package com.example.plantparenthud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CactusActivity extends AppCompatActivity {
    private ImageView BurrosButton;
    private ImageView BrainButton;
    private ImageView BrazlianButton;
    private ImageView BunnyButton;
    private ImageView ButtonButton;
    private ImageView StrawberryButton;
    private ImageView CarmineButton;
    private ImageView CatButton;
    private ImageView DrawfchinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cactus);

        DrawfchinButton = findViewById(R.id.Dwarfchinbutton);
        DrawfchinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoDwarfchinActivity();
            }
        });

        CatButton = findViewById(R.id.Catbutton);
        CatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoCatActivity();
            }
        });

        CarmineButton = (ImageView) findViewById(R.id.Carminebutton);
        CarmineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoCarmineActivity();
            }
        });

        StrawberryButton = (ImageView) findViewById(R.id.Strawberrybutton);
        StrawberryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoStrawberryActivity();
            }
        });

        ButtonButton = (ImageView) findViewById(R.id.buttonbutton);
        ButtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoButtonActivity();
            }
        });

        BunnyButton = (ImageView) findViewById(R.id.Bunnybutton);
        BunnyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBunnyActivity();
            }
        });

        BrazlianButton = (ImageView) findViewById(R.id.Brainbutton);
        BrazlianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBrazlianActivity();
            }
        });

        BrainButton = (ImageView) findViewById(R.id.Brainbutton);
        BrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBrainActivity();
            }
        });

        BurrosButton = (ImageView) findViewById(R.id.Burrosbutton);
        BurrosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBuActivity();
            }
        });

    }
    private void movetoDwarfchinActivity(){
        Intent dwarfchinintent = new Intent(CactusActivity.this, DwarfchinActivity.class);
        startActivity(dwarfchinintent);
    }

    private void movetoCatActivity(){
        Intent catintent = new Intent(CactusActivity.this, CatActivity.class);
        startActivity(catintent);
    }

    private void movetoCarmineActivity(){
        Intent carmineintent = new Intent(CactusActivity.this, CarmineActivity.class);
        startActivity(carmineintent);
    }

    private void movetoStrawberryActivity(){
        Intent strawberryintent = new Intent(CactusActivity.this, StrawberryActivity.class);
        startActivity(strawberryintent);
    }

    private void movetoButtonActivity(){
        Intent buttonintent = new Intent(CactusActivity.this, ButtonActivity.class);
        startActivity(buttonintent);
    }

    private void movetoBunnyActivity(){
        Intent bunnyintent = new Intent(CactusActivity.this, BunnyActivity.class);
        startActivity(bunnyintent);
    }

    private void movetoBrazlianActivity(){
        Intent brizlianintent = new Intent(CactusActivity.this, BrazilianActivity.class);
        startActivity(brizlianintent);
    }

    private void movetoBrainActivity(){
        Intent brainintnet = new Intent(CactusActivity.this, BrainActivity.class);
        startActivity(brainintnet);
    }

    private void movetoBuActivity(){
        Intent buintent = new Intent(CactusActivity.this, BurrosActivity.class);
        startActivity(buintent);
    }
}