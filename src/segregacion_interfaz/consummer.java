/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segregacion_interfaz;

/**
 *
 * @author JonathanC
 */
public class consummer implements interfaceConsummer{

    @Override
    public void buy() {
    System.out.println("buy a product");
    }

    @Override
    public void addProduct() {
    System.out.println("add a product");
    }

    @Override
    public void login() {
    System.out.println("Logged in");
    }

    @Override
    public void logout() {
    System.out.println("Logged out");
    }
    
}
