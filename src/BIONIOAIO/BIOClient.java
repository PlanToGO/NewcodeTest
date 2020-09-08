package BIONIOAIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class BIOClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("127.0.0.1",9876));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容");
        while (true){
            String next = scanner.next();
            socket.getOutputStream().write(next.getBytes());
        }
    }
}
