package com.example.gallery007;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secpage extends AppCompatActivity {

    private Button btnpagephoto;
    private Button btnpagechat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secpage);

        btnpagephoto = (Button) findViewById(R.id.btnpagephoto);
        btnpagechat = (Button) findViewById(R.id.btnpagechat);

        btnpagechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainImageActivity2();
            }
        });

        btnpagephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openMainActivity();
            }
        });



    }

    public void openMainImageActivity2() {
        Intent intent = new Intent(this, MainImageActivity2.class);
        startActivity(intent);

    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
