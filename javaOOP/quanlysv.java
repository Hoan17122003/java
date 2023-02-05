
// import java.util.Scanner;
// import java.util.Vector;
package javaOOP;

import java.util.*;

// import java.util.Scanner;
// // import java.util.jar.Attributes.Name;
// // import java.util.Vector;

// public class quanlysv {
// protected String name;
// protected String address;
// protected String DOB;
// protected String Id;

// }

// class SvCntt extends quanlysv {
// private double KTLT;
// private double SQL;
// private double KTMT;

// public void input() {
// Scanner sc = new Scanner(System.in);
// System.out.println("ID: ");
// this.Id = sc.nextLine();
// System.out.print("ho ten: ");
// this.name = sc.nextLine();
// System.out.print("DOB: ");
// this.DOB = sc.nextLine();
// System.out.print("Address: ");
// this.address = sc.nextLine();
// System.out.println("Point KTLT");
// this.KTLT = sc.nextDouble();
// System.out.println("\r\t Point SQL: ");
// this.SQL = sc.nextDouble();
// System.out.println("\r\t Point KTMT: ");
// this.KTMT = sc.nextDouble();
// sc.close();
// }

// public void display() {
// System.out.println("ID: " + this.Id);
// System.out.println("Name: " + this.name);
// System.out.println("DOB: " + this.DOB);
// System.out.println("Address: " + this.address);
// System.out.println(("Point KTLT: " + this.KTLT));
// System.out.println("Point KTMT: " + this.KTMT);
// System.out.println("Point SQL : " + this.SQL);
// }

// }

// class out {
// public static void main(String[] args) {
// SvCntt It = new SvCntt();
// It.input();
// It.display();
// }
// }
// import java.util.Scanner;
// import java.util.Vector;

// import javax.sound.midi.SysexMessage;

// import javax.management.Query;
// import javax.sound.midi.SysexMessage;

// import java.util.Scanner;
// import java.lang.ProcessBuilder.Redirect.Type;
// import java.util.*;

// class phanso {
// private int tu;
// private int mau;

// public void input() {
// Scanner sc = new Scanner(System.in);
// System.out.print("tu: ");
// this.tu = sc.nextInt();
// System.out.print("mau: ");
// this.mau = sc.nextInt();
// // sc.close();
// }

// public void display() {
// System.out.println("tu: " + this.tu);
// System.out.print("mau: " + this.mau);
// System.out.println("\nbieu thuc :" + (this.tu) + '/' + (this.mau));
// }

// public double result() {
// return (double) (this.tu) / (double) (this.mau);
// }
// }

// public class quanlysv {
// public static void main(String[] args) {
// // phanso ps = new phanso();
// // ps.input();
// // ps.display();

// // phanso ps1 = new phanso();
// // ps1.input();
// // ps1.display();
// // System.out.println(((ps1.result() + ps.result())));
// // System.out.print((Math.round(ps.result() * 100) / 100) +
// }
// }

// class dad {
// protected String name;

// public dad(String name) {
// this.name = name;
// }

// public void display() {
// return this.name;
// }
// }

// class son extends dad {

// public son(String name) {
// super(name);
// }

// @Override
// public String toString() {
// return "Name: " + super.name;
// }
// }

// abstract class Person {
// protected String name;
// protected String Id;

// public Person() {
// System.out.println("co cai nit");
// }

// public Person(String name, String id) {
// this.Id = id;
// this.name = name;
// }

// public abstract void display();
// }

// class Student extends Person {
// public Student() {

// }

// public Student(String name, String id) {
// super(name, id);
// }

// public void display() {
// System.out.println("ID: " + Id);
// System.out.println("name: " + name);
// }
// }

// public class quanlysv {

// public static void main(String[] args) {
// // dad s = new dad("hoan ha");
// // System.out.println(s);
// // System.out.println(s.getClass());
// // Person ps = new Student("ha duc hoan", "It 1");
// // ps.display();
// Student ps = new Student("ha duc hoan", "It 1");
// ps.display();
// }
// }

// interface IEmployee {
// public int calculateSalary();

// public String getName();
// }

// abstract class Employee implements IEmployee {
// private String name;
// private int paymentPerHour;

// public Employee(String name, int paymentPerhour) {
// this.name = name;
// this.paymentPerHour = paymentPerhour;
// }

