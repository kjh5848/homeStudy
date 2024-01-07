package ex10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventTest03 extends JFrame implements ActionListener {

    private JButton button;
    private JLabel label;
    int counter = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("현재의 카운터 값: " + counter);
    }

    public EventTest03() {
        setSize(400, 150);
        setTitle("이벤트 예제");
        setLayout(new FlowLayout());

        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값 " + counter);
        button.addActionListener(this);

        add(label, "Center");
        add(button, "East");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new EventTest03();
    }
}
