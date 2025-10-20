/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.patterns.observer;

import p2actividadsemanal12.patterns.singleton.AppLogger;

/**
 *
 * @author eduar
 */
public class AlertIntentory implements Observer{

    @Override
    public void update(String message) {
        System.out.println("[Alerta de inventario]: " + message);
        AppLogger.getInstance().log("Alerta: " + message);
    }
    
}
