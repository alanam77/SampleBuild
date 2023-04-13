/////////////////////////
// CSCI 3326.01
// Spring 2023
// Lab 11B
// Alan Mendez
/////////////////////////

package com.example.lab11b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rockBtn = findViewById(R.id.rock_btn);
        Button paperBtn = findViewById(R.id.paper_btn);
        Button scissorsBtn = findViewById(R.id.scissors_btn);
        TextView UserInput = findViewById(R.id.UserInput);
        TextView CompInput = findViewById(R.id.ComputerInput);
        TextView ResultOutput = findViewById(R.id.ResultOutput);

        rockBtn.setOnClickListener(v -> {
            UserInput.setText("You chose Rock!");
            int compInput = (int)(Math.random() * (2 + 1 - 0));
            if(compInput == 0){
                CompInput.setText("Computer chose Rock!");
                ResultOutput.setText("It's a draw!");
            }
            else if(compInput == 1){
                CompInput.setText("Computer chose Paper!");
                ResultOutput.setText("You lose!");
            }
            else{
                CompInput.setText("Computer chose Scissors!");
                ResultOutput.setText("You win!");
            }
        });
        paperBtn.setOnClickListener(v -> {
            UserInput.setText("You chose Paper!");
            int compInput = (int)(Math.random() * (2 + 1 - 0));
            if(compInput == 1){
                CompInput.setText("Computer chose Paper!");
                ResultOutput.setText("It's a draw!");
            }
            else if(compInput == 2){
                CompInput.setText("Computer chose Scissors!");
                ResultOutput.setText("You lose!");
            }
            else{
                CompInput.setText("Computer chose Rock!");
                ResultOutput.setText("You win!");
            }
        });
        scissorsBtn.setOnClickListener(v -> {
            UserInput.setText("You chose Scissors!");
            int compInput = (int)(Math.random() * (2 + 1 - 0));
            if(compInput == 2){
                CompInput.setText("Computer chose Scissors!");
                ResultOutput.setText("It's a draw!");
            }
            else if(compInput == 0){
                CompInput.setText("Computer chose Rock!");
                ResultOutput.setText("You lose!");
            }
            else{
                CompInput.setText("Computer chose Paper!");
                ResultOutput.setText("You win!");
            }
        });
    }
}