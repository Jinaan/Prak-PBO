
public class cardStatus {
    String name;
    public static void cards(String name, int manaCost, int power, String status[]) {
        try {
            String header = "    +--------------============--------------+\n    |         =====            =====         |\n    |   ======                      ======   |";
            String o4a = "    +===";
            String o4b ="===+"; // 34 space
            String statusBreak = "    |=                                      =|";
            String fullSpace = "    |========================================|";
            String imgPlace = "    |=====                              =====|";
            String o5a = "    |=  ";
            String o5b = "  =|"; // 36 space
            String headerPoint = "    |*******==========================*******|";
            String o6a = "    |*  ";
            String o6b = " *==========================*  ";
            String o6c = " *|";
            
            // +===========+
            // | Name Card |
            // +===========+
            int awal = (34 - name.length()) / 2;
            int akhir = 34 - name.length() - awal;
            String first = "";
            String last = "";
            for (int i = 0; i < awal; i++) {
                first += " ";
            }
            for (int i = 0; i < akhir; i++) {
                last += " ";
            }
            String nameCard = o4a + first + name + last + o4b;
            
            
            // |===================|
            // | Mana Cost | Power |
            // |===================|
            String manaCard = String.valueOf(manaCost);
            if (manaCard.length() == 1) {
                manaCard = manaCard + " ";
            }
            String powerCard = String.valueOf(power);
            if (powerCard.length() == 1) {
                powerCard = powerCard + " ";
            }
            String costCard = o6a + manaCard + o6b + powerCard + o6c;







            // |===================|
            // | Status Card       |
            // |===================|
            String[] descp;
            String[] des = new String[10];
            int k = 0; // index of des
            for (int i = 0; i < status.length; i++) {
                descp = status[i].split(" "); // split by space
                int j = 0; // index of descp
                String temp = ""; // temp string
                while (j < descp.length) { // loop until j is the last index of descp
                    if (temp.length() + descp[j].length() < 34) { // if temp + descp[j] is less than 34
                        temp += descp[j] + " ";   // add descp[j] to temp
                        j++; // increase j
                    } else { // if temp + descp[j] is more than 34
                        des[k] = temp; // add temp to des[i][k]
                        k++; // increase k
                        temp = ""; // reset temp
                    }
                }
            }
            int temp = 0;
            for (int i = 0; i < des.length; i++) {
                if (des[i] != null) {
                    temp++;
                }
            }

            descp = new String[temp];

            for (int j = 0; j < des.length; j++) {
                if (des[j] != null) {
                    int akhir2 = 34 - des[j].length();
                    String last2 = "";
                    for (int x = 0; x < akhir2; x++) {
                        last2 += " ";
                    }
                    descp[j] = o5a + des[j] + last2 + o5b;
                }
            }
            




            // |===================|
            // | Making Card       |
            // |===================|
            String cardS = "\n" + header + "\n" + nameCard + "\n" + fullSpace + "\n";
            for (int i = 0; i < 5; i++) {
                cardS += imgPlace + "\n";
            }
            cardS += fullSpace + "\n" + statusBreak + "\n";
            for (int i = 0; i < temp; i++) {
                cardS += descp[i] + "\n";
            }
            cardS += statusBreak + "\n" + fullSpace + "\n" + headerPoint + "\n" + costCard + "\n" + headerPoint + "\n" + fullSpace;





            System.out.println(cardS);


        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Thats all about '" + name + "' card.\n");
        }
    }
}
