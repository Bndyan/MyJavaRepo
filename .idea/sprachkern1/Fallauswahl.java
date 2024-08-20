package sprachkern;

/**
 * Fallauswahl  (switch case)
 * - nur ordinale Datentypen: byte , short, int, char (kein long!)
 * - ab Java 7 auch String
 *
 */
public class Fallauswahl {
    public static void main(String[] args) {
        /*
            Beispiel -1
         */
        int x = 2;
        switch (x){
            case 5:
                System.out.println("fünf");
                break;
            case 3:
            case 8:
                System.out.println("drei und acht");
                break;
            case 4711:
                System.out.println("siebenpfiesichert");
                break;
            case 2:
                System.out.println("zwei");
                break;
            default:
                System.out.println("unbekannte Zahl");
                break;
        }

        /*
            Beispiel -2
         */
        String name = "Hilde";

        switch (name) {
            case "Erwin":
                System.out.println();
                break;
            case "Hilde":
                System.out.println();
                break;
            case "Karl-Heinz":
                System.out.println();
                break;
        }

         /*
            Beispiel: Noten
         */
        int note = 1;
        String text = "";
        switch (note) {
            case 1:
                text = "sehr gut";
                break;
            case 2:
                text = "gut";
                break;
            case 3:
                text = "befriedigend";
                break;
            case 4:
                text = "ausreichend";
                break;
            case 5:
                text = "mangelhaft";
                break;
            case 6:
                text = "ungenügend";
                break;
            default:
                text = "FEHLER";
        }
        System.out.println(note + " entspricht " + text);



    }
}
