public class cardStatus {
    String name;
    public static void cards(String name, int manaCost, int power, String status[]) {
        try {
            System.out.println(name + " has " + manaCost + " mana cost, " + power + " power, and with status :");
            for (int i = 0; i < status.length; i++) {
                System.out.println("\t"+status[i]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Thats all about '" + name + "' card.");
        }
    }
}
