package com.yonglee.texture_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameScreen extends AppCompatActivity {

    ImageView image;
    TextView text;
    Button button1, button2, button3, button4;

    Story story = new Story(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        image = (ImageView)findViewById(R.id.imageView);
        text = (TextView)findViewById(R.id.textView);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);

        story.startingPoint();
    }
    public void button1(View view){
        story.selectNext(story.next1);
    }
    public void button2(View view){
        story.selectNext(story.next2);
    }
    public void button3(View view){
        story.selectNext(story.next3);
    }
    public void button4(View view){
        story.selectNext(story.next4);
    }
}