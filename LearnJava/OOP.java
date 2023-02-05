package LearnJava;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Stream;
import javax.sound.sampled.SourceDataLine;
import java.io.*;
import java.lang.ProcessBuilder.Redirect.*;
import java.lang.StackWalker.Option;
import java.lang.reflect.Array;
import javax.swing.*;;

interface Person {

    public void input();

    public void display();
}

interface FunctionVirtual {
    public String message(String arg);

    public Integer getAge(int age);

    private void myPrivateMethod() {
        System.out.println("sercurity Method");
    }
}

class propertyPerson {

    String fullName;
    String Id;
    String address;
    String currentJob;
    int age;
}

class Student extends propertyPerson implements Person, FunctionVirtual {
    float GPA;
    int RL;
    String majors;
    FunctionVirtual methodVirtual;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("fullName: ");
        this.fullName = sc.nextLine();
        System.out.print("ID: ");
        this.Id = sc.nextLine();
        System.out.print("Address: ");
        this.address = sc.nextLine();
        System.out.print("current JOB: ");
        this.currentJob = sc.nextLine();
        System.out.print("majors: ");
        this.majors = sc.nextLine();
        System.out.print("Age: ");
        this.age = sc.nextInt();
        System.out.print("GPA: ");
        this.GPA = sc.nextFloat();
        System.out.print("RL: ");
        this.RL = sc.nextInt();
        sc.close();
    }

    @Override
    public void display() {
        System.out.println();
        System.out.print("fullName : " + this.fullName + "  ID: " + this.Id + "  Address: " + this.address
                + "  Current JOB: " + this.currentJob + "  Age: " + this.age + "  GPA: " + this.GPA
                + "  RL : " + this.RL + "  Majors: " + this.majors);
    }

    @Override
    public String message(String dataUser) {
        return dataUser;
    }

    @Override
    public Integer getAge(int age) {
        return age;
    }

}

public class OOP {
    private int temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Vector<Integer> vector = new Vector<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6,
        // 7, 8));
        // int rowSize = 2;
        // Vector<Vector<Integer>> matrix = new Vector<Vector<Integer>>();
        // for (int row = 0; row < vector.size() / rowSize; row++)
        // matrix.add(new Vector<Integer>(vector.subList(row * rowSize, (row + 1) *
        // rowSize)));
        // System.out.println(matrix);
        FunctionVirtual temp = new FunctionVirtual() {
            @Override
            public String message(String arg) {
                return "Hello" + arg;
            }

            @Override
            public Integer getAge(int age) {
                return age;
            }
        };
        Consumer<Integer> contain = (arg) -> {
            System.out.println(arg);
        };
        OOP obj = new OOP();
        IntConsumer printMultiNum = a -> {
            obj.temp = a * 30;
        };
        // List<Integer> container = Arrays.asList(4, 2, 2, 3, 4);
        // Collections.sort(container);
        // container.forEach(contain);
        List<String> storge = Arrays.asList("hoan ha", "nam", " chua co nguoi iu");
        storge.stream()
                .map(value -> value.toUpperCase())
                .sorted()
                .forEach((value) -> System.out.println(value));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1, 3);

        Integer sum = list.stream().distinct().reduce(
                0, (currentValue, value) -> {
                    if (currentValue > 8) {
                        currentValue += 10;
                    }
                    return currentValue + value;
                });
        // System.out.println("Result Sum: " + sum);

        // System.out.println(storge);
        sc.close();
        // printMultiNum.accept(30);
        // System.out.println(obj.temp);
        String htmlWithJava13 = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;
        // System.out.println(htmlWithJava13);
        Stream<String> stream = Stream.iterate("", s -> s + "S")
                .takeWhile(s -> s.length() < 10);
        // Optional<String> user = Optional.of("Name: Ha Duc Hoan");
        // user.ifPresentOrElse(
        // (value) -> {
        // System.out.println("value is present: " + value);
        // },
        // () -> {
        // System.out.println("empty value ");
        // });
        // Optional<Integer> cache = Optional.of(9455);
        // System.out.println(cache);
        // cache.ifPresentOrElse(
        // (value) -> {
        // System.out.println("value is Present: " + value);
        // },
        // () -> {
        // System.out.print("non value is: ");
        // });
        // System.out.println("Marco".isBlank());
        // System.out.println("Mar\nco".lines());
        // System.out.println("Macco ".strip());
        // String dataUser = JOptionPane.showInputDialog(null, "Input data : ", "Input
        // ", 3);
        // switch (dataUser) {
        // case "HOAN HA":
        // JOptionPane.showMessageDialog(null, message());
        // break;
        // default:
        // throw new Error("invalid error");
        // }

        boolean flag = switch (JOptionPane.showInputDialog(null, "Input data", "input", 3)) {
            case "True" -> true;
            case "False" -> false;
            default ->
                throw new Error("Invalid Error");
        };
        System.out.println(flag);

    }

    public static String message() {
        return "okiela lại là tui đây";
    }

    public static void display(String temp, FunctionVirtual obj) {
        String result = obj.message(temp);
        System.out.println(result);
    }
}