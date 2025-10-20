/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.core;

import java.util.ArrayList;
import java.util.List;
import p2actividadsemanal12.patterns.decorator.Salable;
import p2actividadsemanal12.patterns.observer.Subject;

/**
 *
 * @author eduar
 */
public class Cart extends Subject{
    private List<Salable> items = new ArrayList<>();
    
    // Método para agregar un item
    public void addItem(Salable item){
        this.items.add(item);
        notifyObserver("Nuevo total: " + getTotal());
    }
    
    // Método para calcular el total de los items
    public double getTotal(){
        return items.stream()
            .mapToDouble(Salable::getPrice)
            .sum();
    }
    
    // Getter de items
    public List<Salable> getItems(){
        return this.items;
    }
}