// public void setName(String name) {
// this.name = name;
// }

// public String getName() {
// return this.name;
// }

// public void setPaymentPerhour(int paymentPerhour) {
// this.paymentPerHour = paymentPerhour;
// }

// public int getPaymentPerHour() {
// return this.paymentPerHour;
// }
// }

// class PartTimeEmployee extends Employee {
// private int workingHours;

// public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
// super(name, paymentPerHour);
// this.workingHours = workingHours;
// }

// public int calculateSalary() {
// return this.workingHours * super.getPaymentPerHour();
// }
// }

// class FullTimeEmployee extends Employee {
// public FullTimeEmployee(String name, int paymentPerHour) {
// super(name, paymentPerHour);
// }

// public int calculateSalary() {
// return 8 * super.getPaymentPerHour();
// }
// }

// public class quanlysv {
// public static void main(String[] args) {
// IEmployee employee1 = new PartTimeEmployee("Trung", 45000, 7);
// System.out.println("Name: " + employee1.getName());
// System.out.println("Salary per day: " + employee1.calculateSalary());

// IEmployee employee2 = new FullTimeEmployee("Linh", 65000);
// System.out.println("Name: " + employee2.getName());
// System.out.println("Salary per day: " + employee2.calculateSalary());
// }
// }

// class Point {
// protected int x;
// protected int y;

// public Point() {

// }

// public Point(int x, int y) {
// this.x = x;
// this.y = y;
// }

// public void setX(int x) {
// this.x = x;
// }

// public int getX() {
// return this.x;
// }

// public void setY(int y) {
// this.y = y;
// }

// public int getY() {
// return this.y;
// }
// }

// class Line {
// private Point begin;
// private Point end;

// public Line(Point begin, Point end) {
// this.begin = begin;
// this.end = end;
// }

// public Line(int x1, int y1, int x2, int y2) {
// begin.x = x1;
// begin.y = y1;
// end.x = x2;
// end.y = y2;
// }

// public void setBegin(Point begin) {
// this.begin = begin;
// }

// public Point getBegin() {
// return begin;
// }

// public void setEnd(Point end) {
// this.end = end;
// }

// public Point getEnd() {
// return this.end;
// }

// public double getLength() {
// return Math.sqrt(Math.pow((end.x - begin.x), 2) + Math.pow((end.y - begin.y),
// 2));
// }

// // public void display() {
// // System.out.println("Begin: " + begin.x + begin.y);
// // }
// }

// public class quanlysv {
// public static void main(String[] args) {
// // Point begin = new Point(1, 1);
// // Point end = new Point(2, 2);
// // Line line1 = new Line(begin, end);
// // System.out.println(line1.getLength());

// Line line2 = new Line(2, 3, 5, 4);
// System.out.println(line2.getLength());
// // line2.display();
// }
// }

// class Point {
// private int x;
// private int y;

// public Point(int x, int y) {
// this.x = x;
// this.y = y;
// }

// public void setX(int x) {
// this.x = x;
// }

// public int getX() {
// return this.x;
// }

// public void setY(int y) {
// this.y = y;
// }

// public int getY() {
// return this.y;
// }
// }

// class Triangle {
// private Point vertice1;
// private Point vertice2;
// private Point vertice3;

// public Triangle(Point vertice1, Point vertice2, Point vertice3) {
// this.vertice1 = vertice1;
// this.vertice2 = vertice2;
// this.vertice3 = vertice3;
// }

// public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
// vertice1 = new Point(x1, y1);
// vertice2 = new Point(x2, y2);
// vertice3 = new Point(x3, y3);
// }

// public double getLength(Point leng1, Point leng2) {
// return Math.sqrt(Math.pow(leng2.getX() - leng1.getX(), 2) +
// Math.pow(leng2.getY() - leng1.getY(), 2));
// }

// public double getPerimeter() {
// return getLength(vertice1, vertice2) + getLength(vertice2, vertice3) +
// getLength(vertice3, vertice1);
// }
// }

// public class quanlysv {
// public static void main(String[] args) {
// Point vertice1 = new Point(1, 3);
// Point vertice2 = new Point(2, 3);
// Point vertice3 = new Point(4, 2);
// Triangle triangle1 = new Triangle(vertice1, vertice2, vertice3);
// Triangle triangle2 = new Triangle(4, 5, 2, 6, 3, 7);
// System.out.println(triangle1.getPerimeter());
// System.out.println(triangle2.getPerimeter());
// }
// }

