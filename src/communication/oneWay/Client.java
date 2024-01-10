package communication.oneWay;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",20000);
            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();
            PrintWriter pw = new PrintWriter(
                    socket.getOutputStream(), true
            );

            pw.println(msg);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
