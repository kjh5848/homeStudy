package communication.half;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            msg = br.readLine();
            System.out.println("서버로부터" + msg + "잘 받았음");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
