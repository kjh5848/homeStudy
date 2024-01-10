package communication.half;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()
                    )
            );

            String msg = br.readLine();
            System.out.println("클라이언트한테서 : "+ msg);

            PrintWriter pw = new PrintWriter(
                    socket.getOutputStream(),true
            );

            pw.println(msg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
