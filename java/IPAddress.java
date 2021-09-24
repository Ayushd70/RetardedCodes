//This program prints IP or internet protocol address of your computer system.
// InetAddress class of java.net package is used, getLocalHost method returns InetAddress object which represents local host

import java.net.InetAddress;

class IPAddress {
    public static void main(String[] args) throws Exception {
        System.out.println(InetAddress.getLocalHost());
    }
}
