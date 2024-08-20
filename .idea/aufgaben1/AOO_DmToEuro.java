package aufgaben;

/**
 *
 * Erstelle eine Konsolenanwendung mit Java,
 * welche einen gegebenen Betrag in DM in Euro
 * umrechnet und ausgibt.
 */

public class AOO_DmToEuro {
    public static void main(String[] args) {
        /*
            Variante 1
         */

        // Eingabe
       /*
        double betragInDM = 100.0;


        // Verarbeitung
        double umrechnungInEuro = 1.95583;
        double ergebnisInEuro = betragInDM / umrechnungInEuro;
        System.out.println(ergebnisInEuro); //=> 51.12918811962185

         */
        /*
            Variante 2
         */


        double betragInDM = 100.0;

        final double WECHSELKURS_DM_EURO = 1.95583;

        double ergebnisInEuro = betragInDM / WECHSELKURS_DM_EURO;
        System.out.println(ergebnisInEuro); //=> 51.12918811962185

        /*
            Variante 3 (Bad Edition)
         */

        System.out.println(100.0/1.95583); //=> 51.12918811962185
        System.out.println(100/1.95583); //=> 51.12918811962185














    }
}
