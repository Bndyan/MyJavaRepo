package javaprogramm;
/**
 * Variablen und Datentype
 *
 *  Deklaration von Variablen
 *      - Syntax:
 *          Daten bezeichnung
 *          Type Identifier
 *
 *
 *      - Bezeichner (Identifier)
 *
 *      -Konvention
 *          - nur A-Z, a-z, 0-9
 *          - sprechende Namen
 *          - lowerCameCase
 */
public class VariablesAndDateType {

    public static void main(String[] args) {
        // Deklaration (Variablendeklaration)
        //      int a;
        // Deklaration mit Initialisierung
        int a = 42;
        int b ,c = 55, z =66; // Code Smell!
        int f , g; // Code Smell!

        // Zuweisung eines Wertes über den Zuweisungsoperator
        a = 67;

        // Ausgabe des Inhalts der Variable
        System.out.println(a); //42 neues Werte ist 67
        System.out.println(z); // 66
        System.out.println("a"); // = a (Ausgabe der Zeichenkette!)

        //    a = 85;
        //    System.out.println(a); // 85
        // Bezeichner (Identifier)
        int an = 12345; // Code Smell!
        int artikelNummer = 123456;
        int bädeSmäll ; // Code Smell!


        /**********************************************
         Einfache /primitive/elementare Datentype
         ********************************************** */
         /*
        primitive data types:

            byte
            short
            int
            long
            float
            double
            boolean
         */

        /*
            Ganzzahlen (Integer) mit Vorzeichen
            - int ist der Standarddatentyp
         */

        byte beit; // -128 bis 127 (8 Bit)
        short kurz; // -32,768 bis 32,767 (16 Bit)
        int ganz; // -2,147,483,648 bis 2,147,483,647 (32 Bit)
        long lange; // -9,223,372,036,854,775,807 bis 9,223,372,036,854,775,807 (64 Bit)


        // Literale
        ganz = 42;
        ganz = -42;
        ganz = 0421; // 273   0 = Präfix für oktal
        ganz = 0x421; // 1057  0x = Präfix für hexadezimal
        ganz = 0b11111111; //255 0b = Präfix für binär
        ganz = 123456789;
        ganz = 123_456_789_0; //  "kosmetik" ,z.B. als Tausendertrennzeichen

        System.out.println(ganz);

        //lang = 2147483647890L; // L oder l als Suffix für long;

        //  beit = 128;// Das passt nicht ,weil die Zhal größ ist.
        beit = 126;
        beit++;
        beit++;
        System.out.println(beit);

        kurz = 30000; // L oder l als Suffix für long;
        kurz += 500000;
        System.out.println(kurz);

        /*
            Gleit-/Fließkommazahlen
         */
        // einfache Genauigkeit (single-precision, etwa 7 Stellen)
        // +- 4E38, 32 Bit
        float flies;

        // doppelte Genauigkeit (double- precision, etwa 15 Stellen)
        // +-1.7E+308, 64Bit
        double doppelt;

        // Literale
        doppelt = 123.456;
        doppelt = -123.456;
        doppelt = 0;// int-Literale wird automatisch konvertiert!
        doppelt = 0.0;
        doppelt = .0; // Code Smell!
        doppelt = 1e3; // 1x 10^3 = 1000
        doppelt = 1e-3; // 1x 10^3 = 0.001
        doppelt = 12345.67890123456789;//12345.678901234567
        doppelt = 1234567890.12345678901234567890;//1.2345678901234567E9
        System.out.println(doppelt);











    }
}
