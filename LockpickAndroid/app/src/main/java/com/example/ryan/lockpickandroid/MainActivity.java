package com.example.ryan.lockpickandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.ryan.lockpickandroid.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    public Lock l = new Lock(0,0,0,0,false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updatePick1(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.pickPin1();
        status.setText(update);
    }
    public void updateFeel1(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.feelPin1();
        status.setText(update);
    }
    public void updatePick2(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.pickPin2();
        status.setText(update);
    }
    public void updateFeel2(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.feelPin2();
        status.setText(update);
    }
    public void updatePick3(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.pickPin3();
        status.setText(update);
    }
    public void updateFeel3(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.feelPin3();
        status.setText(update);
    }
    public void updatePick4(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.pickPin4();
        status.setText(update);
    }
    public void updateFeel4(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.feelPin4();
        status.setText(update);
    }
}
