/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author ACER
 */
public class Leona extends Daybreak {
    String name = "Leona";
    String description = "Daybreak or when you activate another Daybreak: Play Solar Flare and give me Barrier this round.";
    int manaCost = 5;
    int power = 4;


    @Override
    public String daybreakStatus() {
        return description;
    }
    @Override
    public int manaCost() {
        return manaCost;
    }
    @Override
    public int power() {
        return power;
    }

    /**
     *
     */
    @Override
    public void card() {
        printCard.printcards(name, manaCost(), power(), new String[] {daybreakStatus()});
    }

}
