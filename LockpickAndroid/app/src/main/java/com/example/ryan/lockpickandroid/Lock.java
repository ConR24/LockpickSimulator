package com.example.ryan.lockpickandroid;

import android.widget.Button;
import android.view.*;
import org.apache.commons.lang3.time.StopWatch;
import java.util.Random;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * AUTHOR: Ryan Connors
 * DATE: 4/15/17
 * CLASS: Lock.java
 */


/**
 * Class that handles the lock object and all associated operatations
 */
public class Lock {

    //Pin object for the first pin in the lock
    private Pin pin1;
    //Pin object for the second pin in the lock
    private Pin pin2;
    //Pin object for the third pin in the lock
    private Pin pin3;
    //Pin object for the fourth pin in the lock
    private Pin pin4;
    //int[] that denotes the order the pins must be picked in
    private int[] order;
    //StopWatch object that times how lomg it takes the user to slove the lock
    private StopWatch watch;

    //tracker int used to make sure that order is being followed
    public int curr = 0;

    /**
     * Constructor for the lock object
     */
    public Lock() {
        this.pin1 = new Pin(1,false);
        this.pin2 = new Pin(2,false);
        this.pin3 = new Pin(3,false);
        this.pin4 = new Pin(4,false);
        this.order = generateOrder();
        this.watch = new StopWatch();
    }

    /**
     * Helper function that starts the stopwatch
     */
    public void timeStart(){
        this.watch.start();
    }

    /**
     * Helper function that resets the stopwatch
     */
    public void timeReset(){
        this.watch.reset();
    }

    /**
     * Helper function that stops the stopwatch
     */
    public void timeStop(){
        this.watch.stop();
    }

    /**
     * Helper function that gets the current time on the stopwatch is string form
     * @return String representation of the current time on the stopwatch
     */
    public String getTime(){
        return this.watch.toString();
    }

    private int[] generateOrder(){
        double rando = ( (Math.random() * 1));
        int randy = ( (int) Math.round(rando));

        if (randy == 0){
            int[] order1 = {1,4,3,2};
            return order1;
        }
        else {
            int[] order2 = {4,2,1,3};
            return order2;
        }
    }

    /**
     * Operation to pick the pick to try and put it in the unlocked state
     * @param PinNum Pin that is being picked
     * @return status updated that is being sent to update the gui.
     */
    public String pickPin(int PinNum) {
        String update = "";
        if (PinNum != this.order[curr]){
            this.reset();
            update = "You touch the wrong pin and the lock resets!";
        }
        else{
            double rando = ( (Math.random() * 1));
            int randy = ( (int) Math.round(rando));

            switch (PinNum) {
                case 1:
                    if (randy == 1){
                        curr++;
                        this.getPin1().setUp(true);
                    }
                    else {
                        this.getPin1().setUp(false);
                    }
                    update = "You pick Pin 1.";
                break;

                case 2:
                    if (randy == 1){
                        curr++;
                        this.getPin2().setUp(true);
                    }
                    else {
                        this.getPin2().setUp(false);
                    }
                    update = "You pick Pin 2.";
                break;

                case 3:
                    if (randy == 1){
                        curr++;
                        this.getPin3().setUp(true);
                    }
                    else {
                        this.getPin3().setUp(false);
                    }
                    update = "You pick Pin 3.";
                break;

                case 4:
                    if (randy == 1){
                        curr++;
                        this.getPin4().setUp(true);
                    }
                    else {
                        this.getPin4().setUp(false);
                    }
                    update = "You pick Pin 4.";
                break;
            }
        }
        return update;
    }

    /**
     * Operation to feel the pin to tell whether it is up or not
     * @param pinNum pin that is being felt
     * @return boolean whether or not the pin is up or not
     */
    public boolean feelPin(int pinNum) {
        if (pinNum == 1){
            return this.getPin1().isUp();
        }
        else if (pinNum == 2){
            return this.getPin2().isUp();
        }
        else if (pinNum == 3){
            return this.getPin3().isUp();
        }
        else {
            return this.getPin4().isUp();
        }
    }

    /**
     * Rakes the lock and picks all the pins regardless of order
     * @return status update for the gui
     */
    public String rake(){
        this.pickPin(1);
        this.pickPin(2);
        this.pickPin(3);
        this.pickPin(4);
        return "You Rake the Lock";
    }

    /**
     * resets everything back to app start up conditions
     * @return status update for the gui
     */
    public String startOver(){
        reset();
        timeReset();
        timeStart();
        this.setOrder(generateOrder());
        return "The lock and timer have been reset";
    }

    /**
     * Resets the lock back to it's initial conditons
     * @return status text for the gui
     */
    public String reset(){
        this.getPin1().setUp(false);
        this.getPin2().setUp(false);
        this.getPin3().setUp(false);
        this.getPin4().setUp(false);
        curr = 0;
        return "The lock has been reset";
    }

    /**
     * Function that handles unlocking the lock.
     * @return boolean whether or not that lock is unlocked based on current conditions
     */
    public boolean unlock(){
        if (this.getPin1().isUp() && this.getPin2().isUp()) {
            if (this.getPin3().isUp() && this.getPin4().isUp()){
                timeStop();
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    //getter for pin1
    public Pin getPin1() { return pin1; }

    //getter for pin2
    public Pin getPin2() {return pin2; }

    //getter for pin3
    public Pin getPin3() { return pin3; }

    //getter for pin4
    public Pin getPin4() { return pin4; }

    //setter to set the order
    public void setOrder(int[] order) { this.order = order;}
}
