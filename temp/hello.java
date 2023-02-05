// import java.util.Scanner;

// // import java.util.Scanner;

// // public class hello {
// //     public static int sum(int a, int b) {
// //         return a + b;
// //     }

// //     public static void main(String[] args) {
// //         Scanner a = new Scanner(System.in);
// //         double n = a.nextInt();
// //         System.out.print(Math.round(n * 100.0) / 100.0);
// //     }
// // }

// public class hello {
//     public static void main() {
//         Scanner sc = new Scanner(System.in);
//         try {
//             String s = sc.nextLine();
//             System.out.println(s);
//         } finally {
//             sc.close();
//         }
//     }
// }

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }
}

class PolyLine {
    private List<Point> points;

    public PolyLine() {
        this.points = new ArrayList<Point>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(Point point) {
        this.points.add(point);
    }

    public void appendPoint(int x, int y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            int x1 = points.get(i).getX();
            int y1 = points.get(i).getY();
            int x2 = points.get(i + 1).getX();
            int y2 = points.get(i + 1).getY();
            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            length += distance;
        }
        return length;
    }

}

public class hello {
    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine();
        polyLine.appendPoint(new Point(1, 1));
        polyLine.appendPoint(new Point(2, 3));
        polyLine.appendPoint(3, 0);
        polyLine.appendPoint(4, 2);
        System.out.println(polyLine.getLength());
    }
}
