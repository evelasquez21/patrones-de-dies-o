/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2actividadsemanal12.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public abstract class Subject {    
    // Lista de observadores
    private List<Observer> observers = new ArrayList<>();
    
    // Método para agregar un observador
    public void addObserver(Observer o){
        this.observers.add(o);
    }
    
    // Método para eliminar un observador
    public void removeObserver(Observer o){
        this.observers.remove(o);
    }
    
    // Método para notificar a observador
    public void notifyObserver(String message){
        for (Observer o : observers){
            o.update(message);
        }
    }
}
