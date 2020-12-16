package com.example.plantparenthud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView Sbutton;
    private ImageView Pbutton;
    private ImageView SCButton;
    private ImageView Cbutton;
    private ImageView SuccButton;
    private ImageView HerbButton;
    private ImageView HardinessButton;
    private ImageView CalendarButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarButton = (ImageView) findViewById(R.id.Calendarbutton);
        CalendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoCalendarActivity();
            }
        });

        HardinessButton = (ImageView) findViewById(R.id.Hardinessbutton);
        HardinessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoHardinessActivity();
            }
        });

        HerbButton = (ImageView) findViewById(R.id.Herbbutton);
        HerbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoHerbActivity();
            }
        });

        SuccButton = (ImageView) findViewById(R.id.Succbutton);
        SuccButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoSuccActivity();
            }
        });

        Cbutton = (ImageView) findViewById(R.id.Cbutton);
        Cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoCActivity();
            }
        });

        SCButton = (ImageView) findViewById(R.id.SCbutton);
        SCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoSCActivity();
            }
        });


        Pbutton = (ImageView) findViewById(R.id.plantBtn);
        Pbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                movetoPActivity();

            }


                });

        Sbutton = findViewById(R.id.soilBtn);
        Sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                movetoSActivity();
            }

        });


        }
        private void movetoCalendarActivity(){
        Intent intent8 = new Intent(MainActivity.this, CalendarActivity.class);
        startActivity(intent8);
        }
        private void movetoHardinessActivity(){
        Intent intent7 = new Intent(MainActivity.this, HardinessActivity.class);
        startActivity(intent7);
        }
        private void movetoHerbActivity(){
        Intent intent6 = new Intent(MainActivity.this, HerbActivity.class);
        startActivity(intent6);
        }
        private void movetoSuccActivity(){
        Intent intent5 = new Intent(MainActivity.this, SuccActivity.class);
        startActivity(intent5);
        }

        private void movetoCActivity(){
        Intent intent4 = new Intent(MainActivity.this, CactusActivity.class);
        startActivity(intent4);
        }

        private void movetoSCActivity(){
        Intent intent3 = new Intent(MainActivity.this, SCActivity.class);
        startActivity(intent3);
        }

        private void movetoPActivity(){

        Intent intent2 = new Intent(MainActivity.this, PlantActivity.class);
        startActivity(intent2);
        }

        private void movetoSActivity() {

            Intent intent = new Intent(MainActivity.this, SoilActivity.class);
            startActivity(intent);

        }


    }
