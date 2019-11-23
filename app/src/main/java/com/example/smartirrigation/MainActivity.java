package com.example.smartirrigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    EditText croptype,soiltype,currentwater;
    TextView tapState,timeLeft;


    HashMap<String,Integer> cropsDatabase=new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cropsDatabase.put("rice",1250);

        cropsDatabase.put("Groundnut",550);
        cropsDatabase.put("Sorghum",350);
        cropsDatabase.put("Maize",500);
        cropsDatabase.put("Sugarcane",2000);
        cropsDatabase.put("Ragi",350);
        cropsDatabase.put("Cotton",550);
        cropsDatabase.put("Pulses",350);
        croptype=findViewById(R.id.crop);
        soiltype=findViewById(R.id.soil);
        currentwater=findViewById(R.id.current_water);
        tapState=findViewById(R.id.tap_state);
        timeLeft=findViewById(R.id.time_left);
    }
    long time;
    public void nextClicked(View view) {
        String cropValue=croptype.getText().toString().toLowerCase();
        String soilValue=soiltype.getText().toString().toLowerCase();
        int currentvalue= Integer.parseInt(currentwater.getText().toString());
        int required=cropsDatabase.get(cropValue);
        time=(required-currentvalue)/10;
        tapState.setText("Tap open");
        new CountDownTimer(time*1000, 1000) {

            public void onTick(long millisUntilFinished) {
                timeLeft.setText(millisUntilFinished/1000+"");
            }

            public void onFinish() {
                tapState.setText("Tap closed");
                timeLeft.setText("0");
                Toast.makeText(MainActivity.this, "Tap Closed", Toast.LENGTH_SHORT).show();
            }
        }.start();

    }
}
