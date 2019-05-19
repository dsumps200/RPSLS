package org.dsumps200.gcu.rpslsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_rock, btn_paper, btn_scissors, btn_lizard, btn_spock, btn_reset;
    ArrayList<String> options = new ArrayList<>();
    String p1Choice, computerChoice;
    TextView txt_p1Choice, txt_computerChoice, txt_action, txt_winner, txt_wins, txt_draws, txt_losses;
    int wins = 0;
    int draws = 0;
    int losses = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        options.add("Rock");
        options.add("Paper");
        options.add("Scissors");
        options.add("Lizard");
        options.add("Spock");

        btn_rock = findViewById(R.id.btn_rock);
        btn_paper = findViewById(R.id.btn_paper);
        btn_scissors = findViewById(R.id.btn_scissors);
        btn_lizard = findViewById(R.id.btn_lizard);
        btn_spock = findViewById(R.id.btn_spock);
        txt_p1Choice = findViewById(R.id.txt_p1Choice);
        txt_computerChoice = findViewById(R.id.txt_computerChoice);
        txt_action = findViewById(R.id.txt_action);
        txt_winner = findViewById(R.id.txt_winner);
        txt_wins = findViewById(R.id.txt_wins);
        txt_draws = findViewById(R.id.txt_draws);
        txt_losses = findViewById(R.id.txt_losses);
        btn_reset = findViewById(R.id.btn_reset);

        btn_rock.setOnClickListener(this);
        btn_paper.setOnClickListener(this);
        btn_scissors.setOnClickListener(this);
        btn_lizard.setOnClickListener(this);
        btn_spock.setOnClickListener(this);
        btn_reset.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_rock:
                p1Choice = options.get(0);
                txt_p1Choice.setText(p1Choice);
                generateComputerChoice();
                calculateAction();
                break;

            case R.id.btn_paper:
                p1Choice = options.get(1);
                txt_p1Choice.setText(p1Choice);
                generateComputerChoice();
                calculateAction();
                break;

            case R.id.btn_scissors:
                p1Choice = options.get(2);
                txt_p1Choice.setText(p1Choice);
                generateComputerChoice();
                calculateAction();
                break;

            case R.id.btn_lizard:
                p1Choice = options.get(3);
                txt_p1Choice.setText(p1Choice);
                generateComputerChoice();
                calculateAction();
                break;

            case R.id.btn_spock:
                p1Choice = options.get(4);
                txt_p1Choice.setText(p1Choice);
                generateComputerChoice();
                calculateAction();
                break;

            case R.id.btn_reset:
                txt_p1Choice.setText("");
                txt_computerChoice.setText("");
                txt_action.setText("");
                txt_winner.setText("");
                txt_wins.setText("");
                txt_draws.setText("");
                txt_losses.setText("");
                wins = 0;
                draws = 0;
                losses = 0;

            default:
                break;

        }
    }

    private void generateComputerChoice() {
        computerChoice = options.get(new Random().nextInt(options.size()));
        txt_computerChoice.setText(computerChoice);
    }

    private void calculateAction() {
        switch (p1Choice) {
            case "Rock":
                rockVs();
                break;

            case "Paper":
                paperVs();
                break;

            case "Scissors":
                scissorsVs();
                break;

            case "Lizard":
                lizardVs();
                break;

            case "Spock":
                spockVs();
                break;

            default:
                break;

        }
    }

    private void rockVs() {
        switch (computerChoice) {
            case "Rock":
                txt_action.setText(getString(R.string.drawVs));
                txt_winner.setText(getString(R.string.draw));
                draws = draws + 1;
                txt_draws.setText(Integer.toString(draws));
                break;

            case "Paper":
                txt_action.setText(getString(R.string.paperVsRock));
                txt_winner.setText(getString(R.string.lose));
                losses = losses + 1;
                txt_losses.setText(Integer.toString(losses));
                break;

            case "Scissors":
                txt_action.setText(getString(R.string.rockVsScissors));
                txt_winner.setText(getString(R.string.win));
                wins = wins + 1;
                txt_wins.setText(Integer.toString(wins));
                break;

            case "Lizard":
                txt_action.setText(getString(R.string.rockVsLizard));
                txt_winner.setText(getString(R.string.win));
                wins = wins + 1;
                txt_wins.setText(Integer.toString(wins));
                break;

            case "Spock":
                txt_action.setText(getString(R.string.rockVsSpock));
                txt_winner.setText(getString(R.string.lose));
                losses = losses + 1;
                txt_losses.setText(Integer.toString(losses));
                break;

            default:
                break;
        }
    }

    private void paperVs() {
        switch (computerChoice) {
            case "Rock":
                txt_action.setText(getString(R.string.paperVsRock));
                txt_winner.setText(getString(R.string.win));
                wins = wins + 1;
                txt_wins.setText(Integer.toString(wins));
                break;

            case "Paper":
                txt_action.setText(getString(R.string.drawVs));
                txt_winner.setText(getString(R.string.draw));
                draws = draws + 1;
                txt_draws.setText(Integer.toString(draws));
                break;

            case "Scissors":
                txt_action.setText(getString(R.string.paperVsScissors));
                txt_winner.setText(getString(R.string.lose));
                losses = losses + 1;
                txt_losses.setText(Integer.toString(losses));
                break;

            case "Lizard":
                txt_action.setText(getString(R.string.paperVsLizard));
                txt_winner.setText(getString(R.string.lose));
                losses = losses + 1;
                txt_losses.setText(Integer.toString(losses));
                break;

            case "Spock":
                txt_action.setText(getString(R.string.paperVsSpock));
                txt_winner.setText(getString(R.string.win));
                wins = wins + 1;
                txt_wins.setText(Integer.toString(wins));
                break;

            default:
                break;
        }
    }

    private void scissorsVs() {
        switch (computerChoice) {
            case "Rock":
                txt_action.setText(getString(R.string.rockVsScissors));
                txt_winner.setText(getString(R.string.lose));
                losses = losses + 1;
                txt_losses.setText(Integer.toString(losses));
                break;

            case "Paper":
                txt_action.setText(getString(R.string.paperVsScissors));
                txt_winner.setText(getString(R.string.win));
                wins = wins + 1;
                txt_wins.setText(Integer.toString(wins));
                break;

            case "Scissors":
                txt_action.setText(getString(R.string.drawVs));
                txt_winner.setText(getString(R.string.draw));
                draws = draws + 1;
                txt_draws.setText(Integer.toString(draws));
                break;

            case "Lizard":
                txt_action.setText(getString(R.string.scissorsVsLizard));
                txt_winner.setText(getString(R.string.win));
                wins = wins + 1;
                txt_wins.setText(Integer.toString(wins));
                break;

            case "Spock":
                txt_action.setText(getString(R.string.scissorsVsSpock));
                txt_winner.setText(getString(R.string.lose));
                losses = losses + 1;
                txt_losses.setText(Integer.toString(losses));
                break;

            default:
                break;
        }
    }

    private void lizardVs() {
        switch (computerChoice) {
            case "Rock":
                txt_action.setText(getString(R.string.rockVsLizard));
                txt_winner.setText(getString(R.string.lose));
                losses = losses + 1;
                txt_losses.setText(Integer.toString(losses));
                break;

            case "Paper":
                txt_action.setText(getString(R.string.paperVsLizard));
                txt_winner.setText(getString(R.string.win));
                wins = wins + 1;
                txt_wins.setText(Integer.toString(wins));
                break;

            case "Scissors":
                txt_action.setText(getString(R.string.scissorsVsLizard));
                txt_winner.setText(getString(R.string.lose));
                losses = losses + 1;
                txt_losses.setText(Integer.toString(losses));
                break;

            case "Lizard":
                txt_action.setText(getString(R.string.drawVs));
                txt_winner.setText(getString(R.string.draw));
                draws = draws + 1;
                txt_draws.setText(Integer.toString(draws));
                break;

            case "Spock":
                txt_action.setText(getString(R.string.lizardVsSpock));
                txt_winner.setText(getString(R.string.win));
                wins = wins + 1;
                txt_wins.setText(Integer.toString(wins));
                break;

            default:
                break;
        }
    }

    private void spockVs() {
        switch (computerChoice) {
            case "Rock":
                txt_action.setText(getString(R.string.rockVsSpock));
                txt_winner.setText(getString(R.string.win));
                wins = wins + 1;
                txt_wins.setText(Integer.toString(wins));
                break;

            case "Paper":
                txt_action.setText(getString(R.string.paperVsSpock));
                txt_winner.setText(getString(R.string.lose));
                losses = losses + 1;
                txt_losses.setText(Integer.toString(losses));
                break;

            case "Scissors":
                txt_action.setText(getString(R.string.scissorsVsSpock));
                txt_winner.setText(getString(R.string.win));
                wins = wins + 1;
                txt_wins.setText(Integer.toString(wins));
                break;

            case "Lizard":
                txt_action.setText(getString(R.string.lizardVsSpock));
                txt_winner.setText(getString(R.string.lose));
                losses = losses + 1;
                txt_losses.setText(Integer.toString(losses));
                break;

            case "Spock":
                txt_action.setText(getString(R.string.drawVs));
                txt_winner.setText(getString(R.string.draw));
                draws = draws + 1;
                txt_draws.setText(Integer.toString(draws));
                break;

            default:
                break;
        }
    }

}
