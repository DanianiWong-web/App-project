package com.example.plantparenthud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlantActivity extends AppCompatActivity {
    private ImageView ChryButton;
    private ImageView SpiderButton;
    private ImageView FicusButton;
    private ImageView RedButton;
    private ImageView PeaceButton;
    private ImageView BostonButton;
    private ImageView GoldenButton;
    private ImageView SnakeButton;
    private ImageView BambooButton;
    private ImageView RubberButton;
    private ImageView KalancheButton;
    private ImageView MoneyButton;
    private ImageView EnglishButton;
    private ImageView ChineseButton;
    private ImageView HeartLeafButton;
    private ImageView ArecaButton;
    private ImageView DieffButton;
    private ImageView PepeButton;
    private ImageView WarButton;
    private ImageView FiddleButton;
    private ImageView GerberButton;
    private ImageView DwarfButton;
    private ImageView UmbrellaButton;
    private ImageView WaxButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);

        WaxButton = (ImageView) findViewById(R.id.Waxbutton);
        WaxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoWaxActivity();
            }
        });

        UmbrellaButton = (ImageView) findViewById(R.id.umbrellabutton);
        UmbrellaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoUmbrellaActivity();
            }
        });

        DwarfButton = (ImageView) findViewById(R.id.Dwarfbutton);
        DwarfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoDwarfActivity();
            }
        });

        GerberButton = (ImageView) findViewById(R.id.Gerberbutton);
        GerberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoGerberActivity();
            }
        });

        FiddleButton = (ImageView) findViewById(R.id.Fiddlebutton);
        FiddleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoFiddleActivity();
            }
        });

        WarButton = (ImageView) findViewById(R.id.warbutton);
        WarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoWarActivity();
            }
        });

        PepeButton = (ImageView) findViewById(R.id.peperbutton);
        PepeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoPepeActivity();
            }
        });

        DieffButton = (ImageView) findViewById(R.id.Dieffbutton);
        DieffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoDieffActivity();
            }
        });

        ArecaButton = (ImageView) findViewById(R.id.Arecabutton);
        ArecaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoArecaActivity();
            }
        });

        HeartLeafButton = (ImageView) findViewById(R.id.HeartLeafbutton);
        HeartLeafButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                movetoHeartLeafActivity();
            }
        });

        ChineseButton = (ImageView) findViewById(R.id.Chinesebutton);
        ChineseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoChineseActivity();
            }
        });

        EnglishButton = (ImageView) findViewById(R.id.Englishbutton);
        EnglishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoEnglishActivity();
            }
        });

        MoneyButton = (ImageView) findViewById(R.id.Moneybutton);
        MoneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoMoneyActivty();
            }
        });

        KalancheButton = (ImageView) findViewById(R.id.kallanchebutton);
        KalancheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoKalancheActivity();
            }
        });

        RubberButton =  (ImageView) findViewById(R.id.Rubberbutton);
        RubberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoRubberActivity();
            }
        });

        BambooButton = (ImageView) findViewById(R.id.Bamboobutton);
        BambooButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBambooActivity();
            }
        });

        SnakeButton = (ImageView) findViewById(R.id.Snakebutton);
        SnakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoSnakeActivity();
            }
        });


        GoldenButton = (ImageView) findViewById(R.id.Goldenbutton);
        GoldenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoGoldenActivity();
            }
        });

        BostonButton = (ImageView) findViewById(R.id.Bostonbutton);
        BostonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBostonActivity();
            }
        });

        PeaceButton = (ImageView) findViewById(R.id.button5);
        PeaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoPeaceActivity();
            }
        });

        RedButton = (ImageView) findViewById(R.id.Redbutton);
        RedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoRedActivity();
            }
        });

        FicusButton = (ImageView) findViewById(R.id.Ficusbutton);
        FicusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoFicusActivity();
            }
        });

        SpiderButton = (ImageView) findViewById(R.id.Spiderbutton);
        SpiderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                movetoSpiderActivity();
            }
        });

        ChryButton = (ImageView) findViewById(R.id.Chrysbutton);
        ChryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                movetoChryActivity();

            }
        });


    }
    private void movetoWaxActivity(){
        Intent waxintent = new Intent(PlantActivity.this, WaxActivity.class);
        startActivity(waxintent);
    }

    private void movetoUmbrellaActivity(){
        Intent umbrellaintent = new Intent(PlantActivity.this, UmbrellaActivity.class);
        startActivity(umbrellaintent);
    }

    private void movetoDwarfActivity(){
        Intent dwarfintent = new Intent(PlantActivity.this, DwarfActivity.class);
        startActivity(dwarfintent);
    }

    private void movetoGerberActivity(){
        Intent gerberintent = new Intent(PlantActivity.this, GerberActivity.class);
        startActivity(gerberintent);
    }

    private void movetoFiddleActivity(){
        Intent fiddleintent = new Intent(PlantActivity.this, FiddleActivity.class);
        startActivity(fiddleintent);
    }

    private void movetoWarActivity(){
        Intent warintent = new Intent(PlantActivity.this, WarActivity.class);
        startActivity(warintent);
    }

    private void movetoPepeActivity(){
        Intent peperintent = new Intent(PlantActivity.this, PepeActivity.class);
        startActivity(peperintent);
    }

    private void movetoDieffActivity(){
        Intent dieffintent = new Intent(PlantActivity.this, DieffActivity.class);
        startActivity(dieffintent);
    }

    private void movetoArecaActivity(){
        Intent arecaintent= new Intent(PlantActivity.this, ArecaActivity.class);
        startActivity(arecaintent);
    }

    private void movetoHeartLeafActivity(){
        Intent heartleafintent = new Intent(PlantActivity.this, HeartLeafActivity.class);
        startActivity(heartleafintent);
    }

    private void movetoChineseActivity(){
        Intent chineseintent = new Intent(PlantActivity.this, ChineseActivity.class);
        startActivity(chineseintent);
    }

    private void movetoEnglishActivity(){
        Intent englishintent = new Intent(PlantActivity.this, EnglishActivity.class);
        startActivity(englishintent);
    }

    private void movetoMoneyActivty(){
        Intent moneyintent = new Intent(PlantActivity.this, MoneyActivity.class);
        startActivity(moneyintent);
    }

    private void movetoKalancheActivity(){
        Intent kalancheintent = new Intent(PlantActivity.this, KalancheActivity.class);
        startActivity(kalancheintent);
    }

    private void movetoRubberActivity(){
        Intent rubberintent = new Intent(PlantActivity.this, RubberActivity.class);
        startActivity(rubberintent);
    }

    private void movetoBambooActivity(){
        Intent bamboointent = new Intent(PlantActivity.this, BambooActivity.class);
        startActivity(bamboointent);
    }

    private void movetoSnakeActivity(){
        Intent snakeintnet = new Intent(PlantActivity.this, SnakeActivity.class);
        startActivity(snakeintnet);
    }

    private void movetoGoldenActivity(){
        Intent goldenintent = new Intent(PlantActivity.this, GoldenActivity.class);
        startActivity(goldenintent);
    }

    private void movetoBostonActivity(){
        Intent bostonintent = new Intent(PlantActivity.this, BostonActivity.class);
        startActivity(bostonintent);
    }

    private void movetoPeaceActivity(){
        Intent peaceintent = new Intent(PlantActivity.this, PeaceActivity.class);
        startActivity(peaceintent);
    }

    private void movetoRedActivity(){
        Intent redintent = new Intent(PlantActivity.this, RedActivity.class);
        startActivity(redintent);
    }

    private void movetoFicusActivity(){

        Intent ficusintent = new Intent(PlantActivity.this, FicusActivity.class);
        startActivity(ficusintent);
    }

    private void movetoSpiderActivity(){

        Intent spiderintent = new Intent(PlantActivity.this, SpiderActivity.class);
        startActivity(spiderintent);
    }

    private void movetoChryActivity(){

        Intent chryintent = new Intent(PlantActivity.this, ChrysanthemumActivity.class);
        startActivity(chryintent);
    }
}