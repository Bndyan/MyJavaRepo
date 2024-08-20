package sprachkern;
/** Wiederholungen / Schleifen / Iterationen / Loops
 *
 * Eine Schleife ist eine Kontrollstruktur in Programmiersprachen.
 * Sie wiederholt eine Anweisung oder einen Anweisungs-Block
 * (den sogenannten Schleifenrumpf oder Schleifenkörper),
 * solange die Schleifenbedingung als Laufbedingung gültig bleibt.
 *
 * Schleifen, deren Schleifenbedingung immer zur Fortsetzung führt
 * oder die keine Schleifenbedingung haben, sind Endlosschleifen.
 *

 *
 */
public class Schleifen {
    public static void main(String[] args) {
//        int x = 0;
//        while (x <= 5){
//            System.out.println("Text : " + x);
//            x++; // 0 bis 5
//        }
//
//        while (x <= 5){
//            x++;
//            System.out.println("Text : " + x);
//             // 1 bis 5
//        }
//
//
//        // Beispiel 2 4 6 10 14 18
//        x = 2;
//        while (x <= 18){
//            System.out.print(x + "  ");
//            x += 4;
//        }

        // Thomas

        // Beispiel: Zähle von 1 bis 5
        int x = 0;
        while (x < 5) {
            x++;
            System.out.print(x+" ");
        }
        System.out.println();

        // Beispiel: 2 6 10 14 18
        x = 2;
        while(x <= 18) {
            System.out.print(x+" ");
            x += 4;
        }
        System.out.println();



    }
}