// class Author {
// private String name;
// private String email;

// public Author(String name, String email) {
// this.name = name;
// this.email = email;
// }

// public void setName(String name) {
// this.name = name;
// }

// public String getName() {
// return this.name;
// }

// public void setEmail(String email) {
// this.email = email;
// }

// public String getEmail() {
// return this.email;
// }
// }

// class Book {
// private String name;
// private Author authors[];
// private double price;

// public Book(String name, Author authors[], double price) {
// this.name = name;
// this.authors = authors;
// this.price = price;
// }

// public void setName(String name) {
// this.name = name;
// }

// public String getName() {
// return this.name;
// }

// public void setPrice(double price) {
// this.price = price;
// }

// public double getPrice() {
// return this.price;
// }

// public String getAuthorNames() {
// String result = "";
// for (int i = 0; i < authors.length; i++) {
// if (i == authors.length - 1) {
// result += authors[i].getName();
// break;
// }
// result += authors[i].getName() + ", ";
// }
// return result;
// }
// }

// public class quanlysv {
// public static void main(String[] args) {
// Author[] authors = new Author[3];
// authors[0] = new Author("Viet", "VietCV@codelearn.io");
// authors[1] = new Author("Tuan", "TuanLQ@codelearn.io");
// authors[2] = new Author("Kien", "KienNT@Codelearn.io");

// Book book1 = new Book("C++ for Beginners", authors, 210000);
// System.out.println(book1.getAuthorNames());
// }
// }

// class Customer {
// private int id;
// private String name;
// private int discount;

// public Customer(int id, String name, int discount) {
// this.id = id;
// this.name = name;
// this.discount = discount;
// }

// public int getId() {
// return this.id;
// }

// public void setName(String name) {
// this.name = name;
// }

// public String getName() {
// return this.name;
// }

// public void setDiscount(int discount) {
// this.discount = discount;
// }

// public int getDiscount() {
// return this.discount;
// }
// }

// class Invoice {
// private int id;
// private Customer customer;
// private double amount;

// public Invoice(int id, Customer customer, double amount) {
// this.id = id;
// ;
// this.customer = customer;
// this.amount = amount;
// }

// public int getId() {
// return this.id;
// }

// public void setCustomer(Customer customer) {
// this.customer = customer;
// }

// public Customer getCustomer() {
// return this.customer;
// }

// public void setAmount(double amount) {
// this.amount = amount;
// }

// public double getAmount() {
// return this.amount;
// }

// public String getCustomerName() {
// return customer.getName();
// }

// public double getAmountAfterDiscount() {
// return amount - amount * customer.getDiscount() / 100;
// }

// }

// public class quanlysv {
// public static void main(String[] args) {
// Customer customer1 = new Customer(1000, "Tuan", 20);
// Invoice invoice1 = new Invoice(1000, customer1, 100000);
// System.out.println("Customer name: " + invoice1.getCustomerName());
// System.out.println("Invoice after discount: " +
// invoice1.getAmountAfterDiscount());
// }
// }
// import java.util.ArrayList;
// import java.util.List;

// class Point {
// private int x;
// private int y;

// public Point(int x, int y) {
// this.x = x;
// this.y = y;
// }

// public void setX(int x) {
// this.x = x;
// }

// public int getX() {
// return this.x;
// }

// public void setY(int y) {
// this.y = y;
// }

// public int getY() {
// return this.y;
// }
// }

// class PolyLine {
// private List<Point> points = new ArrayList<>();

// public PolyLine() {

// }

// public PolyLine(List<Point> points) {
// this.points = points;
// }

// public void appendPoint(Point point) {
// points.add(point);
// }

// public void appendPoint(int x, int y) {
// points.add(new Point(x, y));
// }

// public double getLength() {
// double result = 0;
// for (int i = 0; i < points.size() - 1; i++) {
// double temp = Math.sqrt(Math.pow(points.get(i + 1).getX() -
// points.get(i).getX(), 2)
// + Math.pow(points.get(i + 1).getY() + points.get(i).getY(), 2));
// result += temp;
// }
// return result;
// }

// }

