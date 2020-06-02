import java.net.*;
import java.io.*;
import java.util.*;

class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 3000);
            System.out.println("start");
            System.out.println("waiting for the server...");
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            System.out.println("Enter your message :- ");
            Scanner sl = new Scanner(System.in);
            String mes = sl.nextLine();
            dos.writeUTF(mes);
            String s = dis.readUTF();
            System.out.println("Server :- " + s);
            socket.close();
        } catch (IOException e) {
            System.out.println("Exception!!");
        }
    }
}
