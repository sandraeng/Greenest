import javax.swing.*;

public class Headprogram {

    public Headprogram() {

        boolean keepRunning = true;
        // polymorphism
        Plants igge = new Cacti("Igge", 0.2);
        Plants laura = new Palm("Laura", 5);
        Plants meatloaf = new CarnivorousPlant("Meatloaf", 0.7);
        Plants olof = new Palm("Olof", 1);


        while (keepRunning) {
        String input = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            switch (input.toLowerCase()) {
                case "igge":
                    JOptionPane.showMessageDialog(null, igge.toString());
                    break;

                    case "laura":
                        JOptionPane.showMessageDialog(null,laura.toString());
                        break;

                       case "meatloaf":
                           JOptionPane.showMessageDialog(null,meatloaf.toString());
                           break;

                           case "olof":
                               JOptionPane.showMessageDialog(null,olof.toString());
                               break;

                               default:
                                   JOptionPane.showMessageDialog(null,"Felaktig inmatning");
                                   continue;

            }
            keepRunning = false;
        }
    }


    public static void main(String[] args) {
        Headprogram hp = new Headprogram();
    }
}
