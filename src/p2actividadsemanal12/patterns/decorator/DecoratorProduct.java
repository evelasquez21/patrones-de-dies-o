/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.patterns.decorator;

/**
 *
 * @author eduar
 */
public class DecoratorProduct implements Salable{
    // Variable protegida
    protected Salable salable;
    
    // Constructor de clase
    public DecoratorProduct(Salable salable){
        this.salable = salable;
    }
    
    // Método para acceder al objeto
    public Salable getSalable(){
        return this.salable;
    }

    @Override
    public double getPrice() {
        return this.salable.getPrice();
    }

    @Override
    public String getDescription() {
        return this.salable.getDescription();
    }
    
}
