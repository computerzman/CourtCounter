package com.example.android.courtcounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA = 0;
    int scorePlayerB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_view);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View v) {
        scorePlayerA = scorePlayerA + 3;
        displayForTeamA(scorePlayerA);
    }

    public void addTwoForTeamA(View v) {
        scorePlayerA = scorePlayerA + 2;
        displayForTeamA(scorePlayerA);
    }

    public void addOneForTeamA(View v) {
        scorePlayerA = scorePlayerA + 1;
        displayForTeamA(scorePlayerA);
    }


    public void addThreeForTeamB(View v) {
        scorePlayerB = scorePlayerB + 3;
        displayForTeamB(scorePlayerB);
    }

    public void addTwoForTeamB(View v) {
        scorePlayerB = scorePlayerB + 2;
        displayForTeamB(scorePlayerB);
    }

    public void addOneForTeamB(View v) {
        scorePlayerB = scorePlayerB + 1;
        displayForTeamB(scorePlayerB);
    }

    public void resetScore(View v) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForTeamA(scorePlayerA);
        displayForTeamB(scorePlayerB);
    }

}
