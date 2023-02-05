// import java.util.Scanner;
// // import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.math.*;

// public class oj1 {
//     // public static double sum(ArrayList<Integer> a, ArrayList<Integer> b) {
//     //     return Math.sqrt(Math.pow(b.get(0) - a.get(0), 2) + Math.pow(b.get(1) - a.get(1), 2));
//     // }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // System.out.println(sum(sc.nextInt(), sc.nextInt()));
//         ArrayList<Integer> a = new ArrayList<Integer>();
//         for (int i = 0; i < 2; i++) {
//             a.add(sc.nextInt());
//         }
//         ArrayList<Integer> b = new ArrayList<Integer>();
//         for (int i = 0; i < 2; i++) {
//             b.add(sc.nextInt());
//         }
//         // System.out.format("%3.lf", sum(a, b));
//         System.out.println((double) Math.round(sum(a, b) * 10000) / 10000);
//     }
// }

import java.math.BigInteger;
import java.util.*;

public class oj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(null);
        BigInteger b = new BigInteger(null);
        a.add(sc.nextInt());
        b.add(sc.nextInt());
        BigInteger c = a + b;
        System.out.println(c);
    }
}