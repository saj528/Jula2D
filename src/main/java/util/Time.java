package util;

public class Time {

    public static float timeStarted = System.nanoTime();

    public static float getTime() {
        //returns converted current time in seconds rather than nanoseconds
        return (float) ((System.nanoTime() - timeStarted) * 1E-9);
    }
}