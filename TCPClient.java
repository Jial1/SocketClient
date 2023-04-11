import java.io.*;
import java.net.*;


public class TCPClient {
    public static void main(String[] args) {
        String host = args[0];
        int port = Integer.valueOf(args[1]);
        try (Socket sock = new Socket(host, port)) {
            OutputStream out = sock.getOutputStream();
            InputStream in = sock.getInputStream();

            int readChar = 0;
            while ((readChar = in.read()) != -1) {
                System.out.write(readChar);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}