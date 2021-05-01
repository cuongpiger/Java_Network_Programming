import java.net.*;

public class AddressTests {
    public static int getVersion(InetAddress ia) {
        byte[] add = ia.getAddress();

        return add.length == 4 ? 4 : add.length == 16 ? 6 : -1;
    }
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Version of your address: " + AddressTests.getVersion(InetAddress.getLocalHost()));
    }
}