// public class quanlysv {
// public static void main(String[] args) {
// PolyLine polyLine = new PolyLine();
// polyLine.appendPoint(new Point(1, 1));
// polyLine.appendPoint(new Point(2, 3));
// polyLine.appendPoint(3, 0);
// polyLine.appendPoint(4, 2);
// System.out.println(polyLine.getLength());

// // ArrayList<Integer> numbers = new ArrayList<Integer>();
// // numbers.add(5);
// // numbers.add(9);
// // numbers.add(8);
// // numbers.add(1);
// // numbers.forEach((n) -> {
// // System.out.println(n);
// // });
// int a[] = { 1, 2, 3, 4 };
// for (int x : a) {
// System.out.println(x);
// }
// }
// }
// final của 1 class thì sẽ không cho class khác kế thừa

// Java program to demonstrate ListIterator

// Importing ArrayList and List iterator classes
// from java.util package
// import java.util.ArrayList;
// import java.util.ListIterator;

// // Main class
// public class quanlysv {
//     // Main driver method
//     public static void main(String[] args) {
//         // Creating an object of ArrayList class
//         ArrayList<Integer> al = new ArrayList<Integer>();

//         // Iterating over Arraylist object
//         for (int i = 0; i < 10; i++)

//             // Adding elements to the Arraylist object
//             al.add(i);

//         // Print and display all elements inside object
//         // created above
//         System.out.println(al);

//         // At beginning ltr(cursor) will point to
//         // index just before the first element in al
//         ListIterator<Integer> ltr = al.listIterator();

//         // Checking the next element availability
//         while (ltr.hasNext()) {
//             // Moving cursor to next element
//             int i = (Integer) ltr.next();

//             // Getting even elements one by one
//             System.out.print(i + " ");

//             // Changing even numbers to odd and
//             // adding modified number again in
//             // iterator
//             if (i % 2 == 0) {
//                 // Change to odd
//                 i++;
//                 // Set method to change value
//                 ltr.set(i);// sua lai vi tri do bang i
//                 // To add
//                 ltr.add(i);// them 1 phan tu i vao ArrayList
//             }
//         }

//         // Print and display statements
//         System.out.println();
//         System.out.println(al);

//     }
// }

abstract class Person {
    private String name;
    private String address;

    public Person() {

    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public abstract int getSalary();

    public abstract void display();
}

interface lamviec {
    public int chucvu();
}
// abstract class nó là lớp trừu tượng không hoàn toàn vì nó chỉ có là không
// khởi tạo đối tượng qua chính nó mà thôi
// còn lại các phương thức không abstract thì không cần ghi đè và các phương
// thức hoạt động trong lớp trừu tượng không hoàn toàn thì vẫn hoạt động bình
// thường như 1 class bth vậy

// ----------------------------------------
// ngược lại interfaces là 1 lớp trừu tượng hoàn toàn, nó giống abstract class
// là không khởi tạo được 1 đối tượng trong hàm main mà chỉ thông qua các lớp
// con
// nó khác abstract class là tất cả phương thức bên trong nó đều là abstract
// method và biến đều là hằng nên không thể thay đổi được

// sử dụng 2 thằng trên khi để phát triển tính năng

class Employee extends Person {
    private int salary;

    public Employee() {

    }

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void display() {
        System.out.println("Employee name: " + super.getName());
        System.out.println("Employee address: " + super.getAddress());
        System.out.println("Employee salary: " + this.salary);
    }
}

class Customer extends Person {
    private int balance;

    public Customer() {

    }

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Customer name: " + super.getName());
        System.out.println("Customer address: " + super.getAddress());
        System.out.println("Customer balance: " + this.balance);
    }

    @Override
    public int getSalary() {
        return balance;
    }
}
// 1 lưu ý trong java là nó overloading tất cả các toán tử trong class rồi và cả
// copy dữ liệu trong class như c++

public class quanlysv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Employee("Trung", "HN", 3300);
        Person person2 = new Customer("Linh", "BN", 10400);
        Person ps2 = person2;
        person1.display();
        person2.display();
        System.out.println(ps2.getSalary() + person2.getSalary() + person1.getSalary());
        lamviec v = () -> {
            System.out.println("truong phong IT");
            return 10;
        };
        Customer a = new Customer(sc.nextLine(), sc.nextLine(), sc.nextInt());
        a.display();
        System.out.println(v.chucvu());
    }
}