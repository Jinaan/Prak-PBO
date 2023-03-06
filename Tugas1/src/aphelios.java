public class aphelios implements nightfall {
    String name = "Aphelios";
    @Override
    public String nightfallStatus() {
        return "Nightfall : Pick a Moon Weapon to create in hand. Each round, the first time I see you play 2 other cards, if you don't already have a Moon Weapon, create the Phased Moon Weapon in hand.";
    }
    @Override
    public int manaCost() {
        return 3;
    }
    @Override
    public int power() {
        return 3;
    }

    public void card() {
        cardStatus.cards(name, manaCost(), power(), new String[] {nightfallStatus()});
    }
}