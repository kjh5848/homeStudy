package ex10;

import javax.swing.*;
import java.awt.*;

public class ChangeBackgroundRambda extends JFrame {
    private JButton button1, button2;
    private JPanel panel;
    //MyListener listener = new MyListener();


    public ChangeBackgroundRambda() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("이벤트 예제");

        panel = new JPanel();
        button1 = new JButton("노란색");
        button1.addActionListener(e -> {
            panel.setBackground(Color.yellow);
        });
        panel.add(button1);

        button2 = new JButton("핑크색");
        button2.addActionListener(e -> {
            panel.setBackground(Color.pink);
        });;
        panel.add(button2);

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        new ChangeBackgroundRambda();
    }
}
