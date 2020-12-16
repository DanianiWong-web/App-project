package com.example.plantparenthud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SCActivity extends AppCompatActivity {
    private ImageView AcanthoButton;
    private ImageView ArmatoButton;
    private ImageView AriocarpusButton;
    private ImageView MedusaButton;
    private ImageView BishopButton;
    private ImageView BlueButton;
    private ImageView ShaferButton;
    private ImageView AylosteraButton;
    private ImageView BallButton;
    private ImageView BeaverButton;
    private ImageView BirdButton;
    private ImageView LivingButton;
    private ImageView MonkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_c);

        MonkButton = findViewById(R.id.Monkbutton);
        MonkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoMonkActivity();
            }
        });

        LivingButton = (ImageView) findViewById(R.id.Livingbutton);
        LivingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoLivingActivity();
            }
        });

        BirdButton = (ImageView) findViewById(R.id.Birdsbutton);
        BirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBirdActivity();
            }
        });

        BeaverButton = (ImageView) findViewById(R.id.Beaverbutton);
        BeaverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBeaverActivity();
            }
        });

        BallButton = (ImageView) findViewById(R.id.Ballbutton);
        BallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBallActivity();
            }
        });

        AylosteraButton = (ImageView) findViewById(R.id.Alyosterabutton);
        AylosteraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoAylosterActivity();
            }
        });


        ShaferButton = (ImageView) findViewById(R.id.Shaferbutton);
        ShaferButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoShaferActivity();
            }
        });

        BlueButton = (ImageView) findViewById(R.id.Bluebutton);
        BlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBlueActivity();
            }
        });

        BishopButton = (ImageView) findViewById(R.id.Bishopbutton);
        BishopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBishopActivity();
            }
        });

        MedusaButton = (ImageView) findViewById(R.id.medusabutton);
        MedusaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoMedusaActivity();
            }
        });

        AriocarpusButton = (ImageView) findViewById(R.id.Ariocarpusbutton);
        AriocarpusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoAriocarpusActivity();
            }
        });

        ArmatoButton = (ImageView) findViewById(R.id.Armatobutton);
        ArmatoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoArmatoActivity();
            }
        });

        AcanthoButton = (ImageView) findViewById(R.id.Acanthobutton);
        AcanthoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoAcanthoActivity();
            }
        });
    }
    private void movetoMonkActivity(){
        Intent monkintent = new Intent(SCActivity.this, MonkActivity.class);
        startActivity(monkintent);
    }

    private void movetoLivingActivity(){
        Intent livingintent = new Intent(SCActivity.this, LivingActivity.class);
        startActivity(livingintent);
    }

    private void movetoBirdActivity(){
        Intent birdintent = new Intent(SCActivity.this, BirdActivity.class);
        startActivity(birdintent);
    }

    private void movetoBeaverActivity(){
        Intent beaverintent = new Intent(SCActivity.this, BeaverActivity.class);
        startActivity(beaverintent);
    }

    private void movetoBallActivity(){
        Intent ballintent = new Intent(SCActivity.this, BallActivity.class);
        startActivity(ballintent);
    }
    private void movetoAylosterActivity(){
        Intent aylosterintent = new Intent(SCActivity.this, AylosteraActivity.class);
        startActivity(aylosterintent);
    }

    private void movetoShaferActivity(){
        Intent shaferintent = new Intent(SCActivity.this, ShafersActivity.class);
        startActivity(shaferintent);
    }

    private void movetoBlueActivity(){
        Intent blueintent = new Intent(SCActivity.this, BlueActivity.class);
        startActivity(blueintent);
    }

    private void movetoBishopActivity(){
        Intent bisopintent = new Intent(SCActivity.this, BishopActivity.class);
        startActivity(bisopintent);
    }

    private void movetoMedusaActivity(){
        Intent Medusaintent = new Intent(SCActivity.this, MedusaActivity.class);
        startActivity(Medusaintent);
    }

    private void movetoAriocarpusActivity(){
        Intent Ariocarpusintnent = new Intent(SCActivity.this, AriocarpusActivity.class);
        startActivity(Ariocarpusintnent);
    }

    private void movetoArmatoActivity(){
        Intent Armatointent = new Intent(SCActivity.this, ArmatoActivity.class);
        startActivity(Armatointent);
    }

    private void movetoAcanthoActivity(){
        Intent Acanthointent = new Intent(SCActivity.this, AcanthoActivity.class);
        startActivity(Acanthointent);
    }
}