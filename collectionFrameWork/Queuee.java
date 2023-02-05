import java.util.*;
import java.util.LinkedList;

// import javax.lang.model.element.Element;
/*
    - PriorityQueue, ArrayDeque : sự khác nhau của 2 th này là PriorityQueue và ArrayyQueue : th PriorityQueue là nó add vào đầu còn th ArrayDequeue thì nó add vào cuối

    
    các method trong Queue
    - add(index,element) : khi không truyền giá trị index thì nó sẽ tự động thêm vào cuối
    - addAll(index, collections,...) : khi không truyền giá trị index thì nó sẽ tự động thêm collections vào cuối cùng của Queue
    - clear() : xóa toàn bộ QUeue
    - remove(index) : xóa phần tử trong index, khi không truyền giá trị thì nó sẽ tự động xóa phần tử đầu tiên của Queue
    - set(index, element) : sữa phần tử tại chỉ số index bằng element
    - indexOf(element) : phương thức này trả về lần xuất hiện đầu tiên của phần tử đã cho nếu không có thì nó return lại -1
    - lastIndexOf(element) : ngược lại với indexOf(element)
    - contain(element) : kiểm tra trong Queue có phần tử này hay không nếu có return true không có return false
    - containAll(colecction) : nó cũng giống contain nhưng là check 1 tập hợp phần tử
    - sort() : sắp xếp theo thứ tự tăng dần
    - isEmpty() : kiểm tra xem thử trong Queue có trống hay không, nó trả về queue nếu hàng đợi trống và trả về false nếu không trống
    - 

 */

// public class Queuee {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Queue<Integer> pq = new ArrayDeque<>();
//         pq.add(200);
//         pq.add(300);
//         pq.add(100);
//         List<Integer> a = new LinkedList<>();
//         // a.add(123);
//         a.addAll(0, pq);
//         a.forEach(System.out::println);
//         // System.out.println("ula tr " + pq.poll());
//         a.forEach(System.out::println);
//         System.out.println(pq.contains(a));
//     }
// }

class Person {
    private String name;
    private int age;
    static Person ps = null;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person instancee(String name, int age) {
        if (ps == null) {
            ps = new Person(name, age);
        }
        return ps;
    }

    public void display() {
        System.out.println("ten : " + this.name);
        System.out.println("tuoi : " + this.age);
    }
}

public class Queuee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person a = Person.instancee(sc.nextLine(), sc.nextInt());
        System.out.println("heheheh");
        a.display();
       
    }
}
