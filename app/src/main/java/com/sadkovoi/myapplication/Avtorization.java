package com.sadkovoi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Avtorization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avtorization);

        Button tost_shop = findViewById(R.id.button2);
        tost_shop.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Inten = new Intent(Avtorization.this, Regestration.class);
                startActivity(Inten);
            }



        });



    }

}