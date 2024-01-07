package ex10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        JButton button1 = (JButton) e.getSource();
        //counter ++;
        //label.setText("현재의 카운터 값 " + counter);
    }
}

public class EventTest02 extends JFrame {
    private JButton button;
    private JLabel label;
    int counter = 0;



    public EventTest02() {
        setSize(400, 150);
        setTitle("이벤트 예제");
        setLayout(new FlowLayout());

        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값 " + counter);
        button.addActionListener(new MyListener());

        add(label, "Center");
        add(button, "East");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new EventTest02();
    }
}
