/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.*;
/**
 *
 * @author Lenovo
 */
public class ClientRmi {
    public static void main(String[] args){
        try{
            Adder stub =(Adder)Naming.lookup("rmi://localhost:5000/test");
            int sum = stub.Add(100,6);
            System.out.println("Return sum " + sum);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
