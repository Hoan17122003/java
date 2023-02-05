// // // // import java.util.Scanner;

// // // // public class helloworld {
// // // //     private void Myswap(int a, int b) {
// // // //         int temp = a;
// // // //         a = b;
// // // //         b = temp;
// // // //     }

// // // //     public static void main(String[] args) {
// // // //         // System.out.println(125 + 125 + "12");
// // // //         // Scanner sc = new Scanner(System.in);
// // // //         // System.out.println(sc.nextLine());
// // // //         Scanner sc = new Scanner(System.in);
// // // //         int a = sc.nextInt();
// // // //         int b = sc.nextInt();
// // // //         Myswap sw = new Myswap();
// // // //         sw.Myswap(a, b);
// // // //         System.out.println(a, b);
// // // //     }
// // // // }
// // // // package VietSource.net.temp;

// // // import java.util.Scanner;

// // // class Number { // lop Number
// // //     int num;

// // //     public Number(int num) { // ham khoi tao
// // //         this.num = num;
// // //     }

// // //     public int getNum() { // ham tra ve gia tri num
// // //         return num;
// // //     }

// // //     public void setNum(int num) { // ham set gia tri num
// // //         this.num = num;
// // //     }
// // // }

// // // public class MySwap {
// // //     private void swap(Number a, Number b) { // ham hoan vi
// // //         int temp = a.getNum(); // gan num cua a cho temp
// // //         a.setNum(b.getNum()); // gan num cua b cho a
// // //         b.setNum(temp); // gan temp cho num cua b
// // //     }

// // //     public static void main(String[] args) {
// // //         Number a, b; // hai doi tuong Number a va b
// // //         MySwap sw = new MySwap(); // doi tuong sw thuoc lop MySwap
// // //         Scanner scan = new Scanner(System.in);

// // //         System.out.print("Nhap a = ");
// // //         a = new Number(scan.nextInt()); // khoi tao a voi num la so nhap vao
// // //         System.out.print("Nhap b = ");
// // //         b = new Number(scan.nextInt()); // khoi tao b voi num la so nhap vao
// // //         scan.close();
// // //         System.out.println("Befor swap: a = " + a.getNum() + " b = " + b.getNum());
// // //         sw.swap(a, b); // su dung ham swap
// // //         System.out.println("After swap: a = " + a.getNum() + " b = " + b.getNum());
// // //     }
// // // }

// // // import java.util.Scanner;

// // // public class MySwap {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         String text = sc.nextLine().charAt(0);
// // //         System.out.println(text);
// // //     }
// // // }
// // // import java.util.Scanner;

// // // public class MySwap {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         char c = sc.nextLine().charAt(0);
// // // charAt(index) : lấy ra phần tử đầu tiên trong 1 chuỗi;
// // //         // x = x + 1;
// // //         char a = (char) (104);
// // //         System.out.println(a);
// // //         System.out.println("c= " + (char) ((c + 1)));
// // //         // System.out.println(x);
// // //     }
// // // }

// // // import java.util.Scanner;

// // // public class MySwap {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         String a = sc.nextLine();
// // //         // String b = sc.nextLine();
// // //         int sum = 0 ;
// // //         for(int i = 0 ; i < a.length() ; i++)
// // //         {
// // //             sum+=(int)(a.charAt(i));
// // //         }
// // //         System.out.println(sum);
// // //         // if (a.equals(b)) {
// // //         // System.out.println("hehehe");
// // //         // } else {
// // //         // System.out.println("hahaha");
// // //         // }

// // //     }
// // // }

// // // import java.util.Scanner;

// // // public class MySwap {

// // // public static void main(String[] args) {
// // // Scanner scanner = new Scanner(System.in);
// // // int x = scanner.nextInt();
// // // int y = scanner.nextInt();
// // // if (x > 0) {
// // // if (y > 0) {
// // // System.out.println("This point lies in the First quadrant");
// // // }
// // // if (y < 0) {
// // // System.out.println("This point lies in the Four quadrant");
// // // }
// // // }
// // // if (x < 0) {
// // // if (y < 0) {
// // // System.out.println("This point lies in the Third quadrant");
// // // }
// // // if (y > 0) {
// // // System.out.println("This point lies in the Second quadrant");
// // // }
// // // }
// // // }
// // // }

