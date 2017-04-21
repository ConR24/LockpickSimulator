package com.example.ryan.lockpickandroid;

import android.widget.Button;

import android.view.*;
import java.util.Random;
import java.util.*;

/**
 * Created by Ryan on 4/15/2017.
 */

public class Lock {
    private int pick1;
    private int pick2;
    private int pick3;
    private int pick4;

    public Lock(int pick1,int pick2, int pick3, int pick4){
        this.pick1 = pick1;
        this.pick2 = pick2;
        this.pick3 = pick3;
        this.pick4 = pick4;
    }

    public String pickPin1() {
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
    }
    private int getPick1() {
        return pick1;
    }

    private int getPick2() {
        return pick2;
    }

    private int getPick3() {
        return pick3;
    }

    private int getPick4() {
        return pick4;
    }

    private void setPick1(int pick1) {
        this.pick1 = pick1;
    }

    private void setPick2(int pick2) {
        this.pick2 = pick2;
    }

    private void setPick3(int pick3) {
        this.pick3 = pick3;
    }

    private void setPick4(int pick4) {
        this.pick4 = pick4;
    }
}
