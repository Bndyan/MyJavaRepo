package aufgaben;

/**
 * Die Klasse A17_TuerenVonDurin
 *
 *  Türen von Durin
 *
 *           Geben sei eine Variable, welche einen beliebigen String enthält.
 *
 *          Zum Beispiel:
 *                String durin = "sprich freund und tritt ein";
 *
 *           Es ist ein Programm zu schreiben, welches diesen Text in der Konsole ausgibt.
 *           Dabei soll jedes Wort mit einem Großbuchstaben beginnen.
 *
 *           Zum Beispiel:
 *                Sprich Freund Und Tritt Ein
 *
 *           Tipp: 'A' + 32 == 'a'
 *
 * @author k.bndyan
 * @version 1.0
 * @date 16.08.2024
 */
public class A17_TuerenVonDurin {
    public static void main(String[] args) {

                String durin = "sprich freund und tritt ein";

        /*
            Variante 1 (Martin)
         */
                for (int i = 0; i < durin.length(); i++) {
                    char zeichen = durin.charAt(i);
                    if (i == 0) {
                        zeichen = (char) (durin.charAt(i) - 32);
                        System.out.print(zeichen);
                    }
                    else {
                        System.out.print(zeichen);
                    }
                    if (durin.charAt(i) == 32) {
                        i++;
                        zeichen = (char) (durin.charAt(i) - 32);
                        System.out.print(zeichen);
                    }
                }
                System.out.println();

        /*
            Variante 2 (Nico)
         */
                String output = "";
                char upperCase = (char) (durin.charAt(0) - 32);
                output += upperCase;

                for (int i = 1; i < durin.length(); i++) {
                    if (durin.charAt(i) == ' ') {
                        upperCase = (char) (durin.charAt(i + 1) - 32);
//                upperCase = Character.toUpperCase(durin.charAt(i + 1));
                        output += " " + upperCase;
                        i++;
                    }
                    else {
                        output += durin.charAt(i);
                    }
                }
                System.out.println(output);

        /*
            Variante 3 (Mirko)
         */
                String text = "sprich freund und tritt ein";

                int length = text.length();
                String result = "";
                boolean newWord = true;

                for (int i = 0; i < length; i++) {
                    char character = text.charAt(i);
                    if (newWord)
                        result += (char) (character - 32);
                    else
                        result += character;
                    newWord = character == ' ';
                }
                System.out.println(result);

        /*
            Variante 4 (Hendrik)
         */
                //  Eingabe
//        String text = "sprich freund und tritt ein";
                int laenge = text.length();
                String melon = "";
                String c = "";

                //  Verarbeitung
                for (int i = 0; i < laenge; i++) {
                    c = "";
                    if (i == 0 || text.charAt(i) == ' ') {
                        if (i == 0) {
                            c += text.charAt(i);
                            c = c.toUpperCase();
                            melon += c;
                        }
                        else {
                            c += text.charAt(i);
                            i++;
                            c += text.charAt(i);
                            c = c.toUpperCase();
                            melon += c;
                        }
                    }
                    else {
                        melon += text.charAt(i);
                    }
                }
                //  Ausgabe
                System.out.println(melon);
                System.out.println("Melon");
                System.out.println();

        /*
            Variante 5
         */
                for (int i = 0; i < durin.length(); i++) {
                    char zeichen = durin.charAt(i);
                    if ( i == 0 || durin.charAt(i - 1) == ' ') {
                        zeichen -= 32;
                    }
                    System.out.print(zeichen);
                }
                System.out.println();

        /*
            Variante 6 (Herr M. aus B.)
         */
                for (int i = 0; i < text.length(); i++) System.out.print((i == 0 || text.charAt(i - 1) == ' ') ? (char)(text.charAt(i) - 32) : text.charAt(i));




    }
}
