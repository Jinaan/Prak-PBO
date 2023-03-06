/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author ACER
 */
public class Aphelios extends Nightfall{
    String name = "Aphelios";
    
    /**
     *
     * @return
     */
    @Override
    public String nightfallStatus() {
        return "Nightfall : Pick a Moon Weapon to create in hand. Each round, the first time I see you play 2 other cards, if you don't already have a Moon Weapon, create the Phased Moon Weapon in hand.";
    }
    
    /**
     *
     * @return
     */
    @Override
    public int manaCost() {
        return 3;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int power() {
        return 3;
    }

    @Override
    public void card() {
        printCard.printcards(name, manaCost(), power(), new String[] {nightfallStatus()});
    }   
}
