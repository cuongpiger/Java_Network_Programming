import java.net.*;

public class ReverseTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress add = InetAddress.getByName("14.161.23.204");
        System.out.println("Hostname: " + add.getCanonicalHostName());
    }
}
