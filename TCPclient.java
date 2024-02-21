import java.io.*;
import java.net.*;
/**
 *
 * @author Lenovo
 */
public class TCPclient {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost",1234);
            System.out.println(socket + "Server is connected");
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
           DataInputStream in=new DataInputStream(socket.getInputStream());
           out.writeUTF("Hello server");
           String str=(String) in.readUTF();
           System.out.println("message= "+str);
           socket.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}