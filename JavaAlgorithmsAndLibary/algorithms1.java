package JavaAlgorithmsAndLibary;

import java.util.*;

public class algorithms1 {
    public static boolean Check(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int Fibo(int n) {
        if (n <= 1)
            return n;
        return Fibo(n - 1) + Fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Check(n));
        int a = sc.nextInt();
        System.out.println(Fibo(a));
    }
}
