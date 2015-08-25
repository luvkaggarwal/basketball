package in.edu.meri.basketball;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends StartGame {

    String NameTeamA;
    String NameTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void start(View view) {
        setContentView(R.layout.home_page);
    }

    public void teamNames(View view) {
        setContentView(R.layout.team_names);
    }

    public void startGame(View view) {
        setContentView(R.layout.play_game);

        TextView team = (TextView) findViewById(R.id.teamAname);
        team.setText(NameTeamA);

        team = (TextView) findViewById(R.id.teamBname);
        team.setText(NameTeamB);
    }

    public void okNameTeam(View view) {
        EditText ok = (EditText) findViewById(R.id.ok_a_name);
        NameTeamA = ok.getText().toString();

        ok = (EditText) findViewById(R.id.ok_b_name);
        NameTeamB = ok.getText().toString();

        setContentView(R.layout.home_page);

        TextView team = (TextView) findViewById(R.id.teamA);
        team.setText(NameTeamA);

        team = (TextView) findViewById(R.id.teamB);
        team.setText(NameTeamB);

        Button playGame = (Button) findViewById(R.id.playGame);
        playGame.setVisibility(View.VISIBLE);
    }
}