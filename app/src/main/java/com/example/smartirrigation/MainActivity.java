package com.example.smartirrigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText croptype,soiltype,currentwater;
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

    }

    public void nextClicked(View view) {
        String cropValue=croptype.getText().toString().toLowerCase();
        String soilValue=soiltype.getText().toString().toLowerCase();
        String currentvalue=currentwater.getText().toString().toLowerCase();
        int required=cropsDatabase.get(cropValue);


    }
}
