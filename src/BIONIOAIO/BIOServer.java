package BIONIOAIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BIOServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(9876));
        //accept 专门负责通信的
        while (true) {
            System.out.println("等待连接----");
            Socket accept = serverSocket.accept();//阻塞1---程序释放CPU资源
            System.out.println("连接成功----");
            Thread thread = new Thread(new ExecuteSocket(accept));
            thread.start();
        }
    }
    static class ExecuteSocket implements Runnable{
        //处理每一个客户端的连接--读写
        byte[] bs = new byte[1024];
        Socket socket;
        public ExecuteSocket(Socket socket){
            this.socket=socket;
        }

        @Override
        public void run() {
            try {
                socket.getInputStream().read(bs);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String content = new String(bs);
            System.out.println(content);
        }
    }
}
