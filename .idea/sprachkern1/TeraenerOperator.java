package sprachkern;

/**
 *   Ternärer Operator / Konditionaloperator / Bedingungsoperator
 *
 *   "bedingte Zuweisung"
 *   "entweder oder"
 *   "Fragezeichenoperator"
 *
 *   siehe auch wenn-Funktion (Excel)
 */
public class TeraenerOperator {
    public static void main(String[] args) {

        /*

        Beispiel mit if

        */
        int gewicht = 8;
        double preis;
        if(gewicht <= 10){
            preis = 5.0;
        }else {
            preis =15.0;
        }

        /*
            Beispiel mit ternärem Operator ?:
            Syntax :
                = bedingung ? wertWahr : wertUnwahr
         */

        preis = gewicht <= 10 ? 5.0 : 15.0;
        preis = (gewicht <= 10) ? 5.0 : 15.0;

        preis = 10 * (gewicht <= 10 ? 5.0 : 15.0) + 100.0;

        System.out.println(preis);
        int wight =101;
        double preic = 0.0;
        preic = wight <= 10 ? 5.0 : 15.0 ;
        System.out.println(preic);








    }
}
