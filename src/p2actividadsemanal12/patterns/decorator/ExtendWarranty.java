/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.patterns.decorator;

/**
 *
 * @author eduar
 */
public class ExtendWarranty extends DecoratorProduct{
    
    // Constructor de clase
    public ExtendWarranty(Salable salable) {
        super(salable);
    }
    
    @Override
    public double getPrice() {
        // Porcentaje del precio por garantia
        double garantia = (super.getPrice() * 0.05);
        return this.salable.getPrice() + garantia;
    }

    @Override
    public String getDescription() {
        // Descripción del extra
        return this.salable.getDescription() + " + Garantía Extendida.";
    }
}
