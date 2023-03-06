/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author ACER
 */
public class SolariSoldier extends Daybreak {
    String name = "Solari Soldier";
    String description = "Daybreak: Give me +1|+1 this round.";
    int manaCost = 1;
    int power = 2;

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

    @Override
    public void card() {
        printCard.printcards(name, manaCost(), power(), new String[] {daybreakStatus()});
    }

}
