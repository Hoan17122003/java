import java.util.Scanner;
// import java.util.concurrent.CountDownLatch;
// import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;

// import java.lang.reflect.Array;

class result {
    public void StringAZ(String s) {
        System.out.println(s);
    }
}

public class oj2 {

    public static void handel() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> s = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            s.add(str.charAt(i));
        }
        int count = 1;
        Iterator<Character> it = s.iterator();
        while (it.hasNext()) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == it.next()) {
                    // System.out.println("hehehe");
                    ++count;
                }
            }
        }

        System.out.println(count);

    }

    public static void main(String[] args) {
        // handel();
        Scanner sc = new Scanner(System.in);
        result r = new result();
        r.StringAZ(sc.nextLine());
    }
}