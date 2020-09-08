package BIONIOAIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

public class NIOServer {
    public static void main(String[] args) throws IOException {
        List<SocketChannel> list = new ArrayList<>();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        try {
            ServerSocketChannel ssc = ServerSocketChannel.open();
            ssc.bind(new InetSocketAddress(9876));
            ssc.configureBlocking(false);
            //ssc.register();
            while (true){
                Selector selector = Selector.open();
                SocketChannel socketChannel = ssc.accept();
                if (socketChannel==null){
                    Thread.sleep(1000);
                    System.out.println("没有人连接-----");
                    for (SocketChannel channel:list){
                        int k=channel.read(byteBuffer);
                        System.out.println(k);
                        if (k!=0){
                            byteBuffer.flip();
                            System.out.println(new String(byteBuffer.array()));
                        }
                    }
                }else {
                    socketChannel.configureBlocking(false);
                    list.add(socketChannel);
                    //得到套接字，循环所有的套接字，通过套接字获取数据
                    for (SocketChannel channel:list){
                        int k=channel.read(byteBuffer);
                        System.out.println(k+"=====================");
                        if (k!=0){
                            byteBuffer.flip();
                            System.out.println(new String(byteBuffer.array()));
                        }
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
