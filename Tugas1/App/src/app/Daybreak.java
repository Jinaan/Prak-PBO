/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author ACER
 */
abstract class Daybreak implements Card {
    public abstract String daybreakStatus();
    
    public abstract int manaCost();
    public abstract int power();
    
    
    @Override
    public abstract void card();
}
