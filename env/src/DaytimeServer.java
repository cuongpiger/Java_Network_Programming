import java.net.*;
import java.io.*;
import java.util.Date;

public class DaytimeServer {
    public final static int PORT = 6789;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) { // tạo một ServerSocket đang lắng nghe các kết nối tới nó tại port 13
            System.out.println("Server is listening at port " + PORT);
            while (true) {
                try (Socket conn = server.accept()) {
                    Writer out = new OutputStreamWriter(conn.getOutputStream());
                    Date now = new Date();
                    out.write(now.toString());
                    out.flush();
                    conn.close();

                    System.out.println("\uD83D\uDCFA " + out.toString());
                } catch (IOException err) {
                    System.err.println("\uD83D\uDEAB " + err);
                }
            }
        } catch (IOException err) {
            System.err.println("\uD83D\uDEAB " + err);
        }
    }
}
