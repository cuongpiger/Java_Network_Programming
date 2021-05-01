import java.io.*;
import java.net.*;

class TCPServer {
    public static void main(String[] args) throws Exception {
        String client_sentence;
        String capitalized_sentence;
        ServerSocket welcome_socket = new ServerSocket(6789);

        while (true) {
            Socket conn_socket = welcome_socket.accept();
            BufferedReader in_from_client = new BufferedReader(new InputStreamReader(conn_socket.getInputStream()));
            DataOutputStream out_to_client = new DataOutputStream(conn_socket.getOutputStream());
            client_sentence = in_from_client.readLine();
            capitalized_sentence = client_sentence.toUpperCase() + '\n';
            out_to_client.writeBytes(capitalized_sentence);
        }
    }
}
