package communication.multiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 20000);
            Scanner sc = new Scanner(System.in);
            // 요청을 보내는 버퍼
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            // 메세지를 보내를 버퍼
            new Thread(() -> {
                while (true) {
                    String msg = sc.nextLine();
                    pw.println(msg+"2번이");
                }
            }).start();

            //메세지를 받는 버퍼
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            new Thread(() -> {

                while (true) {

                    String msg = null;
                    try {
                        msg = br.readLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("서버로부터 2번에개 :" + msg);
                }
            }).start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
