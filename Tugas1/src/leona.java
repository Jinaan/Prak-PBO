public class leona extends daybreak {
    String name = "Leona";
    @Override
    public String daybreakStatus() {
        return "Daybreak or when you activate another Daybreak: Play Solar Flare and give me Barrier this round.";
    }
    @Override
    public int manaCost() {
        return 5;
    }
    @Override
    public int power() {
        return 4;
    }

    public void card() {
        cardStatus.cards(name, manaCost(), power(), new String[] {daybreakStatus()});
    }
}
