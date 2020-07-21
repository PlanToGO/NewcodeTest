package Internettest;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class address {
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            switch (ip.getAddress().length){
                case 4:
                    System.out.println("本机IPv4地址是："+ ip.getHostAddress());
                    System.out.println("本机的主机名是："+ip.getHostName());
                    break;
                case 16:
                    System.out.println("本机IPv6地址是："+ ip.getHostAddress());
                    System.out.println("本机的主机名是："+ip.getHostName());
                    break;
            }
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
