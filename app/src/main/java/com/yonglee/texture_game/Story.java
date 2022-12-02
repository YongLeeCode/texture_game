package com.yonglee.texture_game;

import android.view.View;

import com.yonglee.texture_game.GameScreen;

public class Story {
    GameScreen gs;
    String next1, next2, next3, next4;

    public Story(GameScreen gs){
        this.gs = gs;
    }

    public void selectNext(String next){
        switch (next){
            case "startingPoint": startingPoint(); break;
            case "south": south(); break;
            case "north": north(); break;
            case "east": east(); break;
            case "west": west(); break;
            case "box": box(); break;
            case "nw": nw(); break;
            case "win": win(); break;
            case "ne": ne(); break;
            case "sw": sw(); break;
            case "se": se(); break;
            case "die": die(); break;
        }
    }

    public void showbuttons(){
        gs.button1.setVisibility(View.VISIBLE);
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.VISIBLE);
        gs.button4.setVisibility(View.VISIBLE);
    }
    public void notshowbutton(){
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);
    }


    public void die(){
        gs.image.setImageResource(R.drawable.road);
        gs.text.setText("Do you want to start again?");

        gs.button1.setText("Yes");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");

        notshowbutton();

        next1 = "startingPoint";
        next2 = "";
        next3 = "";
        next4 = "";
    }

    public void startingPoint(){
        gs.image.setImageResource(R.drawable.road);
        gs.text.setText("You start adventure! Where do you want to go?");

        showbuttons();

        gs.button1.setText("North");
        gs.button2.setText("South");
        gs.button3.setText("East");
        gs.button4.setText("West");

        next1 = "north";
        next2 = "south";
        next3 = "east";
        next4 = "west";
    }

    public void east(){
        gs.image.setImageResource(R.drawable.regeneration);
        gs.text.setText("You meet a assassin. \n what is your choice?");

        gs.button1.setText("go back");
        gs.button2.setText("run to left way");
        gs.button3.setText("run to right way");
        gs.button4.setText("fight");

        showbuttons();
        next1 = "die";
        next2 = "die";
        next3 = "die";
        next4 = "die";
    }

    public void box(){
        gs.image.setImageResource(R.drawable.lockedchestbox);
        gs.text.setText("You meet a android robot. \n what is your choice?");

        gs.button1.setText("go back");
        gs.button2.setText("run to left way");
        gs.button3.setText("run to right way");
        gs.button4.setText("Kick it");

        next1 = "startingPoint";
        next2 = "crazyMagician";
        next3 = "box";
        next4 = "die";
    }

    public void west(){
        gs.image.setImageResource(R.drawable.ic_launcher_foreground);
        gs.text.setText("You meet a android robot. \n what is your choice?");

        gs.button1.setText("go back");
        gs.button2.setText("run to left way");
        gs.button3.setText("run to right way");
        gs.button4.setText("Kick it");

        showbuttons();
        next1 = "startingPoint";
        next2 = "sw";
        next3 = "nw";
        next4 = "die";
    }

    public void south(){
        gs.image.setImageResource(R.drawable.rock);
        gs.text.setText("You meet a fighter. He wants to fight with you. \n what is your choice?");

        gs.button1.setText("go back");
        gs.button2.setText("run to left way");
        gs.button3.setText("run to right way");
        gs.button4.setText("fight");

        showbuttons();
        next1 = "startingPoint";
        next2 = "se";
        next3 = "sw";
        next4 = "die";
    }

    public void north(){
        gs.image.setImageResource(R.drawable.flamer);
        gs.text.setText("Fire! The forest is burning. \n what is your choice?");

        gs.button1.setText("go back");
        gs.button2.setText("run to left way");
        gs.button3.setText("run to right way");
        gs.button4.setText("find water");

        showbuttons();
        next1 = "startingPoint";
        next2 = "nw";
        next3 = "ne";
        next4 = "die";
    }

    public void nw(){
        gs.image.setImageResource(R.drawable.potionofmadness);
        gs.text.setText("You meet a crazy RockScissorPaper champion.\nIf you beat the fight, you will take the portion.\n what is your choice?");

        gs.button4.setText("go back");
        gs.button2.setText("rock");
        gs.button3.setText("scissor");
        gs.button1.setText("paper");

        gs.button4.setVisibility(View.INVISIBLE);

        next1 = "startingPoint";
        next2 = "die";
        next3 = "die";
        next4 = "win";
    }

    public void win(){
        gs.image.setImageResource(R.drawable.potionofmadness);
        gs.text.setText("You won! Your adventure is done. Do you want to try a new game?");

        gs.button4.setText("");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button1.setText("New Game");

        notshowbutton();


        next4 = "";
        next2 = "";
        next3 = "";
        next1 = "startingPoint";
    }

    public void ne(){
        gs.image.setImageResource(R.drawable.potionofmadness);
        gs.text.setText("You meet a crazy RockScissorPaper champion.\nIf you beat the fight, you will take the portion.\n what is your choice?");

        gs.button1.setText("go back");
        gs.button2.setText("rock");
        gs.button3.setText("scissor");
        gs.button4.setText("paper");


        next1 = "startingPoint";
        next2 = "die";
        next3 = "die";
        next4 = "win";
    }

    public void sw(){
        gs.image.setImageResource(R.drawable.potionofmadness);
        gs.text.setText("You meet a crazy RockScissorPaper champion.\nIf you beat the fight, you will take the portion.\n what is your choice?");

        gs.button1.setText("go back");
        gs.button2.setText("rock");
        gs.button3.setText("scissor");
        gs.button4.setText("paper");

        gs.button1.setVisibility(View.INVISIBLE);

        next1 = "startingPoint";
        next2 = "die";
        next3 = "die";
        next4 = "win";
    }

    public void se(){
        gs.image.setImageResource(R.drawable.potionofmadness);
        gs.text.setText("You meet a crazy RockScissorPaper champion.\nIf you beat the fight, you will take the portion.\n what is your choice?");

        gs.button1.setText("go back");
        gs.button2.setText("rock");
        gs.button3.setText("scissor");
        gs.button4.setText("paper");

        gs.button1.setVisibility(View.INVISIBLE);

        next1 = "startingPoint";
        next2 = "die";
        next3 = "die";
        next4 = "win";
    }
}
