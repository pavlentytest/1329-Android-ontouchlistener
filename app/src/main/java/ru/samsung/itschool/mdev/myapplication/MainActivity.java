package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    private Button btn, btn2;
    private TextView tv;
    private ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ButterKnife
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cl.setBackgroundColor(Color.RED);
            }
        });

        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        tv = findViewById(R.id.hello);
        cl = findViewById(R.id.root);
        cl.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button2:
                Snackbar.make(findViewById(R.id.root),R.string.ura,Snackbar.LENGTH_LONG).show();
                break;
            case R.id.root:
                cl.setBackgroundColor(Color.parseColor("#cccccc"));

        }


    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}