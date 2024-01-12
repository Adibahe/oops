import java.io.*;
import java.net.*;

class MyServer {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message :" + str);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello client");
            dout.close();
            dout.flush();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}