import java.io.*;
import java.net.*;

class MyClient {
    public static void main(String args[]) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.close();
            dout.flush();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readUTF();
            System.out.println("Message: " + str);
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}