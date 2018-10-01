package com.example.totia.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SenderActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        TextView tvActivity1 = (TextView) findViewById(R.id.tvActivity1);
        Button btnSender = (Button) findViewById(R.id.btnSendeer);
        btnSender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SenderActivity.this,RecieverActivity.class);
                intent.putExtra("hello" , "Hello activity 2.");
                startActivityForResult(intent,10);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 10 ){
            if (resultCode == 20){
                String strHelloBack = data.getExtras().getString("helloBack");
                TextView tvHelloBack = (TextView) findViewById(R.id.tvHelloBack);
                tvHelloBack.setText(strHelloBack);
            }
        }
    }
}