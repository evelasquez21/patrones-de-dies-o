/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.patterns.facade;

import p2actividadsemanal12.core.Cart;
import p2actividadsemanal12.patterns.facade.subsystem.InventorySystem;
import p2actividadsemanal12.patterns.facade.subsystem.PaySystem;
import p2actividadsemanal12.patterns.facade.subsystem.ShippingSystem;
import p2actividadsemanal12.patterns.singleton.AppLogger;

/**
 *
 * @author eduar
 */
public class CheckoutFacade {
    // Atributos de clase
    private PaySystem pay = new PaySystem();
    private InventorySystem inventory = new InventorySystem();
    private ShippingSystem shipping = new ShippingSystem();
    
    // Método para procesar compra
    public void proccessPurchase(Cart cart){
        // notificación del sistema
        AppLogger.getInstance().log("Iniciando proceso de checkout.");
        
        // Llamada de los métodos
        pay.purchase(cart.getTotal());
        inventory.manageStock(cart.getItems());
        shipping.prepareShipping();
        
        // notificación del sistema
        AppLogger.getInstance().log("Compra finalizada con éxito." +
            "\nTotal: " +
            cart.getTotal());
    }
}
