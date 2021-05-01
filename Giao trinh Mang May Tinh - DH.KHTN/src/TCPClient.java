import java.io.*;
import java.net.*;

class TCPClient {
    public static void main(String[] args) throws Exception {
        String sentence;
        String modified_sentence;

        System.out.print("ENTER A MESSAGE: ");
        BufferedReader in_from_user = new BufferedReader(new InputStreamReader(System.in));
        Socket client_socket = new Socket("rosie", 6789);
        DataOutputStream out_to_server = new DataOutputStream(client_socket.getOutputStream());
        BufferedReader in_from_server = new BufferedReader(new InputStreamReader(client_socket.getInputStream()));

        sentence = in_from_user.readLine();
        out_to_server.writeBytes(sentence + '\n');
        modified_sentence = in_from_server.readLine();

        System.out.println("FROM SERVER: " + modified_sentence);
        client_socket.close();
    }
}
