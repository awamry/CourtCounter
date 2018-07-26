package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    final int POINTS_FOR_FREE_THROW = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    public void addThreePointsForTeamA(View view){
        TextView score = (TextView) findViewById(R.id.team_a_score);
        int points = Integer.valueOf(score.getText().toString());
        points+=3;
        displayForTeamA(points);

    }
    public void addTwoPointsForTeamA(View view){
        TextView score = (TextView) findViewById(R.id.team_a_score);
        int points = Integer.valueOf(score.getText().toString());
        points+=2;
        displayForTeamA(points);
    }
    public void addOnePointForTeamA(View view){
        TextView score = (TextView) findViewById(R.id.team_a_score);
        int points = Integer.valueOf(score.getText().toString());
        points+=1;
        displayForTeamA(points);

    }
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addThreePointsForTeamB(View view){
        TextView score = (TextView) findViewById(R.id.team_b_score);
        int points = Integer.valueOf(score.getText().toString());
        points+=3;
        displayForTeamB(points);

    }
    public void addTwoPointsForTeamB(View view){
        TextView score = (TextView) findViewById(R.id.team_b_score);
        int points = Integer.valueOf(score.getText().toString());
        points+=2;
        displayForTeamB(points);
    }
    public void addOnePointForTeamB(View view){
        TextView score = (TextView) findViewById(R.id.team_b_score);
        int points = Integer.valueOf(score.getText().toString());
        points+=1;
        displayForTeamB(points);

    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
    public void reset(View view){
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
