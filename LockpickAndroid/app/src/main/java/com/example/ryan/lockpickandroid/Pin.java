package com.example.ryan.lockpickandroid;

public class Pin {

    private int pinNum;
    private boolean isUp;

    public Pin(int pinNum, boolean isUp) {
        this.pinNum = pinNum;
        this.isUp = isUp;
    }

    public int getPinNum() {
        return pinNum;
    }

    public void setPinNum(int pinNum) {
        this.pinNum = pinNum;
    }

    public boolean isUp() {
        return isUp;
    }

    public void setUp(boolean up) {
        isUp = up;
    }
}
