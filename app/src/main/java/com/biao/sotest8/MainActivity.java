package com.biao.sotest8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import raio.Raio;

public class MainActivity extends AppCompatActivity {

    private Button btn_get_sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btn_get_sum = findViewById(R.id.btn_get_sum);

        btn_get_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Raio.get_sum(12, 13);
                btn_get_sum.setText(String.valueOf(i));
            }
        });
    }
}
