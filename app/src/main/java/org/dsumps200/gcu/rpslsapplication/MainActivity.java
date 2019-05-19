package org.dsumps200.gcu.rpslsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_rock, btn_paper, btn_scissors, btn_lizard, btn_spock;
    ArrayList<String> options = new ArrayList<>();
    String p1Choice, computerChoice;
    TextView txt_p1Choice, txt_computerChoice, txt_action, txt_winner;

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

        btn_rock.setOnClickListener(this);
        btn_paper.setOnClickListener(this);
        btn_scissors.setOnClickListener(this);
        btn_lizard.setOnClickListener(this);
        btn_spock.setOnClickListener(this);
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
                break;

            case R.id.btn_scissors:
                p1Choice = options.get(2);
                txt_p1Choice.setText(p1Choice);
                generateComputerChoice();
                break;

            case R.id.btn_lizard:
                p1Choice = options.get(3);
                txt_p1Choice.setText(p1Choice);
                generateComputerChoice();
                break;

            case R.id.btn_spock:
                p1Choice = options.get(4);
                txt_p1Choice.setText(p1Choice);
                generateComputerChoice();
                break;

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
                break;

            case "Scissors":
                break;

            case "Lizard":
                break;

            case "Spock":
                break;

            default:
                break;

        }
    }

    private void rockVs() {
        switch (computerChoice) {
            case "Rock":
                txt_action.setText("...");
                txt_winner.setText("It's a draw!");
                break;

            case "Paper":
                txt_action.setText("Paper covers Rock!");
                txt_winner.setText("Computer wins!");
                break;

            case "Scissors":
                txt_action.setText("Rock crushes Scissors!");
                txt_winner.setText("Player 1 wins!");
                break;

            case "Lizard":
                txt_action.setText("Rock crushes Lizard!");
                txt_winner.setText("Player 1 wins!");
                break;

            case "Spock":
                txt_action.setText("Spock vaporizes Rock!");
                txt_winner.setText("Computer wins!");
                break;

            default:
                break;
        }
    }
}
