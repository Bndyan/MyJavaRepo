package aufgaben;

/**
 * 1-Rechteck
 * 2-Rechteck
 * 3-Kraftstoffverbrauch
 */
public class Sequenzen {
    public static void main(String[] args) {

        /*
            Erste Aufgabe 1-Sekunden

            Schreibe ein Programm, welches eine beliebige Anzahl von Sekunden in
            Minuten umrechnet und ausgibt.

            Beispielrechnung:
            210 Sekunden entsprechen 3,5 Minuten.

         */
        //1-1
        double SEKUNDEN = 210.0;
        double eineSekunden = 60.0;

        final double ergebnisSekunden = SEKUNDEN / eineSekunden;
        System.out.println("210 Sekunden ist: " + ergebnisSekunden + " Minuten");

        //1-2
        double sekunden = 210.0;
        double minuten = sekunden / 60.0;

        System.out.println(sekunden + " Sekunden entsprechen " + minuten + " Minuten");


        /*
            Zweite Aufgabe 2-Rechteck
            Schreibe ein Programm welches anhand der Seitenlängen a und b den
            Umfang und die Fläche eines Rechtecks berechnet und ausgibt.

            Beispielrechnung:
            Bei den Seitenlängen a=3 und b=4 ergibt sich ein
            Umfang von 14 und eine Fläche von 12.

         */
        //2-1
        int a = 3;
        int b = 4;
        int seitenUmfang = ((2 * a ) + ( 2 * a ));
        int seitenFlache= (( a * b ) + 2 );


        System.out.println("Fläche ist: " + seitenUmfang);
        System.out.println("Umfang ist: " + seitenFlache);

        //2-2
        double sideA = 3.0;
        double sideB = 4.0;
        double perimeter = 0.0;
        double area = 0.0;

        System.out.println("Rechteck mit den Seitenlängen " + sideA + " & " + sideB);
        // Umfang
        perimeter = (sideA + sideB) * 2;
        System.out.println("Umfang beträgt: " + perimeter);
        // Fläche
        area = sideA * sideB;
        System.out.println("Fläche beträgt: " + area);

        /*
            Dritte Aufgabe 3-Kraftstoffverbrauch
            Erstelle ein Programm welches anhand der gefahrenen Kilometer und
            des dafür verbrauchten Kraftstoffs, den durchschnittlichen Verbrauch
            pro 100 km berechnet und ausgibt.

            Beispielrechnung:
            Wenn für 528 km insgesamt 36,74 Liter Kraftstoff verbraucht wurden,
            dann ergibt sich daraus ein durchschnittlicher Verbrauch von 6.958333333333333 L/100km.

         */
        //3-1
        double proKilometer = 100.0;
        double kilometer = 528;
        final double kraftStoff = 36.74;


        final double VERBRAUCHTEN = (kraftStoff / kilometer * proKilometer );
        System.out.println("Verbrauch von "+ VERBRAUCHTEN + "L\\100km.");

        //3-2
        double distanceKilometre = 528.0;
        double fuelConsumptionLitre = 36.74;
        double averageConsumption;

        averageConsumption = fuelConsumptionLitre * 100.0 / distanceKilometre;
        System.out.printf(averageConsumption + " L/100km");


    }

    /**
     * Die Klasse SchaltJahr
     *      Schaltjahr oder nicht?
     *
     *      Im Gregorianischen Kalender (ab dem 15. Oktober 1582) ist die Definition folgendermaßen:
     *
     *      1. Glatt durch 4 teilbare Jahre sind Schaltjahre,
     *      außer sie sind auch glatt durch 100 teilbar, dann sind sie keine Schaltjahre.
     *
     *      2. Glatt durch 400 teilbare Jahre sind immer Schaltjahre.
     *
     *      Schaltjahre sind z.B. 1992, 1996, 2000, 2004, 2008, ...
     *      Keine Schaltjahre sind z.B. 1700, 1800, 2006, 2100, ...
     *

     * @author k.bndyan
     * @version 1.0
     * @date 14.08.2024
     */

