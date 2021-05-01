import java.net.*;

public class MyAddress {
    public static void main(String[] args) {
        try {
            InetAddress add = InetAddress.getLocalHost();
            System.out.println("Localhost: " + add);
        } catch (UnknownHostException err) {
            System.out.println("Could not find your computer's address ");
        }
    }
}
