package io.github.lukebriley;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Everyone!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        int i = 1;
        while (i <= 5) {
            System.out.println("While Count: " + i);
            i++;
        }
    }
}