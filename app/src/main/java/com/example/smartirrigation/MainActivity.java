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
        cropsDatabase.put("rice",1250);
        cropsDatabase.put("rice",1250);
        cropsDatabase.put("rice",1250);
        cropsDatabase.put("rice",1250);
        cropsDatabase.put("rice",1250);
        cropsDatabase.put("rice",1250);
        cropsDatabase.put("rice",1250);
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
