// package interFace;

// // import java.util.*;

// // import interFace.animals.cat;

// // class animals {
// //     public interface cat {
// //         default void display() {
// //             System.out.println("meow meow");
// //         }
// //     }
// // }

// // @FunctionalInterface
// // interface e {
// //     public void display();
// // }

// // public class interfaceLongnhau implements animals.cat, e {
// //     // @Override
// //     // public void display() {
// //     // System.out.println("gow gow");
// //     // }

// //     public static void main(String[] args) {
// //         animals.cat c;
// //         interfaceLongnhau i = new interfaceLongnhau();
// //         c = i;
// //         c.display();
// //         e a = new e() {
// //             @Override
// //             public void display() {
// //                 System.out.println(10);
// //             }
// //         };
// //         a.display();
// //     }
// // }

// // import java.awt.Canvas;
// // import java.awt.Color;
// // import java.awt.Graphics;

// // import javax.swing.JFrame;

// // public class interfaceLongnhau extends Canvas {
// //     public void paint(Graphics g) {
// //         g.drawString("Hello", 40, 40);
// //         setBackground(Color.WHITE);
// //         g.fillRect(130, 30, 100, 80);
// //         g.drawOval(30, 130, 50, 60);
// //         setForeground(Color.RED);
// //         g.fillOval(130, 130, 50, 60);
// //         g.drawArc(30, 200, 40, 50, 90, 60);
// //         g.fillArc(30, 130, 40, 50, 180, 40);

// //     }

// //     public static void main(String[] args) {
// //         interfaceLongnhau m = new interfaceLongnhau();
// //         JFrame f = new JFrame();
// //         f.add(m);
// //         f.setSize(400, 300);
// //         f.setVisible(true);
// //     }
// // }

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JPasswordField;
// import javax.swing.JTextField;

// public class interfaceLongnhau {
//     public static void main(String[] args) {
//         // Creating instance of JFrame
//         JFrame frame = new JFrame("Dự án Java Swing Đầu Tiên");
//         frame.setSize(350, 200);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         JPanel panel = new JPanel();
//         // Thêm Panel vào Frame
//         frame.add(panel);
//         placeComponents(panel);
//         // Hiển thị frame cho người dùng
//         frame.setVisible(true);
//     }

//     private static void placeComponents(JPanel panel) {
//         panel.setLayout(null);
//         // Tạo một JLabel
//         JLabel userLabel = new JLabel("Người dùng");
//         /**
//          * Chỉ định vị trí và kích thước của userLabel.
//          * setBounds(x, y, width, height)
//          * x,y là toạ đồ từ phía trên và bên trái của label
//          * 2 tham số còn lại chỉ định chiều rộng và chiều cao của label
//          */
//         userLabel.setBounds(10, 20, 80, 25);
//         panel.add(userLabel);
//         // Tạo Inout cho người dùng nhập username
//         JTextField userText = new JTextField(20);
//         userText.setBounds(100, 20, 165, 25);
//         panel.add(userText);
//         // Tương tự taọ label và input cho người dùng nhập mật khẩu
//         JLabel passwordLabel = new JLabel("Mật khẩu");
//         passwordLabel.setBounds(10, 50, 80, 25);
//         panel.add(passwordLabel);
//         JPasswordField passwordText = new JPasswordField(20);
//         passwordText.setBounds(100, 50, 165, 25);
//         panel.add(passwordText);
//         // Tạo Button cho user chọn đăng nhập
//         JButton loginButton = new JButton("Đăng nhập");
//         loginButton.setBounds(10, 80, 100, 25);
//         panel.add(loginButton);
//     }
// }

package interFace;

import java.util.*;

import interFace.mySingel.secondSingel;

class mySingel {
    static mySingel msg = null;
    private int x;

    public mySingel() {
    }

    // class in mysingel
    public class secondSingel {
        private int e;
        // init message
        {
            System.out.println("đây là class bên trong class mySingel");
        }

        public secondSingel() {
            this(10);
        }

        public secondSingel(int x) {
            System.out.println(this.e + x);
        }
    }

    // private mySingel() {
    // }

    static public mySingel display(int a) {
        if (msg == null) {
            msg = new mySingel();
            msg.x = a;
        }
        System.out.println(msg.hashCode());
        return msg;
    }

    static public mySingel display() {
        if (msg == null) {
            msg = new mySingel();
        }
        return msg;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int a) {
        this.x = a;
    }

}

public class interfaceLongnhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mySingel a = mySingel.display(sc.nextInt());
        secondSingel k = a.new secondSingel() {

        };
        // mySingel a = mySingel.display();
        System.out.println(a.getX());
        System.out.println(a.hashCode());
        a.setX(sc.nextInt());
        System.out.println(a.getX());
        System.out.println(a.hashCode());
        // -----------------------
        // mySingel b = new mySingel();
        // secondSingel e = b.secondSingel();
        // System.out.println();
    }
}