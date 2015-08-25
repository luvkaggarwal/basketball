package in.edu.meri.basketball;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class StartGame extends AppCompatActivity {

    int scoreA;
    int scoreB;

    StartGame() {
        scoreA = scoreB = 0;
    }

    public void displayA() {
        TextView score = (TextView) findViewById(R.id.scoreA);
        score.setText(String.valueOf(scoreA));
    }

    public void displayB() {
        TextView score = (TextView) findViewById(R.id.scoreB);
        score.setText(String.valueOf(scoreB));
    }

    public void add3TeamA(View view) {
        scoreA += 3;
        displayA();
    }

    public void add2TeamA(View view) {
        scoreA += 2;
        displayA();
    }

    public void add1TeamA(View view) {
        scoreA += 1;
        displayA();
    }

    public void add3TeamB(View view) {
        scoreB += 3;
        displayB();
    }

    public void add2TeamB(View view) {
        scoreB += 2;
        displayB();
    }

    public void add1TeamB(View view) {
        scoreB += 1;
        displayB();
    }

    public void end(View view) {
        TextView teamA = (TextView) findViewById(R.id.teamAname);
        TextView teamB = (TextView) findViewById(R.id.teamBname);

        setContentView(R.layout.end_page);
        TextView winner = (TextView) findViewById(R.id.TheEnd);

        if (scoreA > scoreB)
            winner.setText("  " + teamA.getText());
        else if (scoreB > scoreA)
            winner.setText("  " + teamB.getText());
        else winner.setText("  DRAW");

        scoreA = 0;
        scoreB = 0;

    }
}
