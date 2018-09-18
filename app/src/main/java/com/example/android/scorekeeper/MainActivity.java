package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int foulsA = 0;
    int foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementAndDisplayScoreA(View v) {
        scoreA++;
        displayScoreForTeamA(scoreA);
    }

    public void incrementAndDisplayFoulsA(View v) {
        foulsA++;
        displayFoulsForTeamA(foulsA);
    }

    public void incrementAndDisplayScoreB(View v) {
        scoreB++;
        displayScoreForTeamB(scoreB);
    }

    public void incrementAndDisplayFoulsB(View v) {
        foulsB++;
        displayFoulsForTeamB(foulsB);
    }

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        foulsA = 0;
        foulsB = 0;
        displayScoreForTeamA(scoreA);
        displayScoreForTeamB(scoreB);
        displayFoulsForTeamA(foulsA);
        displayFoulsForTeamB(foulsB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team A.
     */
    public void displayFoulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team B.
     */
    public void displayFoulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(fouls));
    }
}