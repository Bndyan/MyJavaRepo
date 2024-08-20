package aufgaben;

/**
 * Die Klasse A16_JedenZweiten
 *
 * Jeden Zweiten
 *
 *       Geben sei eine Variable, welche einen beliebigen String enthält.
 *
 *       Zum Beispiel:
 *       String s = "mgajyk rtth eu isoopu racyev nbzet twqi tfhc eyaowue";
 *
 *       Es ist ein Programm zu schreiben welches jedes zweite Zeichen,
 *       beginnend mit dem Ersten, ausgibt.
 *
 * @author k.bndyan
 * @version 1.0
 * @date 16.08.2024
 */
public class A16_JedenZweiten {
    public static void main(String[] args) {

        String s = "mgajyk rtth eu isoopu racyev nbzet twqi tfhc eyaowue";
        for (int i = 0; i < s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
    }

}
