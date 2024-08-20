package konsole;

/**
 * Die Klasse Anrede
 *
 *   Ermittlung der Anrede
 *
 *   Für einen Serienbrief soll die passende Anrede ermittelt werden.
 *   Gegeben sind dabei folgende Daten:
 *        - Nachname (z.B. Meier)
 *        - Vorname (z.B. Erna)
 *        - Titel (z.B. Dr.)
 *        - Alter in Jahren (z.B. 26)
 *        - Geschlecht (true für weiblich, false für männlich)
 *
 *   Die Anrede ist wie folgt zu ermitteln:
 *        1. Liegt das Alter unter 18 Jahren, dann "Hallo" + Vorname
 *        2. anderenfalls bei Frauen: „Sehr geehrte Frau“ + Nachname
 *        3. und bei Männern: „Sehr geehrter Herr“ + Nachname
 *        4. Falls ein Titel angegeben ist, wird dieser dem Nachnamen vorangestellt.
 *
 *   Beispielausgabe:
 *        Sehr geehrte Frau Dr. Meier
 *
 * @author k.bndyan
 * @version 1.0
 * @date 14.08.2024
 */
public class Anrede {
    public static void main(String[] args) {

        final  int AlterDerMundikeit = 18;
        String nachname = "Meier";
        String vorname = "Erna";
        String title = "Dr. ";
        int alter = 18;
        boolean weiblic = true;
        String anrede = " ";

        if(alter < AlterDerMundikeit){
            anrede = "Hello " + vorname;
        }else {
            anrede = "Sehr geehrte " ;
            if(weiblic){
                anrede += "Frau ";
            }else {
                anrede += "Herr " ;
            }
            if(anrede.equals("")){
                anrede += " " + title;
            }
            anrede += "" + nachname;

        }
        System.out.println(anrede);

    }
}
