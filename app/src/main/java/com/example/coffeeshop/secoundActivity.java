package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secoundActivity extends AppCompatActivity {
    private Button buttonGO;
    TextView coffeeName;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        buttonGO = findViewById(R.id.btn1);
        coffeeName=findViewById(R.id.ice1);

        buttonGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityTw();
            }
        });


    }
    private void moveToActivityTw(){
        Log.d("RISH", "OnClick listener work identify...");
        Intent intent = new Intent(secoundActivity.this,thirdActivity.class);
        startActivity(intent);
    }
}
