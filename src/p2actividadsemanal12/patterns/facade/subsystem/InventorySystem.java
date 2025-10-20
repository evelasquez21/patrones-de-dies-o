/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.patterns.facade.subsystem;

import java.util.List;
import p2actividadsemanal12.core.Product;
import p2actividadsemanal12.patterns.decorator.DecoratorProduct;
import p2actividadsemanal12.patterns.decorator.Salable;

/**
 *
 * @author eduar
 */
public class InventorySystem {
    // Método para descontar del Stock
    public void manageStock(List<Salable> items){
        System.out.println("[Inventario]: Descontando stock de productos...");
        
        // Reccore la lista para buscar el producto original
        for (Salable item : items){
            
            // Busca el producto original
            Salable productBase = item;
            while (productBase instanceof DecoratorProduct){
                productBase = ((DecoratorProduct) productBase).getSalable();
            }
            
            // Confirmación de que se ha obtenido el producto original
            if (productBase instanceof Product){
                ((Product) productBase).sold(1);
            }
        }
    }
}
