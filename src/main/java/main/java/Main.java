package main.java;

import Tasks.Calculator;
import Tasks.Words;

import java.util.Scanner;

/**
 * Выбор задачи для выполнения - вычисление операций над двумя дробными числами или
 * поиск слова максимальной длины в массиве.
 * Выбор задачи осуществляется из консоли с помощью меню.
 *
 * @author Natalia Litvinova
 */

public class Main {

    /**
     * Выполнение задачи №1: вычисление операций над двумя дробными числами.
     * Выбор операции осуществляется из консоли
     *
     * @see Tasks.Calculator
     */

    private static void calculate() {
        //Объявление переменных
        Scanner myValue = new Scanner(System.in);
        int choice;

        //Ввод пользователем двух дробных чисел
        System.out.println("\nEnter the first value:");
        double valueFirst = myValue.nextDouble();
        System.out.println("Enter the second value:");
        double valueSecond = myValue.nextDouble();

        //Создание объекта калькулятора
        Calculator myCalculator = new Calculator(valueFirst, valueSecond);

        System.out.println();

        //Цикл выбора операции повторяется, пока пользователь не введет команду выхода из модуля
        while (true) {
            //Вывод меню выбора операции
            System.out.println("Which operation do you want to check?");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. Go back to choose a task");

            //Считывание выбора операции
            choice = myValue.nextInt();

            //Выбор операции
            switch (choice) {
                case 1:
                    //При выборе "1" вызывается метод сложения чисел Calculator.plus() и выводится результат
                    System.out.printf("\n%.4f + %.4f = %.4f\n\n",
                            myCalculator.getValueFirst(), myCalculator.getValueSecond(), myCalculator.plus());
                    break;
                case 2:
                    //При выборе "2" вызывается метод вычитания чисел Calculator.minus() и выводится результат
                    System.out.printf("\n%.4f - %.4f = %.4f\n\n",
                            myCalculator.getValueFirst(), myCalculator.getValueSecond(), myCalculator.minus());
                    break;
                case 3:
                    //При выборе "3" вызывается метод умножения чисел Calculator.umnozhit() и выводится результат
                    System.out.printf("\n%.4f * %.4f = %.4f\n\n",
                            myCalculator.getValueFirst(), myCalculator.getValueSecond(), myCalculator.umnozhit());
                    break;
                case 4:
                    //При выборе "4" вызывается метод деления чисел Calculator.delit() и выводится результат
                    System.out.printf("\n%.4f / %.4f = %.4f\n\n",
                            myCalculator.getValueFirst(), myCalculator.getValueSecond(), myCalculator.delit());
                    break;
                case 5:
                    //При выборе "5" происходит выход из модуля
                    System.out.println("\nGoing back to menu...\n");
                    return;
                default:
                    //Вывод ошибки при вводе некорректной команды
                    System.out.println("\nWrong command\n");
            }

            System.out.println("Choose another operation\n");
        }
    }


    /**
     * Поиск слова максимальной длины в массиве.
     * Ввод слов осуществляется из консоли.
     *
     * @see Tasks.Words
     */

    private static void findTheWord() {
        //Объявление переменной Scanner
        Scanner myValue = new Scanner(System.in);

        System.out.println();

        //Ввод количества слов
        System.out.println("Enter amount of words:");
        int countWords = myValue.nextInt();

        //Объявление массива слов
        String[] words = new String[countWords];
        String readAWord;

        //Ввод слов в массив
        System.out.println("\nEnter " + countWords + " words:");
        for (int i = 0; i < countWords; i++) {
            readAWord = myValue.next();
            words[i] = readAWord;
        }

        //Создание класса для массива слов
        Words myWords = new Words(words);

        //Вызов метода Words.findLongest() для поиска слова максимальной длины в массиве
        String longestWord = myWords.findLongest();

        //Вывод данных о слове максимальной длины
        System.out.println("\nThe longest word is:");
        System.out.println(longestWord);
        System.out.println("It's length is:");
        System.out.println(longestWord.length());

        System.out.println("\nGoing back to menu...\n");
    }


    /**
     * Метод main - выбор задачи, которую пользователь хочет решить.
     * Выбор задачи осуществляется из консоли с помощью меню
     *
     * @param args super args?..
     */

    public static void main(String[] args) {
        //Объявление переменных
        Scanner myValue = new Scanner(System.in);
        int choice;

        //Цикл будет выполняться, пока пользователь не введет команду выхода из программы
        while (true) {
            //Вывод меню выбора задачи
            System.out.println("What do you want to do?");
            System.out.println("1. Calculate");
            System.out.println("2. Find the longest word");
            System.out.println("3. Exit");

            //Ввод выбора задачи
            choice = myValue.nextInt();

            //Выбор задачи
            switch (choice) {
                case 1:
                    //При выборе "1" вызывается метод, вычисляющий операции над дробными числами
                    calculate();
                    break;
                case 2:
                    //При выборе "2" вызывается метод, осуществляющий поиск слова максимальной длины
                    findTheWord();
                    break;
                case 3:
                    //При выборе "3" программа завершает работу
                    System.out.println("\nGoodbye\n");
                    return;
                default:
                    //Вывод ошибки выбора задачи
                    System.out.println("\nWrong command\n");
            }
        }
    }
}
