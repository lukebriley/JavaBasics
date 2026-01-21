package io.github.lukebriley;

public class Cool {

    public int value1 = 42;
    private int value2 = 7;
    final public int finalValue1 = 100;
    final private int finalValue2;

    public Cool() {
        System.out.println("Hello from Cool class constructor!");
        finalValue2 = 200;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public int getValue2() {
        return value2;
    }

    public int getFinalValue2() {
        return finalValue2;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }


    public void displayValues() {
        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("finalValue1: " + finalValue1);
        System.out.println("finalValue2: " + finalValue2);
    }
}