// // // import java.util.Scanner;

// // // public class MySwap {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         // int n = sc.nextInt();
// // //         String name = "ha duc hoan ";
// // //         String name1[] = name.split(" ");
// // //         for (String x : name1) {
// // //             System.out.println(x);
// // //         }

// // //     }
// // // }
// // //  xử lý chuỗi
// // // import java.util.Scanner;

// // // public class MySwap {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         String s = sc.nextLine();
// // //         for (int i = 0; i < s.length(); i++) {
// // //             if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
// // //                 s = s.replace(s.charAt(i) + "", "");
// // //             }
// // //         }
// // //         System.out.println(s);
// // //     }
// // // }
// // // import java.util.Scanner;

// // // public class MySwap {
// // // 	public static void main(String[] args) {
// // // 		Scanner sc = new Scanner(System.in);
// // // 		String s = sc.next();
// // // 		for(char c = '0'; c <= '9';c++) {
// // // 			s = s.replace(c + "", "");
// // // 		}
// // // 		System.out.println(s);
// // // 	}
// // // }

// // import java.util.Scanner;

// // public class MySwap {
// //     public static int sumArr(int arr[]) {
// //         int sum = 0;
// //         for (int i = 0; i < arr.length; i++) {
// //             sum += arr[i];
// //         }
// //         return sum;
// //     }

// //     public static void main(String[] arStrings) {
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         int arr[] = new int[n];
// //         for (int i = 0; i < n; i++) {
// //             arr[i] = sc.nextInt();
// //         }
// //         System.out.println(sumArr(arr));
// //     }
// // }

// class Person {
//     private String name;
//     private int age;
//     private String address;

//     public Person(String name, int age, String address) {
//         this.name = name;
//         this.age = age;
//         this.address = address;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public void setAddress(String address) {
//         this.address = address;
//     }

//     public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Address: " + address);
//     }

//     public void cocainit() {
//         System.out.println("có cái nịt");
//     }
// }

// class Student extends Person {
//     private double gpa;

//     public Student(String name, int age, String address, double gpa) {
//         super(name, age, address);
//         this.gpa = gpa;
//     }

//     public double getGpa() {
//         return gpa;
//     }

//     public void setGpa(double gpa) {
//         this.gpa = gpa;
//     }

//     public void display() {
//         super.display();
//         System.out.println("GPA: " + gpa);
//     }
// }

// class Teacher extends Person {
//     private int salary;

//     public Teacher(String name, int age, String address, int salary) {
//         super(name, age, address);
//         this.salary = salary;
//     }

//     public int getSalary() {
//         return salary;
//     }

//     public void setSalary(int salary) {
//         this.salary = salary;
//     }

//     @Override
//     public void display() {
//         super.display();
//         System.out.println("Salary: " + salary);
//     }
// }

// public class MySwap {
//     public static void main(String[] args) {
//         Person s = new Student("Khanh", 23, "Ha Noi", 9.0);
//         s.cocainit();
//         /*
//          * đối tượng s thuộc phương thức của lớp cha khi gọi phương thức thì nó sẽ trỏ
//          * lên phương thức lớp cha
//          * rồi xem thử dưới lớp con có ghi đè (override) hay không nếu có thì nó sẽ gọi
//          * phương thức trong lớp con
//          */
//         s.display();
//         System.out.println();
//         Person t = new Teacher("Tung", 34, "Ha Noi", 1700);
//         t.display();
//     }
// }
// // khi dùng @override thì anomation nó sẽ check lại phần trên xem nó có được ghi
// // đè phương thức cha hay không
// // nếu khi dùng anomation mà k ghi đè lên phương thức cha thì nó sẽ báo lỗi

abstract class Shape {

    // public abstract void input();

    Shape() {
        System.out.println("j z tr?");
    }

    public abstract void display();

    public abstract double primeter();

    public abstract double area();
}

class Rectangle extends Shape {

    private double h;
    private double w;

    public Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public double primeter() {
        return (h + w) * 2;
    }

    @Override
    public double area() {
        return h * w;
    }

    @Override
    public void display() {
        System.out.println("Primeter = " + primeter());
        System.out.println("Area = " + area());
    }

}

public class MySwap {

    public static void main(String[] args) {
        Shape r1 = new Rectangle(1, 2);
        r1.display();
    }
}