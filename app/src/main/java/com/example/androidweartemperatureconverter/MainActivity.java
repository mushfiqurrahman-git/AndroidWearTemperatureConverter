package com.example.androidweartemperatureconverter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidweartemperatureconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //use of view binding
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflating the layout thru view binding
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        //getting to the root
        View view = activityMainBinding.getRoot();
        //setting the view
        setContentView(view);
        
        //onclick listener for C
        activityMainBinding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //converting the input to Sting value
                try {
                    String input = String.valueOf(Integer.parseInt(String.valueOf(activityMainBinding.textView14.getText())));
                    //parsing to int
                    Integer intInput = Integer.parseInt(input);
                    //calculation
                    Integer C = ((intInput - 32) * 5) / 9;
                    //storing the result as string
                    String result = C.toString();
                    //showing the result in result section
                    activityMainBinding.textView21.setText(result);
                    //changing the TEXT based on btn
                    activityMainBinding.textView2.setText("F°");
                }catch (NumberFormatException exception)
                {//showing Toast if there is no input given
                    Toast.makeText(MainActivity.this, "Enter input to get F°", Toast.LENGTH_SHORT).show();
                }

            }
        });
        
        
        //onclick listener for F
        activityMainBinding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String input = String.valueOf(Integer.parseInt(String.valueOf(activityMainBinding.textView14.getText())));
                    Integer intInput = Integer.parseInt(input);
                    Integer F = ((intInput * 9) / 5) + 32;
                    String result = F.toString();
                    activityMainBinding.textView21.setText(result);
                    activityMainBinding.textView2.setText("C°");
                } catch (NumberFormatException exception) {
                    Toast.makeText(MainActivity.this, "Enter input to get C°", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}