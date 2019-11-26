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
public class Segregacion_interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    consummer consummer_one= new consummer();
    buy(consummer_one);
    
    seller seller_one= new seller();
    sell(seller_one);
    
    }
    
    public static void buy(consummer consummer){
    consummer.login();
    consummer.addProduct();
    consummer.buy();
    consummer.logout();
    }
    
    public static void sell(seller seller){
       seller.login();
       seller.sell();
       seller.sendProduct();
       seller.logout();
    }
}
