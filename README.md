# LockpickSimulator-Android

Android lockpicking game using the [Apache Commons Lang Api](https://commons.apache.org/proper/commons-lang/index.html)

## About

This project was done for Computer Science House as my major project, it orginally started as an opportunity to learn android app development, it qucikly also became my first experience using an api, which is the [Apache Commons Lang 3.5](https://commons.apache.org/proper/commons-lang/index.html) api. The app gives you a 4 pin lock to pick through the actions provided as buttons within the app. Once the lock is unlocked, you win and the game tells you how long it took you to unlock the lock and restarts the game.

## Resources Used

  - [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html)
  - [Android Studio](https://developer.android.com/studio/index.html)
  - [Apache Commons Lang Api 3.5](https://commons.apache.org/proper/commons-lang/index.html)
 
## Lock

Class representing the lock that is being picked.

- attributes:
   - Pin pin1: Pin object for the first pin in the lock
   - Pin pin2: Pin object for the second pin in the lock
   - Pin pin3: Pin object for the third pin in the lock.
   - Pin pin4: Pin object for the fourth pin in the lock.
   - int[] order: Array that denotes the order in which the pins must be picked
   - boolean brutal: boolean denoting whether brutal mode has been implemented
