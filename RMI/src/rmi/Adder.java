/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.*;
/**
 *
 * @author Lenovo
 */
public interface Adder extends Remote {
    public int Add(int a , int b) throws RemoteException;
}
