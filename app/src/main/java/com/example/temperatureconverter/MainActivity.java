/*Hello! This is an temp converter program. C to F and vice-versa
* I have not included any buttons because
* in my opinion there is no need for them here!
* I have tried to make this application as simple as possible!
* */
    package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        EditText cel, far;
        TextView outcel, outfar;//"out" as in output
        double temp, result;


        /*
        ********Learning activity!***********
        * please skip this part!
        @Override
         protected void onResume() {
             super.onResume();
             Log.v("Potato", "onRestart");

         }

         @Override
         protected void onStart() {
             super.onStart();
             Log.v("Potato", "onStart");
         }

         @Override
         protected void onDestroy() {
             super.onDestroy();
             Log.v("Potato", "onDestroy");

         }
         protected void onStop(){
             super.onStop();
             Log.v("Potato", "onStop");
         }

         @Override
         protected void onPause() {
             super.onPause();
             Log.v("Potato", "onPause");
         }
         ******************************************
         */
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //Log.v("Potato", "onCreate");
            setContentView(R.layout.activity_main);

            //try catch for double value errors
            try {

                cel = findViewById(R.id.cel);//cel as in celsius
                far = findViewById(R.id.far);//you guessed is right!
                outfar = findViewById(R.id.outfar);//output in fahrenheit
                outcel = findViewById(R.id.outcel);//same as above!

                /*I have omitted this as it is not necessary as
                //the enter button is more useful here!
                cel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        far.setHint(null);
                        outcel.setText(null);
                        cel.setHint("Celsius");

                    }
                });
                */

                /*This is the activity when celsius edittext is altered*/
                cel.setOnKeyListener((v, keyCode, event) ->
                {
                    outcel.setText(null);//to clear cel output because of prev conv from F
                    // If the event is a key-down event on the "enter" button
                    if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                            (keyCode == KeyEvent.KEYCODE_ENTER))
                    {
                        far.setText(null);//clearing far text if any
                        far.setHint(null);//clearing hint as hint is not connected to output.
                        //output is displaying while far is still showing hint.
                        //hint is for edit text and not text view!
                        // Perform action on key press
                        temp = Double.parseDouble(String.valueOf(cel.getText()));
                        result = temp * 1.8 + 32;


                        outfar.setText(Math.round(result) + " F");


                        //Toast.makeText(MainActivity.this, cel.getText(), Toast.LENGTH_SHORT).show();
                        return true;
                    }

                    return false;
                });

                /*This is the activity when fahrenheit is altered*/
                far.setOnKeyListener((v, keyCode, event) ->
                {
                    outfar.setText(null);
                    //same as above!


                    // If the event is a key-down event on the "enter" button
                    if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        cel.setText(null);//same...
                        cel.setHint(null);

                        // Perform action on key press
                        temp = Double.parseDouble(String.valueOf(far.getText()));
                        result = (temp - 32) / .5556;

                        outcel.setText(Math.round(result) + " C");

                        //Toast.makeText(MainActivity.this, cel.getText(), Toast.LENGTH_SHORT).show();
                        return true;
                    }

                    return false;
                });

            } catch (Exception i) {
                i.printStackTrace();
            }
        }
    }

/*This is by Mohit Singh on 1st Feb 2021*/

