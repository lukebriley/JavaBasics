package io.github.lukebriley;

public class Cooler {

    public int value1 = 42;
    private int birthYear;
    final public int finalValue1 = 100;
    final private int finalValue2;

    public Cooler() {
        System.out.println("Hello from Cooler class constructor!");
        finalValue2 = 200;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int getFinalValue2() {
        return finalValue2;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear < 1900 || birthYear > 2026) {
            throw new IllegalArgumentException("Birthyear must be between 1900 and 2026");
        }
        this.birthYear = birthYear;
    }


    public void displayValues() {
        System.out.println("value1: " + value1);
        System.out.println("value2: " + birthYear);
        System.out.println("finalValue1: " + finalValue1);
        System.out.println("finalValue2: " + finalValue2);
    }
}
