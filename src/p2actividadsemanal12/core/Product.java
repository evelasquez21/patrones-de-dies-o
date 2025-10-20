/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.core;

import p2actividadsemanal12.patterns.decorator.Salable;
import p2actividadsemanal12.patterns.observer.Subject;

/**
 *
 * @author eduar
 */
public class Product extends Subject implements Salable{
    // Atributos de clase
    private String name;
    private double price;
    private int stock;

    // Constructor de clase
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    // Método para verificar y notificar stock
    public void sold(int amount){
        if (this.stock >= amount){
            this.stock -= amount;
            if (this.stock == 0){
                
            }
        }
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.name;
    }
}
