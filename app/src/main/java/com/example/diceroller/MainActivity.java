package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b_roll;
    TextView tv_rollNumber;
    ImageView iv_dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          b_roll = (Button) findViewById(R.id.b_roll);
          tv_rollNumber = (TextView) findViewById(R.id.tv_rollNumber);
          iv_dice = (ImageView) findViewById(R.id.iv_dice);

          b_roll.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Random r = new Random();
                  int theRoll;

                  // random number between 1 and 6
                  theRoll = r.nextInt(6) + 1;
                  tv_rollNumber.setText("You rolled a " + theRoll);

                  switch (theRoll) {
                      case 1: {
                          iv_dice.setImageResource(R.drawable.dice1);
                          ;
                          break;
                      }

                      case 2: {
                          iv_dice.setImageResource(R.drawable.dice2);
                          ;
                          break;
                      }

                      case 3: {
                          iv_dice.setImageResource(R.drawable.dice3);
                          ;
                          break;
                      }

                      case 4: {
                          iv_dice.setImageResource(R.drawable.dice4);
                          ;
                          break;
                      }

                      case 5: {
                          iv_dice.setImageResource(R.drawable.dice5);
                          ;
                          break;
                      }

                      case 6: {
                          iv_dice.setImageResource(R.drawable.dice6);
                          ;
                          break;
                      }


                  }
              }
          });
    }

}
