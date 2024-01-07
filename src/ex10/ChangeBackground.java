package ex10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBackground extends JFrame {
    private JButton button1, button2;
    private JPanel panel;
    MyListener listener = new MyListener();


    public ChangeBackground() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");

        panel = new JPanel();
        button1 = new JButton("노란색");
        button1.addActionListener(listener);
        panel.add(button1);

        button2 = new JButton("핑크색");
        button2.addActionListener(listener);
        panel.add(button2);

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                panel.setBackground(Color.yellow);

            } else if (e.getSource() == button2) {
                panel.setBackground(Color.pink);
            }

        }
    }

    public static void main(String[] args) {
        new ChangeBackground();
    }
}
