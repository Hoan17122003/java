
// package javaOOP;
import java.util.*;
import java.util.function.Consumer;

// // import java.util.*;

// // interface Int {

// // }
// // // @FunctionalInterface void print(a) {
// // // System.out.println(a);
// // // }

// // public class lambda {
// //     public static void main(String[] args) {
// //         ArrayList<Integer> numbers = new ArrayList<Integer>();
// //         numbers.add(5);
// //         numbers.add(9);
// //         numbers.add(8);
// //         numbers.add(1);
// //         Stack<Integer> a = new Stack<Integer>();
// //         numbers.forEach((n) -> {
// //             a.push(n + 3);
// //         });
// //         int o = (a = 4) -> {
// //             System.out.println(a);
// //         };
// //         for (int x : numbers) {
// //             System.out.println(x);
// //         }
// //         System.out.println(a.search(4));
// //         while (!a.empty()) {
// //             System.out.println(a.peek());
// //             a.pop();
// //         }

// //     }
// // }
// package javaOOP;

// // Định nghĩa khuôn mẫu cho method truyền vô
// @FunctionalInterface
// interface Calculable {
//     double calculate();
// }

// // Có thể gọi được method trong khuôn mẫu
// // Method thực sự truyền vào, được wrap vô trong khuôn mẫu
// public class lambda {
//     public static void printResult(Calculable func) {
//         System.out.println("Result: " + func.calculate());
//     }

//     public static void main(String[] args) {
//         // new Calculable thì là xử lý trong để xử dụng method calculate mà không khởi
//         // tạo đối tượng nên sử dụng được
//         // có thể hiểu nó khởi tạo đối tượng lớp con rồi xử dụng feature của nó rồi ghi
//         // đè
//         printResult(new Calculable() {
//             @Override
//             public double calculate() {
//                 return 3.14;
//             }
//         });
//     }
// }
// package javaOOP;

// import java.util.Scanner;

// interface Drawable {
//     public void draw();
// }

// abstract class i {
//     public void display() {
//         System.out.println("u la tr");
//     };

//     public void screen() {
//         System.out.println("fullScreen");
//     }
// }

// public class lambda extends i {
//     @Override
//     public void display() {
//         System.out.println("hehehe");
//     }

//     @Override
//     public void screen() {
//         System.out.println("fullmanhinh");
//     }

//     public static void main(String[] args) {
//         int width = 10;

//         // without lambda, Drawable implementation using anonymous class
//         Drawable d = new Drawable() {
//             @Override
//             public void draw() {
//                 System.out.println("Drawing " + width);
//             }
//         };
//         d.draw();
//         i a = new i() {
//             @Override
//             public void display() {
//                 System.out.println("hehehe");
//             }

//             @Override
//             public void screen() {
//                 System.out.println("full Screen");
//             }
//         };
//         a.display();
//         a.screen();
//         lambda lb = new lambda();
//         // {
//         // @Override
//         // public void display() {
//         // System.out.println("cua lambda class");
//         // }
//         // };
//         lb.display();

//     }
// }

interface Sayable {
    public String say(String text);

    // public void display();
}

public class lambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sayable s = (text) -> {
            Scanner a = new Scanner(System.in);
            // String k = sc.next();
            return " hehehe" + text + a.nextLine();
        };
        String str = sc.nextLine();
        System.out.println(s.say(str));
        // Sayable sp = new Sayable() {
        // @Override
        // public String say() {
        // return "hehehe";
        // }
        // };
        // System.out.println(sp.say("hehehe"));
        // Sayable sb = new Sayable() {
        // @Override
        // public String say(String text) {
        // return "hehehe";
        // }

        // public void display() {
        // System.out.println("ha duc hoan");
        // }
        // };
        // sb.display();
        // System.out.println(sb.say("ha duc hoannn"));
        // sc.close();
    }
}

// // @FunctionalInterface // It is optional
// // interface Drawable {
// // public void draw();

// // // public String display();
// // }

// // // @FunctionalInterface
// // interface anonymous {
// // public void functionAny();
// // }

// // public class lambda {
// // public static void main(String[] args) {
// // int width = 10;

// // // with lambda
// // Drawable d2 = () -> {
// // System.out.println("Drawing " + width);
// // };

// // // Drawable d2 = () -> {
// // // @Override
// // // public String display() {
// // // return "hehehe";
// // // }
// // // };
// // d2.draw();
// // // d2.display();
// // // anonymous an2 = new anonymous() {
// // // @Override
// // // public void functionAny() {
// // // System.out.println("hoan ha");
// // // }
// // // };

// // }
// // }
// @FunctionalInterface

// public class lambda {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// ArrayList<Integer> a = new ArrayList<Integer>();
// int n;
// for (int i = 0; i < 5; i++) {
// n = sc.nextInt();
// a.add(n);
// }
// System.out.println("after");
// a.forEach((count) -> {
// int i = 0;
// // calculate s = (c, i) -> {
// // i++;
// // return c;
// // };
// // System.out.println(s.sum(count, i));
// // System.out.println(s.sum(count,0));
// });
// System.out.println();
// // System.out.println(summ);
// }
// }

// public class lambda {
// public static void main(String[] args) {

// // Thread Example without lambda
// Runnable r1 = new Runnable() {
// public void run() {
// System.out.println("Thread1 is running...");
// }
// };
// Thread t1 = new Thread(r1);
// t1.start();
// // Thread Example with lambda
// Runnable r2 = () -> {
// System.out.println("Thread2 is running...");
// };
// Thread t2 = new Thread(r2);
// t2.start();
// }
// }

// @FunctionalInterface
// interface dp {
// public void display(n);
// }

// public class lambda {

// public static int testNum = 10;

// public static void main(String[] args) {
// // dp d = new dp() {
// // @Override
// // public void display(n) {
// // System.out.println(n);
// // }
// // };
// Consumer<Integer> c = (n) -> {
// System.out.println(n);
// };
// ArrayList<Integer> a = new ArrayList<Integer>();
// for (int i = 0; i < 10; i++) {
// a.add(i);
// }
// a.forEach(c);
// System.out.println("after");
// // Consumer<Integer> s = new Consumer<Integer>() {
// // @Override
// // public void accept(int e) {
// // System.out.println("qq " + e);
// // }
// // };
// Consumer<Integer> i = (e) -> {
// System.out.println(e);
// };
// Consumer<Integer> c = (e) -> {
// System.out.println(e * 2);
// };
// Consumer<Integer> o = (e) -> {
// System.out.println(e * e);
// };
// Consumer<Integer> co = i.andThen(c).andThen(o);
// co.accept(testNum);
// // Consumer<String> co = new Consumer<T>() {
// // @Override
// // public void accept()
// // };

// }
// }