package com.example.appdzikir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TahmidActivity extends AppCompatActivity {
    TextView tvDigit;
    Button btnPress,btnReset;
    private int tambahAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmid);

        tvDigit = findViewById(R.id.tvDigit);
        btnPress = findViewById(R.id.btnPress);
        btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahAngka = 0;
                tvDigit.setText(String.valueOf(tambahAngka));
            }
        });
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambahAngka = tambahAngka+1;
                tvDigit.setText(String.valueOf(tambahAngka));
                if (tambahAngka >= 33) {
                    Toast.makeText(TahmidActivity.this, "Succes Di Tekan", Toast.LENGTH_SHORT).show();
                    btnPress.setEnabled(false);
                }
            }
        });
    }
}
