package com.example.oyorooms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Welcome To OYO Rooms",Toast.LENGTH_SHORT).show();
                openActivity2();
            }
        });
    }
      public void openActivity2()
      {

          Intent intent = new Intent(this, Activity2.class);
          startActivity(intent);
      }






}
