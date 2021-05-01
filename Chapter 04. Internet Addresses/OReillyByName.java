import java.net.*;

public class OReillyByName {
    public static void main(String[] args) {
        try {
            InetAddress add = InetAddress.getByName("www.hcmus.edu.vn");
            System.out.println("Address: " + add);
        } catch (UnknownHostException err) {
            System.out.println("Could not find hcmus.edu.vn");
        }
    }
}
