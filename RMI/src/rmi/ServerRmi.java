/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerRmi {
    public static void main(String[] args) {
        try {
            Adder skeleton = new AddImplement();
            LocateRegistry.createRegistry(5000);
            Naming.rebind("rmi://localhost:5000/test", skeleton);
            System.out.println("Server is running...");
        } catch (RemoteException e) {
            System.out.println("RemoteException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
