import javax.swing.*;
import java.awt.*;

public class Main {
    Main() {
        prepareGUI();
    }

    public static void main(String[] args) {
        new Main();
    }

    void prepareGUI() {
        JFrame f = new JFrame("Mark Sheet");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(new GridLayout(9, 2));
//        container c = f.getContentPane();
//        f.setBounds(10, 10, 400, 400);
        JLabel l1 = new JLabel("Enter marks in OOT");
        l1.setBounds(10, 10, 150, 30);
        f.add(l1);
        JTextField t1 = new JTextField();
        t1.setBounds(170, 10, 150, 30);
        f.add(t1);
        JLabel l2 = new JLabel("Enter marks in OOP");
        l2.setBounds(10, 50, 150, 30);
        f.add(l2);
        JTextField t2 = new JTextField();
        t2.setBounds(170, 50, 150, 30);
        f.add(t2);
        JLabel l3 = new JLabel("Enter marks in DBMS");
        l3.setBounds(10, 90, 150, 30);
        f.add(l3);
        JTextField t3 = new JTextField();
        t3.setBounds(170, 90, 150, 30);
        f.add(t3);
        JButton b1 = new JButton("Generate");
        b1.setBounds(10, 130, 150, 30);
        f.add(b1);
        JButton b2 = new JButton("Cancel");
        b2.setBounds(170, 130, 150, 30);
        f.add(b2);
        JLabel l4 = new JLabel("Total Marks");
        l4.setBounds(10, 170, 150, 30);
        f.add(l4);
        JLabel l5 = new JLabel(String.valueOf(0.0));
        l5.setBounds(170, 170, 150, 30);
        f.add(l5);
        JLabel l6 = new JLabel("Percentage");
        l6.setBounds(10, 210, 150, 30);
        f.add(l6);
        JLabel l7 = new JLabel(String.valueOf(0.0));
        l7.setBounds(170, 210, 150, 30);
        f.add(l7);
        JLabel l8 = new JLabel("Division");
        l8.setBounds(10, 250, 150, 30);
        f.add(l8);
        JLabel l9 = new JLabel("1st / 2nd / 3rd / Fail");
        l9.setBounds(170, 250, 150, 30);
        f.add(l9);
        JLabel l10 = new JLabel("Result");
        l10.setBounds(10, 290, 150, 30);
        f.add(l10);
        JLabel l11 = new JLabel("Pass / Fail");
        l11.setBounds(170, 290, 150, 30);
        f.add(l11);
    }

}
