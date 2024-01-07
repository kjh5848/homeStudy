package ex10;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventTest05 extends JFrame {

    private JButton button;
    private JLabel label;
    int counter = 0;



    public EventTest05() {
        setSize(400, 150);
        setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값 " + counter);
        button.addActionListener(e -> {
            counter++;
            label.setText("현재의 카운터 값: " + counter);
        } );

        add(label, "Center");
        add(button, "East");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new EventTest05();
    }
}
