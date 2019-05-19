package org.dsumps200.gcu.rpslsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_rock, btn_paper, btn_scissors, btn_lizard, btn_spock;
    ArrayList<String> options = new ArrayList<>();
    String p1Choice;
    TextView txt_p1Choice;

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
                break;

            case R.id.btn_paper:
                p1Choice = options.get(1);
                txt_p1Choice.setText(p1Choice);
                break;

            case R.id.btn_scissors:
                p1Choice = options.get(2);
                txt_p1Choice.setText(p1Choice);
                break;

            case R.id.btn_lizard:
                p1Choice = options.get(3);
                txt_p1Choice.setText(p1Choice);
                break;

            case R.id.btn_spock:
                p1Choice = options.get(4);
                txt_p1Choice.setText(p1Choice);
                break;

            default:
                break;

        }
    }
}
