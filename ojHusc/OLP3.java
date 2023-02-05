
// package ojHusc;
import java.util.*;

public class OLP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> sa = new Stack<Integer>();
        Stack<Integer> sb = new Stack<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sa.push(sc.nextInt());
            sb.push(sc.nextInt());
        }
        for (int i = 0; i < sa.size(); i++) {
            int valueSa = sa.peek();
            int valueSb = sb.peek();
            if ((valueSa / (valueSa / 2) == 1 && valueSb - (valueSa / 2) == 0)
                    || (valueSb / (valueSb / 2) == 1 && valueSa - (valueSb / 2) == 0)) {
                System.out.println("Yes");
                sa.pop();
                sb.pop();
            }
            if ((valueSa / (valueSa / 2) == 1 && valueSb - (valueSa / 2) != 0)
                    || (valueSb / (valueSb / 2) == 1 && valueSa - (valueSb / 2) != 0)) {
                System.out.println("No");
                sa.pop();
                sb.pop();
            }
            if ((valueSa % 2 == 0 && valueSb % 2 == 0) && (valueSa == valueSb)) {
                System.out.println("No");
                sa.pop();
                sb.pop();
            } else {
                System.out.println("Yes");
                sa.pop();
                sb.pop();
            }
        }
    }
}