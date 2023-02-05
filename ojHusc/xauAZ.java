// // package OJHUSC;

// import java.io.CharArrayReader;
// import java.util.*;

// public class xauAZ {
//     public static void solve() {

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         ArrayList<Character> contain1 = new ArrayList<Character>();
//         ArrayList<Integer> contain2 = new ArrayList<Integer>();
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
//                 contain1.add(str.charAt(i));
//             }
//         }
//         int begin;
//         int index = 0;
//         int end;
//         for (; index < contain1.size();) {
//             if (contain1.get(index) == 'A') {
//                 begin = index + 1;
//                 for (int j = index; j < contain1.size(); j++) {
//                     if (contain1.get(j) == 'Z') {
//                         end = j;
//                         contain2.add(end - begin + 2);
//                         index = end + 1;
//                     }
//                 }
//             } else {
//                 index++;
//             }
//         }
//         Collections.sort(contain2);
//         System.out.println(contain2.get(contain2.size() - 1));
//     }
// }

import java.util.*;
import java.util.regex.Pattern;

interface abs {
    default void display() {
        System.out.println("có cái nịt");
    }

    default int getPoint() {
        return 10;
    }

    public void mess();
}

public class xauAZ implements abs {
    // public static boolean Isnumber(String str) {
    // return Pattern.matches("[a-z[A-Z]]", str) || Pattern.matches("[/d]{4}", str);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // xauAZ a = new xauAZ();
        // a.display();
        // System.out.println(a.getPoint());
        // abs b = new abs() {
        // @Override
        // public void mess() {
        // System.out.println("ối dồi ôi");
        // }
        // };
        // b.mess();
        String str = sc.nextLine();
        int count2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!Pattern.matches("[a-z]")) {
                count2++;
            }
        }

        if (count2 > 0) {
            System.out.println("có kí tự không hợp lệ");
        }
        // System.out.println(Isnumber(sc.nextLine()));

    }
}
