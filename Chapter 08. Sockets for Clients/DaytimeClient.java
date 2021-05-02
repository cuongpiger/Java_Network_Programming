import java.net.*;
import java.io.*;

public class DaytimeClient {
    public static void main(String[] args) throws UnknownHostException {
        String hostname = "rosie";
        Socket socket = null;

        try {
            socket = new Socket(hostname, 13);
            socket.setSoTimeout(15_000);

            InputStream is = socket.getInputStream();
            StringBuilder time = new StringBuilder();
            InputStreamReader isr = new InputStreamReader(is, "ASCII");

            for (int c = isr.read(); c != -1; c = is.read()) {
                time.append((char) c);
            }

            System.out.println("Time: " + time);
        } catch (IOException err) {
            System.err.println(err);
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException err) {
                    //ignore
                }
            }
        }
    }
}
