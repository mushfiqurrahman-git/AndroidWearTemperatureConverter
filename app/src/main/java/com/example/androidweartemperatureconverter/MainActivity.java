package com.example.androidweartemperatureconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidweartemperatureconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();

        setContentView(view);

        activityMainBinding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = String.valueOf(Integer.parseInt(String.valueOf(activityMainBinding.textView14.getText())));
                //int C = (input-32)
                Integer intInput = Integer.parseInt(input);
                Integer C = ((intInput - 32) * 5) / 9;
                String result = C.toString()+" F";

                activityMainBinding.textView21.setText(result);
            }
        });
        activityMainBinding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = String.valueOf(Integer.parseInt(String.valueOf(activityMainBinding.textView14.getText())));

                Integer intInput = Integer.parseInt(input);
                Integer F = ((intInput * 9) / 5) + 32;
                String result = F.toString()+" C";
                activityMainBinding.textView21.setText(result);
            }
        });
    }
}