// package javaOOP;

// import java.util.Scanner;

// public class part1 {
//     public String name;
//     public int age;

//     public static void main(String[] args) {
//         part1 s = new part1();
//         s.name = "hoan ha";
//         s.age = 19;
//         System.out.println(s.name + " " + s.age);
//     }
// }
package javaOOP;

import java.util.Scanner;

public class part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int value = sc.nextInt();
        for (int i = n; i >= pos + 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
        n++;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}