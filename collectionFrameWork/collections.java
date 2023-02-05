
// import java.io.ObjectOutputStream.PutField;
import java.util.*;
import java.util.regex.Pattern;

// import javax.lang.model.element.Element;

interface in4 {
    public void display();

    public void input();
}

class Person implements in4 {
    protected String hodem;
    protected String ten;
    protected String DOB;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ho dem: ");
        this.hodem = sc.nextLine();
        System.out.print("Ten: ");
        this.ten = sc.nextLine();
        System.out.print("Date of bỉth: ");
        this.DOB = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("ho dem: " + this.hodem);
        System.out.println("Ten: " + this.ten);
        System.out.println("Date of birth: " + this.DOB);
        System.out.println();
    }
}

public class collections {
    public static boolean isNumber() {
        return Pattern.matches("[a-zA-Z]", "A");
    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // // System.out.println("hehehe");
    // // System.out.println(isNumber());
    // Stack<Integer> contain = new Stack<Integer>();
    // int n = sc.nextInt();
    // List<Integer> a = new ArrayList<Integer>();
    // for (int i = 0; i < n; i++) {
    // contain.push(sc.nextInt());
    // a.add(sc.nextInt());
    // }
    // Iterator<Integer> it = contain.iterator();
    // int sum = 0;
    // a.forEach((element) -> System.out.println(element));
    // System.out.println("Sum: " + sum);
    // System.out.println("FIFO");
    // while (it.hasNext()) {
    // System.out.println(it.next() + " ");
    // }
    // // while (!contain.empty()) {
    // // System.out.println(contain.peek());
    // // contain.pop();
    // // }
    // Hashtable<String, Integer> container = new Hashtable<>();
    // for (int i = 0; i < n; i++) {
    // container.put(sc.next(), sc.nextInt());
    // }
    // System.out.println(container);

    // Stack<String> stack = new Stack<String>();
    // stack.push("Geeks");
    // stack.push("For");
    // stack.push("Geeks");
    // stack.push("Geeks");

    // // Iterator for the stack
    // Iterator<String> itr = stack.iterator();

    // // Printing the stack
    // while (itr.hasNext()) {
    // System.out.print(itr.next() + " ");
    // }

    // System.out.println();

    // stack.pop();

    // // Iterator for the stack
    // itr = stack.iterator();

    // // Printing the stack
    // while (itr.hasNext()) {
    // System.out.print(itr.next() + " ");
    // }
    // try {
    // int count = sc.nextInt();
    // if (count != 0)
    // System.out.println("start");
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println(e);
    // } finally {
    // System.out.println("done!");
    // }
    // }
    public static void main(String[] args) {
        // Person p = new Person();
        // p.input();
        // Person a = new Person();
        // a.input();
        // if (a > p) {
        // System.out.println("hehehe");
        // }
        Scanner sc = new Scanner(System.in);
        List<Integer> contain = new ArrayList<>();
        List<Integer> contain2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            contain.add(sc.nextInt());
            if (i < 3) {
                contain2.add(i);
            }
        }

        Collections.addAll(contain2, 3, 4, 5);
        for (int x : contain2) {
            System.out.println(x);
            ;
        }

    }
}
//