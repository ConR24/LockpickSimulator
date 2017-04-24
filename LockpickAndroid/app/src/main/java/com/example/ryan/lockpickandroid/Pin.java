package com.example.ryan.lockpickandroid;

/**
 * AUTHOR: Ryan Connors
 * DATE: 4/21/17
 * CLASS: Pin.java
 */

/**
 * Class that provides all functionality for the pins of the lock
 */
public class Pin {

    //int identifier for which pin that is
    private int pinNum;
    //boolean that signifies whether the pin is up or not
    private boolean isUp;

    /**
     * Constructor for the pin
     * @param pinNum identifier for the pin
     * @param isUp whether th pin is up or not
     */
    public Pin(int pinNum, boolean isUp) {
        this.pinNum = pinNum;
        this.isUp = isUp;
    }

    //getter for the pinNum
    public int getPinNum() {
        return pinNum;
    }

    //setter for the pinNum
    public void setPinNum(int pinNum) {
        this.pinNum = pinNum;
    }

    //getter for isUp
    public boolean isUp() {
        return isUp;
    }

    //sterr for isUp
    public void setUp(boolean up) { isUp = up; }
}
