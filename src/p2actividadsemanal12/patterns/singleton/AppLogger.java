/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.patterns.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author eduar
 */
public class AppLogger {
    // Instancia creada al inicio
    private static final AppLogger instance = new AppLogger();
    
    // Formato de fecha
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    // Constructor vacío
    private AppLogger(){
        
    }
    
    // Método para obtener instancia única
    public static AppLogger getInstance(){
        return instance;
    }
    
    // Método para obtener mensaje
    public void log(String message){
        System.out.println("[Log " + dtf.format(LocalDateTime.now()) + "] " + message);
    }
}
