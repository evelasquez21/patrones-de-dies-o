/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.patterns.observer;

/**
 *
 * @author eduar
 */
public class TotalCartDisplay implements Observer{
    
    // Salida del observador
    @Override
    public void update(String message) {
        System.out.println("[Carrito]: " + message);
    }
    
}
