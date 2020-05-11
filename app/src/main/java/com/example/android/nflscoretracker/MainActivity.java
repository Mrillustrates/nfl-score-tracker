package com.example.android.nflscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreRams = 0;
    int scoreNiners= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method increments score by 7 when the Rams score a TD

    public void scoreTouchdownRams(View view){
        scoreRams = scoreRams + 7;
        displayForRams(scoreRams);
    }
    // This method increments score by 3 when the Rams score a Field Goal!
    public void scoreFieldGoalRams(View view){
        scoreRams= scoreRams + 3;
        displayForRams(scoreRams);

    }
    //This method increments by 2 when Rams score two points
    public void scoreTwoPointsRams(View view){
        scoreRams= scoreRams + 2;
        displayForRams(scoreRams);
    }
    //This method increments by 1 when Rams score an extra point
    public void scoreXtraPointRams(View view){
        scoreRams= scoreRams + 1;
        displayForRams(scoreRams);
    }
    // This method increments score by 7 when the Niners score a TD

    public void scoreTouchdownNiners(View view){
        scoreNiners = scoreNiners + 7;
        displayForNiners(scoreNiners);
    }
    // This method increments score by 3 when the Niners score a Field Goal
    public void scoreFieldGoalNiners(View view){
        scoreNiners= scoreNiners + 3;
        displayForNiners(scoreNiners);

    }
    //This method increments by 2 when Niners score two points
    public void scoreTwoPointsNiners(View view){
        scoreNiners= scoreNiners + 2;
        displayForNiners(scoreNiners);
    }
    //This method increments by 1 when Niners score an extra point
    public void scoreXtraPointNiners(View view){
        scoreNiners= scoreNiners + 1;
        displayForNiners(scoreNiners);
    }
    // This method displays score for the Rams team when user interacts with buttons//
    public void resetScore(View view){
        scoreRams=0;
        scoreNiners=0;
        displayForRams(scoreRams);
        displayForNiners(scoreNiners);
    }

    public void displayForRams(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_rams_score);
        scoreView.setText(String.valueOf(score));
    }
    // This method displays score for the Niners team when user interacts with buttons//

    public void displayForNiners(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_niners_score);
        scoreView.setText(String.valueOf(score));
    }

}