    public static class SchaltJahr {
        public static void main(String[] args) {

            int jahr = 1800;

            /*
                Lösung 1
             */

    //        if(jahr > 1582){
    //            if (jahr % 4 == 0){
    //                if(jahr % 100 != 0){
    //                    System.out.println( jahr + " Jahre Schaltjahre.");
    //                }
    //                else {
    //                    if (jahr % 400 == 0){
    //                        System.out.println(jahr + " Jahre kein Schaltjahre!");
    //                    }
    //                    else {
    //                        System.out.println(jahr + " kein Schaltjahr!");
    //                    }
    //                }
    //
    //            }
    //            else {
    //                System.out.println(jahr + " kein Schaltjahr!");
    //            }
    //
    //
    //        }
    //        else {
    //            System.out.println("Erst nach 1982!");
    //        }

                /*
                Lösung 2 - Boolsche Ausdrücke zusammengefasst
             */

    //        if(jahr > 1582 ){
    //
    //            if(jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0){
    //                System.out.println("Die Jahre ist Schaltjahr" );
    //            }else {
    //                System.out.println("Die Jahre sind kein Schaltjahre " );
    //            }
    //        }else{
    //
    //            System.err.println("Erst nach 1582!");
    //        }

            /*
                Lösung 3 - zus. Variable für die Ausgabe
             */
            String ausgabe;
            if (jahr > 1582) {
                if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
                    ausgabe = "Schaltjahr!";
                }
                else {
                    ausgabe = "kein Schaltjahr!";
                }
            }
            else {
                ausgabe = "Erst nach 1582!";
            }
            System.out.println(ausgabe);

            /*
                Lösung 4 - Auslagern der Bedingungen/Regeln
             */
    //        final int MINIMALES_JAHR = 1582;
    //        String ausgabe;
    //        boolean regel1 = jahr % 4 == 0 && jahr % 100 != 0;
    //        boolean regel2 = jahr % 400 == 0;
    //
    //        if (jahr > MINIMALES_JAHR) {
    //            if (regel1 || regel2) {
    //                ausgabe = "Schaltjahr!";
    //            }
    //            else {
    //                ausgabe = "kein Schaltjahr!";
    //            }
    //        }
    //        else {
    //            ausgabe = "Erst nach 1582!";
    //        }
    //        System.out.println(ausgabe);

            /*
                Lösung 5 - zusätzliche boolsche Variable istSchaltjahr
             */
    //        final int MINIMALES_JAHR = 1582;
    //        boolean istSchaltjahr;
    //        boolean regel1 = jahr % 4 == 0 && jahr % 100 != 0;
    //        boolean regel2 = jahr % 400 == 0;
    //
    //        if (jahr > MINIMALES_JAHR) {
    //            if (regel1 || regel2) {
    //                istSchaltjahr = true;
    //            }
    //            else {
    //                istSchaltjahr = false;
    //            }
    //
    //            if(istSchaltjahr) {
    //                System.out.println("Ist ein Schaltjahr!");
    //            }
    //            else{
    //                System.out.println("Ist KEIN Schaltjahr!");
    //            }
    //        }
    //        else {
    //            System.err.println("Erst nach 1582!");
    //        }

            /*
                Lösung 6 - if-Anweisung in boolschen Ausdruck umgewandelt
             */
    //        final int MINIMALES_JAHR = 1582;
    //        boolean istSchaltjahr;
    //        boolean regel1 = jahr % 4 == 0 && jahr % 100 != 0;
    //        boolean regel2 = jahr % 400 == 0;
    //
    //        if (jahr > MINIMALES_JAHR) {
    //            istSchaltjahr = regel1 || regel2;
    //
    //            if (istSchaltjahr) {
    //                System.out.println("Ist ein Schaltjahr!");
    //            }
    //            else {
    //                System.out.println("Ist KEIN Schaltjahr!");
    //            }
    //        }
    //        else {
    //            System.err.println("Erst nach 1582!");
    //        }

        }
    }
}
