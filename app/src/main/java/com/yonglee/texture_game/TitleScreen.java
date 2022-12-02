package com.yonglee.texture_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        Button startButton = (Button)findViewById(R.id.startButton);
        startButton.setText("ㅣSTARTㅣ");
        TextView titleT = (TextView)findViewById(R.id.titleText);
        titleT.setText("Are you ready to go on an adventure?");
    }

    public void goGameScreen(View view){
        Intent gameScreen = new Intent(this, GameScreen.class);
        startActivity(gameScreen);
    }
}