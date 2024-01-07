package ex10;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventTest extends JFrame implements KeyListener {
    public KeyEventTest() {
        setTitle("이벤트 예제");
        setSize(300, 200);
        JTextField tf = new JTextField(20);
        tf.addKeyListener(this);
        add(tf);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        display(e, "KeyType");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        display(e, "keyPresse");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        display(e, "keyRelease");
    }

    protected void display(KeyEvent e, String s) {
        char c = e.getKeyChar();
        int KeyCode = e.getKeyCode();
        String modifiers = e.isAltDown() + " " + e.isControlDown() + "" + e.isShiftDown();
        System.out.println(s + "" + c + "" + KeyCode + "" + " " + modifiers);
    }

    public static void main(String[] args) {
        new KeyEventTest();
    }
}
