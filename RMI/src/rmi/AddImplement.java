/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.*;
import java.rmi.server.*;

/**
 *
 * @author Lenovo
 */
public  class AddImplement  extends UnicastRemoteObject implements Adder{
    AddImplement() throws RemoteException{
        super();
    }
    @Override
    public int Add(int a , int b) throws RemoteException{
        return a+b;
    }
}
