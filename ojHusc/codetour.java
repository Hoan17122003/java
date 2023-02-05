import java.util.*;

// class data {
//     private char a;
//     private int b;

//     data(char a, int b) {
//         super();
//         this.a = a;
//         this.b = b;
//     }

//     char getP() {
//         return this.a;
//     }

//     int getValue() {
//         return this.b;
//     }
// }

// class container {
//     private ArrayList<data> contain;

//     public container() {
//         contain = new ArrayList<data>();
//     }

// }

public class codetour {
    // public static void handel(HashMap<Character, Integer> contain) {
    // boolean isEmpty = true;
    // first: {
    // System.out.println("first");
    // second : {
    // System.out.println("okie");
    // thrid: {
    // if(isEmpty) {
    // break second;
    // }
    // System.out.println("done!");
    // }
    // }
    // }

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = sc.next();
        HashMap<Character, Integer> contain = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        // contain.put(sc.next(), sc.nextInt());
        // }
        // handel(contain);
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Before the break");
                    if (t) {
                        break second;
                    }
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after the second block");
        }
    }
}
