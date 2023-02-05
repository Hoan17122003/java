
// import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
// import java.*;

// import javax.print.event.PrintJobListener;

public class Stackk {
    public static void main(String[] arStrings) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            s.push(a);
        }
        System.out.println(s.size());
        while (!s.empty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        // System.out.println("\r" + s);
        // return 0;
        System.out.println(s.size());
        // Queue<Integer> q = new Queue<Integer>() {

        // };
    }
}
