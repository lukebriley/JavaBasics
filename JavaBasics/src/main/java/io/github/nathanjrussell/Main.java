package io.github.nathanjrussell;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

// I made a change!

    public static void main(String[] args) {

        //demonstrate printing to console (print vs println)
        System.out.println("Hello Everyone!");
        System.out.print("This will not add a newline. ");
        System.out.print("So this is on the same line.\n");
        System.out.print("This is on a new line now");
        System.out.println("This adds a newline automatically."); // Print a newline
        System.out.println("This is printed on a new line.");

        // Using for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // Using while loop
        int i = 1;
        while (i <= 5) {
            System.out.println("While Count: " + i);
            i++;
        }

        // Using array to demonstrate for-each loop
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String day : weekDays) {
            System.out.println("Day: " + day);
        }

    }
}