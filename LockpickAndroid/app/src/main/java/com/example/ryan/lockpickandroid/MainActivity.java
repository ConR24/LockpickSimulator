package com.example.ryan.lockpickandroid;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.ryan.lockpickandroid.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    public Lock l = new Lock();
    public static Vibrator vibe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updatePick1(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.pickPin(1);
        status.setText(update);
    }
    public void updateFeel1(View v) {
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);;
        TextView status = (TextView) findViewById(R.id.StatusView);
        Button b = (Button) findViewById(R.id.Feel1);
        if (l.feelPin(1)) {
            status.setText("You feel nothing there");
        }
        else {
            vibe.vibrate(100);
            status.setText("The pin pushes back.");
        }
    }
    public void updatePick2(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.pickPin(2);
        status.setText(update);
    }
    public void updateFeel2(View v) {
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);;
        TextView status = (TextView) findViewById(R.id.StatusView);
        Button b = (Button) findViewById(R.id.Feel2);
        if (l.feelPin(2)) {
            status.setText("You feel nothing there");
        }
        else {
            vibe.vibrate(100);
            status.setText("The pin pushes back");
        }
    }
    public void updatePick3(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.pickPin(3);
        status.setText(update);
    }
    public void updateFeel3(View v) {
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);;
        TextView status = (TextView) findViewById(R.id.StatusView);
        Button b = (Button) findViewById(R.id.Feel3);
        if (l.feelPin(3)) {
            status.setText("You feel nothing there");
        }
        else {
            vibe.vibrate(100);
            status.setText("The pin pushes back");
        }
    }
    public void updatePick4(View v) {
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.pickPin(4);
        status.setText(update);
    }
    public void updateFeel4(View v) {
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);;
        TextView status = (TextView) findViewById(R.id.StatusView);
        Button b = (Button) findViewById(R.id.Feel4);
        if (l.feelPin(4)) {
            status.setText("You feel nothing there");
        }
        else {
            vibe.vibrate(100);
            status.setText("The pin pushes back");
        }
    }
    public void updateReset(View v){
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.reset();
        status.setText(update);
    }
    public void updateUnlock(View v){
        TextView status = (TextView) findViewById(R.id.StatusView);
        if (l.unlock()){
            status.setText("The Lock is Unlocked! Press Reset to start over!");
        }
        else {
            status.setText("The lock is still locked");
        }

    }
    public void updateRake(View v){
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.rake();
        status.setText(update);
    }
    public void updateAbout(View v){
        TextView status = (TextView) findViewById(R.id.StatusView);
        status.setText("This app was created by Ryan Connors");
    }
}
