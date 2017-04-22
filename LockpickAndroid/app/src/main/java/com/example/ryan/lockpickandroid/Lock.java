package com.example.ryan.lockpickandroid;

import android.widget.Button;

import android.view.*;
import java.util.Random;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Ryan on 4/15/2017.
 */

public class Lock {
    private Pin pin1;
    private Pin pin2;
    private Pin pin3;
    private Pin pin4;
    private boolean brutal;
    private int[] order;

    public Lock() {
        this.pin1 = new Pin(1,false);
        this.pin2 = new Pin(2,false);
        this.pin3 = new Pin(3,false);
        this.pin4 = new Pin(4,false);
        this.brutal = false;
        this.order = generateOrder();
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

    /**public String pickPin1() {
        double rando = ( (Math.random() * 1));
        int randy = ( (int) Math.round(rando));
        setPick1(randy);
        return "You pick pin 1";
    }

    public boolean feelPin1() {
        if (getPick1() == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public String pickPin2() {
        double rando = ( (Math.random() * 1));
        int randy = ( (int) Math.round(rando));
        setPick2(randy);
        return "You pick pin 2";
    }

    public boolean feelPin2() {
        if (getPick2() == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public String pickPin3() {
        double rando = ( (Math.random() * 1));
        int randy = ( (int) Math.round(rando));
        setPick3(randy);
        return "You pick pin 3";
    }

    public boolean feelPin3() {
        if (getPick3() == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public String pickPin4() {
        double rando = ( (Math.random() * 1));
        int randy = ( (int) Math.round(rando));
        setPick4(randy);
        return "You pick pin 4";
    }

    public boolean feelPin4() {
        if (getPick4() == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    public String rake(){
        pickPin1();
        pickPin2();
        pickPin3();
        pickPin4();
        return "You Rake the Lock";
    }
    public String reset(){
        setPick1(0);
        setPick2(0);
        setPick3(0);
        setPick4(0);
        return "The lock has been reset";
    }
    public boolean unlock(){
        if (getPick1() == 1 && getPick2() == 1){
            if (getPick3() ==1 && getPick4() == 1) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }*/

}
