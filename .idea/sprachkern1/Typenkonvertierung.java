package sprachkern;

/**
 * Typenkonvertierung
 */
public class Typenkonvertierung {
    public static void main(String[] args) {
        int ganz; // Ganzzahl, 32 Bit
        long lang; // Ganzzahl, 64 Bit

        ganz = 4711;
        lang = 4711; // implizite Typenkonvertierung von int nach long


        // ganz = lang; // Fehler : required type: int Provided: long
        /*
            explizite Typenkonvertierung
            type casting ( cast, ""gecastet" , "casten")
            zwischen allen primitiven Datentypen, außer boolean

            Operator-Syntax:(Typ)
         */
        ganz = (int)lang * 5; // erst casten, dann multiplizieren
        ganz = (int)(lang * 5); // erst casten, dann das Ergebnis casten

        System.out.println(ganz); //23555

        double doppelt = 123.456789;
      //  ganz = doppelt; // Fehler: Required type: int Provide:  double
        ganz = (int)doppelt;
        System.out.println(doppelt); //123.456789

        doppelt = 65.89554566;
        char c = (char) doppelt;
        System.out.println(c); //A
        //System.out.println((char)doppelt); haman shte sarawaya

        doppelt = 3.0;
        short kurz = 2; //
        ganz = (int) (doppelt / kurz);
        System.out.println(ganz); // = 1


    }
}
