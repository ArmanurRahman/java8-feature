package net.armanit.java8;

public interface Vehicle {
    public int getSpeed();
    public void applyBreak();

    public default void autoPilot() {
        System.out.println("Auto pilot activated");
    }

}
