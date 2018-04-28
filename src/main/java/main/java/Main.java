package main.java;

import Tasks.Calculator;
import Tasks.Words;

import java.util.Scanner;

public class Main {
    private static void calculate() {
        Scanner myValue = new Scanner(System.in);
        int choice;

        System.out.println("\nEnter the first value:");
        double valueFirst = myValue.nextDouble();
        System.out.println("Enter the second value:");
        double valueSecond = myValue.nextDouble();

        Calculator myCalculator = new Calculator(valueFirst, valueSecond);

        System.out.println();

        while (true) {
            System.out.println("Which operation do you want to check?");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. Go back to choose a task");

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("\n%.4f + %.4f = %.4f\n\n",
                            myCalculator.getValueFirst(), myCalculator.getValueSecond(), myCalculator.plus());
                    break;
                case 2:
                    System.out.printf("\n%.4f - %.4f = %.4f\n\n",
                            myCalculator.getValueFirst(), myCalculator.getValueSecond(), myCalculator.minus());
                    break;
                case 3:
                    System.out.printf("\n%.4f * %.4f = %.4f\n\n",
                            myCalculator.getValueFirst(), myCalculator.getValueSecond(), myCalculator.umnozhit());
                    break;
                case 4:
                    System.out.printf("\n%.4f / %.4f = %.4f\n\n",
                            myCalculator.getValueFirst(), myCalculator.getValueSecond(), myCalculator.delit());
                    break;
                case 5:
                    System.out.println("\nGoing back to menu...\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }

            System.out.println("Choose another operation\n");
        }
    }

    private static void findTheWord() {
        Scanner myValue = new Scanner(System.in);

        System.out.println();

        System.out.println("Enter amount of words:");
        int countWords = myValue.nextInt();

        String[] words = new String[countWords];
        String readAWord;

        System.out.println("\nEnter " + countWords + " words:");
        for (int i = 0; i < countWords; i++) {
            readAWord = myValue.next();
            words[i] = readAWord;
        }

        Words myWords = new Words(words);

        String longestWord = myWords.findLongest();

        System.out.println("\nThe longest word is:");
        System.out.println(longestWord);
        System.out.println("It's length is:");
        System.out.println(longestWord.length());

        System.out.println("\nGoing back to menu...\n");
    }

    public static void main(String[] args) {
        Scanner myValue = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Calculate");
            System.out.println("2. Find the longest word");
            System.out.println("3. Exit");

            choice = myValue.nextInt();

            switch (choice) {
                case 1:
                    calculate();
                    break;
                case 2:
                    findTheWord();
                    break;
                case 3:
                    System.out.println("\nGoodbye\n");
                    return;
                default:
                    System.out.println("\nWrong command\n");
            }
        }
    }
}
