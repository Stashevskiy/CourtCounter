package com.stashevskiy.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    final int CONSTANT_ONE = 1;
    final int CONSTANT_TWO = 2;
    final int CONSTANT_THREE = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_three_for_team_A:
                scoreTeamA = scoreTeamA + CONSTANT_THREE;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.btn_two_for_team_A:
                scoreTeamA = scoreTeamA + CONSTANT_TWO;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.btn_free_for_team_A:
                scoreTeamA = scoreTeamA + CONSTANT_ONE;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.btn_three_for_team_B:
                scoreTeamB = scoreTeamB + CONSTANT_THREE;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.btn_two_for_team_B:
                scoreTeamB = scoreTeamB + CONSTANT_TWO;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.btn_free_for_team_B:
                scoreTeamB = scoreTeamB + CONSTANT_ONE;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.btn_reset:
                scoreTeamA = 0;
                scoreTeamB = 0;
                displayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
                break;
        }
    }

    private void displayForTeamA(int countTeamA) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(countTeamA));
    }

    private void displayForTeamB(int countTeamB) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(countTeamB));
    }

}
