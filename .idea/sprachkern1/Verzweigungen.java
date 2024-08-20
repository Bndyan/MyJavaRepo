package sprachkern;
/**
 * Verzweigungen
 *
 * Pseudocode:
 *      WEEN bedingung
 *      DANN anweisung
 *      SONST anweisung
 *
 * Java Syntax:
 *      if(bedingung)
 *          Eine Anweisung oder ein Anweisungsblock{}
 *      [else
 *          Eine Anweisung oder ein Anweisungsblock{}]
 *
 * Wahrheitswerte
 *      true (wahr)
 *      false (unwahr)
 *
 * Vergleichsoperatoren
 *      < kleiner als
 *      <= kleiner oder gleich
 *      > größer als
 *      >= größer oder gleich
 *      == gleich
 *      != nicht gleich
 *
 * Logische Operatoren (Short Circuit)
 *       &&  und (and)
 *           true  = true  && true
 *           false = false && true
 *           false = true  && false
 *           false = false && false
 *
 *       ||  oder (or)
 *           true  = true  || true
 *           true  = false || true
 *           true  = true  || false
 *           false = false || false
 *
 *       !   nicht (not)
 *           false = !true
 *           true  = !false
 *
 *       ^ exklusives oder (xor)
 *          false = true ^ true
 *          true = false ^ true
 *          false = true ^ false
 *          false = false ^ false
 *
 *
 */
public class Verzweigungen {
    public static void main(String[] args) {

        int x = 70;
        if(x > 50) {
            System.out.println("wwwwwwahr");
            System.out.println("=====--------");
        }
        else {
            System.out.println("unwahr");

        }
        System.out.println("danach");


        System.out.println("===================================");
        // Beisiel 1: über -> 50 x > 500
        // Beispiel 2: 50.....100  (y >= 50 && y <= 100)
        // Beispiel 3: .....50   100 ....... (y <= 50 || y >= 100)
        // Beispiel 4:  .....50   100 ....... >= 75 =   (y ==75 || y <= 50 || y >= 100)
        // Beispiel 4:  .....50   100 ....... >= 75 (y == 75 || y <= 50 || y >= 100)  if (y == 75)
        int y = 0;
        if (y == 75 || y <= 50 || y >= 100) {
            System.out.println("wahr++++++");
            if (y == 75){
                System.out.println("=====++++++++");
            }
        }else {
            System.out.println("unwahr");

        }
        System.out.println("danach");

        /*
            Short Circuit Logical Operator
            /  or
         */
        y = 5;
        if (y >= 50 && y <= 100){

        }

        y = 55;
        if (y >= 50 || y <= 100){

        }
        /*
            Open-Circuit ( beide Bedingungen werden ausgewertet)
            & and
            | or
         */
        y = 46;
        if (y >= 50 & y <= 100){
            System.out.println("GGGGGGGGGGGGGGGGGGGGGGGg");
        }

        y = 145;
        if (y >= 50 | y <= 100){
            System.out.println("BBBBBBBBBBBBBBBBB");
        }

    }
}
