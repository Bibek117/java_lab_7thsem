import java.io.*;
import java.net.*;
/**
 *
 * @author Lenovo
 */
public class TCPserver {
    public static void main(String[] args){
        try{
            ServerSocket server=new ServerSocket(1234);
           Socket client=server.accept();//establishes connection
           System.out.println(client + "Client is connected");
           DataOutputStream out=new DataOutputStream(client.getOutputStream());
           DataInputStream in=new DataInputStream(client.getInputStream());
           String str=(String) in.readUTF();
           System.out.println("message= "+str);
           out.writeUTF("Hello client");
           client.close();
}catch(Exception e)
{
    System.out.println(e);}
}
    }
