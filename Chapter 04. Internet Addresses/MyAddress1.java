import java.net.*;

public class MyAddress1 {
    public static void main(String[] args) {
        try {
            InetAddress add = InetAddress.getLocalHost();
            String dotted_quad = add.getHostAddress();

            System.out.println("My address is: " + dotted_quad);
        } catch (UnknownHostException err) {
            System.out.println("Sorry, I do not know my own address!");
        }
    }
}
