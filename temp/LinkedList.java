// // import javax.security.sasl.AuthenticationException;

// // import java.util.*;
// // import java.nio.file.*;

// // public class LinkedList {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int a = sc.nextInt();
// //         int b = sc.nextInt();
// //         int c = sc.nextInt();
// //         double p = (a + b + c) / 2;
// //         double s = Math.floor((double) Math.sqrt((double) (p * (p - a) * (p - b) * (p - c) * 100) / 100));
// //         System.out.println(s);

// //         sc.close();
// //     }
// // }

// // @FunctionalInterface
// interface bye {
//     public String sum();
// }

// class LinkedList {
//     static void checkAge(int age)
//             throws ArithmeticException {
//         if (age < 18) {
//             throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//         } else {
//             System.out.println("Access granted - You are old enough!");
//         }
//     }

//     public static void main(String[] args) {
//         // bye m = new bye() {
//         // @Override
//         // public String sum() {
//         // return "hoan ha";
//         // }
//         // };
//         bye m = () -> {
//             return "hoan ha";
//         };
//         System.out.println(m.sum());
//         // checkAge(m(, 10));
//     }
// }

// ;

import java.util.Scanner;
import java.math.*;

public class LinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }
    }
}