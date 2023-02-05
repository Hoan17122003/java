package libaryJavax;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputDialogInFrame extends JFrame {

    public InputDialogInFrame() {

        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("Input Dialog in Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        getContentPane().setLayout(null);

    }

    private void closeIt() {

        this.getContentPane().setVisible(false);
        this.dispose();

    }

    // public static void main(String[] args) {

    // InputDialogInFrame frame = new InputDialogInFrame();
    // String m = JOptionPane.showInputDialog(frame, "Anyone there?");
    // JOptionPane.showMessageDialog(frame, m, "result: ", "finaly", 1);
    // if (m.isEmpty()) {
    // frame.closeIt();
    // }

    // }

}