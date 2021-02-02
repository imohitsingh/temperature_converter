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
    TextView outcel, outfar;
    double c,f;

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

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v("Potato", "onCreate");

        setContentView(R.layout.activity_main);

        try {

            cel = findViewById(R.id.cel);
            far = findViewById(R.id.far);
            outfar = findViewById(R.id.outfar);
            outcel = findViewById(R.id.outcel);

            /*c = Double.parseDouble(String.valueOf(cel.getText()));
            f = Double.parseDouble(String.valueOf(far.getText()));

            f = c * 1.8 + 32;
            c = (f - 32) * 0.55;

             */

            cel.setOnKeyListener((v, keyCode, event) -> {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Perform action on key press

                    //outfar.setText(String.valueOf(f));
                    //outcel.setText(String.valueOf(c));



                    Toast.makeText(MainActivity.this, cel.getText(), Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            });
        }
    catch (Exception i)
    {
        i.printStackTrace();
    }}}

