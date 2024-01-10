package communication.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();
            // 요청을 받아 읽는 버퍼
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 메세지를 받아 출력
            new Thread(() -> {
                while (true) {
                    String msg = null;
                    try {
                        msg = br.readLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("클라이언트한테서 : " + msg);
                }
            }).start();

            // 메세지를 보내는 버퍼
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            new Thread(() -> {
                while (true) {
                    String msg = sc.nextLine();
                    pw.println(msg);
                }
            }).start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
