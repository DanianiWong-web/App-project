package com.example.plantparenthud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SuccActivity extends AppCompatActivity {
    private ImageView JadeButton;
    private ImageView PandaButton;
    private ImageView AdromischusButton;
    private ImageView MaculatusButton;
    private ImageView EcheveriaButton;
    private ImageView BeaucarneaButton;
    private ImageView CotyledonButton;
    private ImageView CrassulaButton;
    private ImageView TomThumbBUtton;
    private ImageView SenecioButton;
    private ImageView BarbertonicusButton;
    private ImageView AloeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succ);

        AloeButton = (ImageView) findViewById(R.id.Aloebutton);
        AloeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoAloeActivity();
            }
        });

        BarbertonicusButton = (ImageView) findViewById(R.id.Barbertonicsbutton);
        BarbertonicusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBarbertonicsActivity();
            }
        });


        SenecioButton = (ImageView) findViewById(R.id.Seneciobutton);
        SenecioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoSenecioActivity();
            }
        });

        TomThumbBUtton = (ImageView) findViewById(R.id.Tomthumbbutton);
        TomThumbBUtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoTomThumbActivity();
            }
        });

        CrassulaButton = (ImageView) findViewById(R.id.Crassulabutton);
        CrassulaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoCrassulaActivity();
            }
        });

        CotyledonButton = (ImageView) findViewById(R.id.Cotyledonbutton);
        CotyledonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoCotyledonActivity();
            }
        });

        BeaucarneaButton = (ImageView) findViewById(R.id.Beaucarneabutton);
        BeaucarneaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBeaucarneaActivity();
            }
        });

        EcheveriaButton = (ImageView) findViewById(R.id.Echeveriabutton);
        EcheveriaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoEcheveriaActivity();
            }
        });

        MaculatusButton = (ImageView) findViewById(R.id.Maculatusbutton);
        MaculatusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoMaculatusActivity();
            }
        });

        AdromischusButton = (ImageView) findViewById(R.id.Adromischusbutton);
        AdromischusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoAdromischus();
            }
        });

        PandaButton = (ImageView) findViewById(R.id.Pandabutton);
        PandaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoPandaActivity();
            }
        });

        JadeButton = (ImageView) findViewById(R.id.Jadebutton);
        JadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoJadeActivity();
            }
        });
    }
    private void movetoAloeActivity(){
        Intent aloeintent = new Intent(SuccActivity.this, AloeActivity.class);
        startActivity(aloeintent);
    }

    private void movetoBarbertonicsActivity(){
        Intent barbertonicintent = new Intent(SuccActivity.this, BarbertonicusActivity.class);
        startActivity(barbertonicintent);
    }

    private void movetoSenecioActivity(){
        Intent seneciointent = new Intent(SuccActivity.this, SenecioActivity.class);
        startActivity(seneciointent);
    }

    private void movetoTomThumbActivity(){
        Intent tomthumbintent = new Intent(SuccActivity.this, TomthumbActivity.class);
        startActivity(tomthumbintent);
    }

    private void movetoCrassulaActivity(){
        Intent crassulaintent = new Intent(SuccActivity.this, CrassulaActivity.class);
        startActivity(crassulaintent);
    }

    private void movetoCotyledonActivity(){
        Intent cotyledonintent = new Intent(SuccActivity.this, CotyledonActivity.class);
        startActivity(cotyledonintent);
    }

    private void movetoBeaucarneaActivity(){
        Intent beaucarneaintent = new Intent(SuccActivity.this, BeaucarneaActivity.class);
        startActivity(beaucarneaintent);
    }

    private void movetoEcheveriaActivity(){
        Intent echeveriaintent = new Intent(SuccActivity.this, EcheveriaActivity.class);
        startActivity(echeveriaintent);
    }

    private void movetoMaculatusActivity(){
        Intent maculatusintent = new Intent(SuccActivity.this, MaculatusActivity.class);
        startActivity(maculatusintent);
    }

    private void movetoAdromischus(){
        Intent adromischusintent = new Intent(SuccActivity.this, AdromischusActivity.class);
        startActivity(adromischusintent);
    }

    private void movetoPandaActivity(){
        Intent pandaintent = new Intent(SuccActivity.this, PandaActivity.class);
        startActivity(pandaintent);
    }

    private void movetoJadeActivity(){
        Intent jadeintent = new Intent(SuccActivity.this, JadeActivity.class);
        startActivity(jadeintent);

    }
}