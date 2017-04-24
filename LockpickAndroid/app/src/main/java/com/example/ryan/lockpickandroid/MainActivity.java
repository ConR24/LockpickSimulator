package com.example.ryan.lockpickandroid;

import android.content.Context;
import android.icu.util.TimeUnit;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.example.ryan.lockpickandroid.R.styleable.View;

/**
 * Main class used to handle all the buttons in the app/handles creating the app
 */
public class MainActivity extends AppCompatActivity {

    //Lock object that will be used for the game
    public Lock l = new Lock();

    //Allows for vibration when used by the feel function
    public static Vibrator vibe;

    /**
     * Inital creation of the app, starts the timer
     * @param savedInstanceState the app that needs to be created
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        l.timeStart();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * function that allows the 1st pin to be picked via button press
     * @param v View that is being updated
     */
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
            status.setText("The pin pushes back");
        }
    }

    /**
     * function that allows the 2nd pin to be picked via button press
     * @param v View that is being updated
     */
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

    /**
     * function that allows the 3rd pin to be picked via button press
     * @param v View that is being updated
     */
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

    /**
     * function that allows the 4th pin to be picked via button press
     * @param v View that is being updated
     */
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

    /**
     * Button function that handles restarting the game.
     * @param v View that is being updated
     */
    public void updateReset(View v){
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.startOver();
        status.setText(update);
    }

    /**
     * Button function that handles unlocking the lock.
     * @param v View that is being updated
     */
    public void updateUnlock(View v){
        TextView status = (TextView) findViewById(R.id.StatusView);
        if (l.unlock()){
            String yourTime = l.getTime();
            status.setText("The Lock is Unlocked! The lock will be reset! Your time was: "+ yourTime);
            l.startOver();
        }
        else {
            status.setText("The lock is still locked");
        }

    }

    /**
     * Button function that handles raking the lock
     * @param v View that is being updated
     */
    public void updateRake(View v){
        TextView status = (TextView) findViewById(R.id.StatusView);
        String update = l.rake();
        status.setText(update);
    }

    /**
     * Button function that handles the about statement
     * @param v View that is being updated
     */
    public void updateAbout(View v){
        TextView status = (TextView) findViewById(R.id.StatusView);
        status.setText("This app was created by Ryan Connors");
    }
}
