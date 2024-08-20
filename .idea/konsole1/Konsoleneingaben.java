package konsole;

import java.util.Scanner;
/**
 * Eingaben über die Konsole mit Hilfe der Klasse Scanner
 *
 * ab Java 5
 *
 * siehe auch Versandkosten
 *
 * @autor Thomas Freese
 * @version 24.08.2021
 */
public class Konsoleneingaben {
    public static void main(String[] args) {

        /*
            Ein neues Scanner-Objekt erzeugen
            (muss man im Detail noch nicht verstehen ...)

            Es muss nur eine Instanz erzeugt werden, die beliebig oft verwendet werden kann.
         */
        Scanner eingabe = new Scanner(System.in);

        /*
            Die tatsächliche Eingabe läuft dann über Methoden des Scanner-Objekts
            Diese beginnen mit "next" und lesen einen bestimmten Datentyp.

            z.B. nextInt() oder nextDouble()
         */

        /*
            Beispiel: Eingabe einer Ganzzahl (int)
         */
        System.out.print("Ganze Zahl? ");
        int zahl = eingabe.nextInt();
        System.out.println(zahl);

        /*
            Beispiel: Eingabe einer Gleitkommazahl (double)
            Komma als Dezimaltrennzeichen!
         */
        System.out.print("Zahl? "); // in:"123.456\n"
        double doppelt = eingabe.nextDouble(); // in:"\n"
        eingabe.nextLine(); // Zeilenumbruch "weglesen"   in:""
        System.out.println(doppelt);

        /*
            Beispiel: Eingabe eines Strings
         */
        System.out.print("Zeichenkette? ");
        String text = eingabe.nextLine();
        System.out.println(text);


    }
}
