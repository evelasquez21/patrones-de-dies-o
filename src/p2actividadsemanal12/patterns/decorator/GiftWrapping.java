/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.patterns.decorator;

/**
 *
 * @author eduar
 */
public class GiftWrapping extends DecoratorProduct{
    
    // Constructor de clase
    public GiftWrapping(Salable salable) {
        super(salable);
    }
    
    @Override
    public double getPrice() {
        // Costo extra de envoltura
        double extraCost = 10.0;
        return this.salable.getPrice() + extraCost;
    }

    @Override
    public String getDescription() {
        // Descripción del extra
        return this.salable.getDescription() + " + Envolutra de regalo.";
    }
}
