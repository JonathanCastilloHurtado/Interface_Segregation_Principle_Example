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
public class seller implements interfaceSeller{

    @Override
    public void login() {
    System.out.println("Logged in");
    }

    @Override
    public void logout() {
    System.out.println("Logged out");
    }

    @Override
    public void sell() {
    System.out.println("sell a product");    }

    @Override
    public void sendProduct() {
    System.out.println("send a product");    }
    
}
