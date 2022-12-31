package com.linkedin.javacodechallenges;

import java.util.Scanner;
import java.util.regex.*;

public class App {

    public static boolean containsPattern(String regex, String input) {
        boolean result = false;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        result = matcher.find();
        return result;
    }

    public static boolean isPasswordComplex(String password) {
        boolean result = false;
        
        result = password.length() >= 6 &&
         containsPattern("[A-Z]", password)// check for upper case
                && containsPattern("[a-z]", password) // check for lower case
                && containsPattern("[0-9]", password);// check for digit

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
