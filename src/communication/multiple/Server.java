package communication.multiple;

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
            while (true) {
                Socket socket = serverSocket.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

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

                Scanner sc = new Scanner(System.in);
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

                new Thread(() -> {
                    while (true) {
                        String msg = sc.nextLine();
                        pw.println(msg);
                    }
                }).start();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
