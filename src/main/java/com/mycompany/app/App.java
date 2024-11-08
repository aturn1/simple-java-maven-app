package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
          for (int i = 1; i <= 5;) {
            System.out.println(i);
        }
    }

    public String getMessage() {
        return MESSAGE;
    }
}
