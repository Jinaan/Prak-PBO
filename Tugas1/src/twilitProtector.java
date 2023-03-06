public class twilitProtector extends daybreak implements nightfall {
    String name = "Twilit Protector";
    @Override
    public String daybreakStatus() {
        return "Daybreak  : Give Daybreak allies +1|+1 this round.";
    }
    @Override
    public String nightfallStatus() {
        return "Nightfall : Grant Nightfall allies +1|+0.";
    }
    @Override
    public int manaCost() {
        return 2;
    }
    @Override
    public int power() {
        return 2;
    }

    public void card() {
        cardStatus.cards(name, manaCost(), power(), new String[] {daybreakStatus(), nightfallStatus()});
    }
    
}
