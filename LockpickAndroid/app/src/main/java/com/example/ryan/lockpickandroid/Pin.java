package com.example.ryan.lockpickandroid;

/**
 * Created by Ryan on 4/21/2017.
 */

public class Pin {
    private int pinNum;
    private boolean isUp;

    public Pin(int pinNum, boolean isUp) {
        this.pinNum = pinNum;
        this.isUp = isUp;
    }

    public String pickPin(Pin pin) {
        double rando = ( (Math.random() * 1));
        int randy = ( (int) Math.round(rando));
        return "";
    }

    public String feelPin(Pin pin) {
        return "";
    }

    public String rake(){
        return "";
    }
}
