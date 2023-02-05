package JavaAlgorithmsAndLibary;

import java.io.*;
import java.util.*;

public class tree {

    public static boolean isPrime(int a) {
        if (a < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrime(ArrayList<Integer> contain) {
        int count = 0;
        for (int i = 0; i < contain.size(); i++) {
            if (isPrime(contain.get(i))) {
                ++count;
            }
        }
        if (count == contain.size() - 1)
            return true;
        return false;
    }

    public static int sumIsPrime(ArrayList<Integer> contain) {
        int sum = 0;
        for (int x : contain) {
            sum += x;
        }
        return sum;
    }

    public static ArrayList<Integer> tachso(int a) {
        ArrayList<Integer> contain = new ArrayList<Integer>();
        while (a >= 1) {
            contain.add(a % 10);
            a /= 10;
        }
        for (int x : contain) {
            System.out.println(x);
        }
        return contain;
    }

    public static boolean sumIscheck(int a) {
        if (a < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0)
                return true;
        }
        return false;
    }

    public static boolean check(int a) {
        ArrayList<Integer> contain = new ArrayList<Integer>();
        contain = tachso(a);
        if (isPrime(a) && isPrime(contain) && sumIscheck(sumIsPrime(contain))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (check(i)) {
                ++count;
            }
        }
        System.out.println(count);
        String s = sc.next();
        sc.close();
    }
}