/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2actividadsemanal12;

import java.util.Locale;
import p2actividadsemanal12.core.Cart;
import p2actividadsemanal12.core.Product;
import p2actividadsemanal12.patterns.decorator.DecoratorProduct;
import p2actividadsemanal12.patterns.decorator.ExtendWarranty;
import p2actividadsemanal12.patterns.decorator.GiftWrapping;
import p2actividadsemanal12.patterns.decorator.Salable;
import p2actividadsemanal12.patterns.facade.CheckoutFacade;
import p2actividadsemanal12.patterns.observer.AlertIntentory;
import p2actividadsemanal12.patterns.observer.TotalCartDisplay;
import p2actividadsemanal12.patterns.singleton.AppLogger;


/**
 *
 * @author eduar
 */
public class P2ActividadSemanal12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Configuración inicial para Singleton y Observers
        AppLogger logger = AppLogger.getInstance();
        logger.log("Bienvenido a la tienda");
        
        // creación de los observadores
        TotalCartDisplay displayCart = new TotalCartDisplay();
        AlertIntentory alertInventory = new AlertIntentory();
        
        // Creción del carrito vinculado con los observadores
        Cart cart = new Cart();
        cart.addObserver(displayCart);
        
        // Creación de los productos y el patron Decorator
        logger.log("Agregando productos");
        
        // Creación de los productos base
        Product mouse = new Product("Mouse gaming", 350, 2);
        Product audifonos = new Product("Audifonos", 125, 1);
        
        mouse.addObserver(alertInventory);
        
        // Decoración del producto
        Salable mouseGarantia = new ExtendWarranty(mouse);
        Salable mouseCompleto = new GiftWrapping(mouseGarantia);
        
        // Simulación de compra
        System.out.println(
                "-----------------------------------" +
                "\nSe agregarón productos al carrito" +
                "\n-----------------------------------"
        );
        cart.addItem(mouseCompleto);
        cart.addItem(audifonos);
        
        // Detalle final del carrito
        System.out.println(
                "-----------------------------------" +
                "\nDetalles del carrito" +
                "\n-----------------------------------"
        );
        for (Salable item : cart.getItems()){
            String lineItem = String.format(Locale.US, "Producto: %-45s | Precio: Q%.2f\n", item.getDescription(), item.getPrice());
            System.out.println(lineItem);
        }
        System.out.printf("Total: Q%.2f\n", cart.getTotal());
        
        // Proceso de checkout
        System.out.println(
                "-----------------------------------" +
                "\nRealizando Checkout" +
                "\n-----------------------------------"
        );
        CheckoutFacade checkout = new CheckoutFacade();
        checkout.proccessPurchase(cart);
    }
    
}
