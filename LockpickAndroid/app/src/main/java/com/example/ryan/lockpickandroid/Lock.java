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

    public int curr = 0;

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

    public String pickPin(int PinNum) {
        String update = "";
        if (PinNum != this.order[curr]){
            this.reset();
            curr = 0;
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

    public String rake(){
        this.pickPin(1);
        this.pickPin(2);
        this.pickPin(3);
        this.pickPin(4);
        return "You Rake the Lock";
    }
    public String reset(){
        this.getPin1().setUp(false);
        this.getPin2().setUp(false);
        this.getPin3().setUp(false);
        this.getPin4().setUp(false);
        return "The lock has been reset";
    }

    public boolean unlock(){
        if (this.getPin1().isUp() && this.getPin2().isUp()) {
            if (this.getPin3().isUp() && this.getPin4().isUp()){
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

    public String brutalMode() {
        if(this.isBrutal()) {
            this.setBrutal(false);
            return "Brutal mode disabled.";
        }
        else {
            this.setBrutal(true);
            return "Brutal mode enabled";
        }
    }


    public Pin getPin1() {
        return pin1;
    }

    public void setPin1(Pin pin1) {
        this.pin1 = pin1;
    }

    public Pin getPin2() {
        return pin2;
    }

    public void setPin2(Pin pin2) {
        this.pin2 = pin2;
    }

    public Pin getPin3() {
        return pin3;
    }

    public void setPin3(Pin pin3) {
        this.pin3 = pin3;
    }

    public Pin getPin4() {
        return pin4;
    }

    public void setPin4(Pin pin4) {
        this.pin4 = pin4;
    }

    public boolean isBrutal() {
        return brutal;
    }

    public void setBrutal(boolean brutal) {
        this.brutal = brutal;
    }
}
