package LearnJava;

import java.lang.StackWalker.Option;

import javax.swing.*;
import libaryJavax.InputDialogInFrame;

class Test<T, Y> {
    T obj1;
    Y obj2;

    public Test() {

    }

    public void add(T obj1, Y obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void display() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

public class handleFile {
    public static void main(String[] args) {
        Test<Integer, Integer> checkThread = new Test<Integer, Integer>();

        // checkThread.add(20, 2);
        // checkThread.display();
        // int computerNumber = (int) (Math.random() * 100 + 1);
        // int userAnswer = 0;
        // System.out.println("The correct guess would be " + computerNumber);
        // int count = 1;
        InputDialogInFrame m = new InputDialogInFrame();
        // while (userAnswer != computerNumber) {
        // String response = JOptionPane.showInputDialog(m,
        // "Enter a guess between 1 and 100", "Guessing Game", 3);
        // userAnswer = Integer.parseInt(response);
        // JOptionPane.showMessageDialog(m, "" + determineGuess(userAnswer,
        // computerNumber, count));
        // count++;
        // }

    }

    public static String determineGuess(int userAnswer, int computerNumber, int count) {
        if (userAnswer <= 0 || userAnswer > 100) {
            return "Your guess is invalid";
        } else if (userAnswer == computerNumber) {
            return "Correct!\nTotal Guesses: " + count;
        } else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        } else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        } else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}