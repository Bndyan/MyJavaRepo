package sprachkern;

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
 *          -syntax
 *              -UTF -16
 *              -kann beliebig lang sein
 *              -beginnt mit Buchstabe, $ oder _
 *              -darf nicht mit einer Ziffer beginnen Beispiel 1  2 3 4 ...
 *              -case-sensitiv
 *              -muss eindeutig sein
 *              -kein reserviertes Wort (Keyword)
 *              - und nicht true, false und null
 *
 *                   abstract   continue   for          new         switch
 *                   assert     default    if           package     synchronized
 *                   boolean    do         goto         private     this
 *                   break      double     implements   protected   throw
 *                   byte       else       import       public      throws
 *                   case       enum       instanceof   return      transient
 *                   catch      extends    int          short       try
 *                   char       final      interface    static      void
 *                   class      finally    long         strictfp    volatile
 *                   const      float      native       super       while
 *                   _ (underscore)
 *
 *      -Konvention
 *          - nur A-Z, a-z, 0-9
 *          - sprechende Namen
 *          - lowerCameCase
 */


public class VariablenUndDatenTypen {
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
         ***********************************************/
         /*
        primitive data types:

            byte    8 Bit
            short   16 Bit
            int     32 Bit
            long    64 Bit
            float   32 Bit
            double   64 Bit
            boolean
         */

        /*
            Ganzzahlen (Integer) mit Vorzeichen
            - int ist der Standarddatentyp
         */

        byte beit; // -128 bis 127 (8 Bit) oder (1) Byte
        short kurz; // -32,768 bis 32,767 (16 Bit) oder (2) Byte
        int ganz; // -2,147,483,648 bis 2,147,483,647 (32 Bit) oder (4) Byte
        long lange; // -9,223,372,036,854,775,807 bis 9,223,372,036,854,775,807 (64 Bit) oder (8) Byte


        // Literale
        ganz = 42;
        ganz = -42;
        ganz = 0421; // 273   0 = Präfix für oktal // 0 la peshawa bet outputakaman ba oktal dadate
        ganz = 0x421; // 1057 0x = Präfix für hexadezimal // 0x la peshawa bet aoutputakaman ba hexadezimal dadate
        ganz = 0b11111111; //255 0b = Präfix für binär // 0b la beshawa bet output ba Binäer dadate
        ganz = 123456789;
        ganz = 123_456_789_0; //  "kosmetik, z.B. als Tausendertrennzeichen

        System.out.println(ganz);

        //lang = 2147483647890L; // L oder l als Suffix für long;

    //  beit = 128;// Das passt nicht, weil die Zhal größ ist.
        beit = 126;
        beit++;
        beit++;
        System.out.println(beit);

        long kurzz ;
        kurz = 30000;
        kurz += 5000;

        System.out.println("Kurzz = "+kurz);

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
        doppelt = 1e3; // 1x 10^3 = 1000 = 1 x 10 x 10 x 10 = 1.000
        doppelt = 1e-3; // 1x 10^3 = 0.001
        doppelt = 12345.67890123456789;//12345.678901234567
        doppelt = 1234567890.12345678901234567890;//1.2345678901234567E9
        System.out.println(doppelt);

        //flies = 12.456; // Halaya // Fehler: Required type: float. provided : double
        flies = 12.456F; // F oder f als Suffix für float;


        /*
            Zeichen (Character)
            speichert genau ein Zeichen
            16 Bit, Unicode, UTF-16
         */
        char zeichen;
        zeichen = 'A'; // A =65
        zeichen = 66; //= B
        zeichen = 0x2741; // = ❁ /// agar yak zhmara zyatr bet la dway x nabet error wardagren

        zeichen ='\''; // = ' // maskieren (Escape Sequence)
        zeichen = '\\'; // = \ //  maskieren (Escape Sequence)
        zeichen = '\n'; // Steuerzeichen (Zeilenumbrüche)
        zeichen = '\t'; // Steuerzeichen (Tabulator)
        zeichen = '\u1610'; // = ᘐ

        System.out.println(zeichen);

        /*
            Boolean (Wahrheitswert)
         */
        boolean  bB;
        //Literale
        bB = true;
        bB = false;


        boolean ergebnis1;
        ergebnis1 = true;
        ergebnis1 = 3 > 2 && 8 <= 4;
        System.out.println(ergebnis1);
        if(ergebnis1 || 4 < 10){
            System.out.println("Ergebnis 1 :" + ergebnis1);
        }

        int ergebnis2;
        ergebnis2 = 3 * 2 + 8 / 4;
        System.out.println(ergebnis2);

        /*
            Konstanten
         */

        final double PI = 3.14159;
        //pi = 3.2; nabet, cunka natwanen nrxe bgoren
        final int EINE_KONSTANTE = 5;










    }
}
