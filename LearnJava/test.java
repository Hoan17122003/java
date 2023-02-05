import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try {
            ImageIcon Iconn = new ImageIcon("Java/LearnJava/anh1.png");
            
            // Iconn.setImage(null);
            String[] options = { "maybe", "i love it", "no, i do not like" };
            String n = (String) JOptionPane.showInputDialog(null, "Do you like turtles??",
                    "I like turtles", JOptionPane.QUESTION_MESSAGE, Iconn, options, options[2]);

        } catch (Exception e) {
            throw new Error("bug" + e);
        }
    }
}
