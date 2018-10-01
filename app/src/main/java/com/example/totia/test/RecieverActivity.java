package com.example.totia.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecieverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);

        TextView tvAvtivity = (TextView) findViewById(R.id.tvActivity2);

        TextView tvHello = (TextView) findViewById(R.id.tvHello);
        tvHello.setText(getIntent().getExtras().getString("hello"));

        Button btnReciever = (Button) findViewById(R.id.btnReciever);
        btnReciever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.putExtra("helloBack","Hello Activity Sender.");
                setResult(20,intent);
                finish();
            }
        });
    }
}
