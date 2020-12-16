package com.example.plantparenthud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HerbActivity extends AppCompatActivity {

    private ImageView SageButton;
    private ImageView ParsleyButton;
    private ImageView OreganoButton;
    private ImageView MintButton;
    private ImageView CorianderButton;
    private ImageView BasilButton;
    private ImageView ChivesButton;
    private ImageView DillButton;
    private ImageView RosemaryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herb);

        RosemaryButton = (ImageView) findViewById(R.id.Rosemarybutton);
        RosemaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoRosemaryActivity();
            }
        });

        DillButton = (ImageView) findViewById(R.id.Dillbutton);
        DillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoDillActivity();
            }
        });

        ChivesButton = (ImageView) findViewById(R.id.Chivesbutton);
        ChivesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoChivesActivity();
            }
        });

        BasilButton = (ImageView) findViewById(R.id.Basilbutton);
        BasilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoBasilActivity();
            }
        });

        CorianderButton = (ImageView) findViewById(R.id.Corianderbutton);
        CorianderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoCorianderActivity();
            }
        });

        MintButton = (ImageView) findViewById(R.id.Mintbutton);
        MintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoMintActivity();
            }
        });

        OreganoButton = (ImageView) findViewById(R.id.Oreganobutton);
        OreganoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoOreganoActivity();
            }
        });

        ParsleyButton = (ImageView) findViewById(R.id.Parsleybutton);
        ParsleyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoParsleyActivity();
            }
        });

        SageButton = (ImageView) findViewById(R.id.Sagebutton);
        SageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoSageActivity();
            }
        });
    }

    private void movetoRosemaryActivity(){
        Intent rosemaryintent = new Intent(HerbActivity.this, RosemaryActivity.class);
        startActivity(rosemaryintent);
    }

    private void movetoDillActivity(){
        Intent dillintent = new Intent(HerbActivity.this, DillActivity.class);
        startActivity(dillintent);
    }

    private void movetoChivesActivity(){
        Intent chiveintent = new Intent(HerbActivity.this, ChivesActivity.class);
        startActivity(chiveintent);
    }

    private void movetoBasilActivity(){
        Intent basilintent = new Intent(HerbActivity.this, BasilActivity.class);
        startActivity(basilintent);
    }

    private void movetoCorianderActivity(){
        Intent corianderintent = new Intent(HerbActivity.this, CorianderActivity.class);
        startActivity(corianderintent);
    }

    private void movetoMintActivity(){
        Intent mintintent = new Intent(HerbActivity.this, MintActivity.class);
        startActivity(mintintent);
    }

    private void movetoOreganoActivity(){
        Intent oreganointent = new Intent(HerbActivity.this, OreganoActivity.class);
        startActivity(oreganointent);
    }

    private void movetoParsleyActivity(){
        Intent parsleyintent = new Intent(HerbActivity.this, ParsleyActivity.class);
        startActivity(parsleyintent);
    }

    private void movetoSageActivity(){
        Intent sageintent = new Intent(HerbActivity.this, SageActivity.class);
        startActivity(sageintent);
    }
}