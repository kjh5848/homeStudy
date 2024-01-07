package ex10.Test;

import ex10.EventTest01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTestEx01 extends JFrame {
    private JButton button;
    private JLabel label;
    int counter = 0;

    class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            counter++;
            label.setText("카운터 현재의 값 : " + counter);


        }

    }

    public EventTestEx01() {
        setSize(400, 150);
        setTitle("예제");
        setLayout(new FlowLayout());

        button = new JButton(" 증가");
        label = new JLabel("현재의 카운터 값: " + counter);
        button.addActionListener(new MyListener());

        add(label, "Center");
        add(button, "East");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new EventTest01();
    }

}
