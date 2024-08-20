package konsole;
/**
 * Provisionsberechnung
 *
 * Anhand des erzielten Umsatzes einer Handelsvertreterin soll die an sie zu
 * zahlende Provision wie folgt ermittelt werden:
 *
 * Wenn der Umsatz unter 300.000,- Euro liegt, wird eine Provision von 3% gezahlt.
 * Liegt der Umsatz darüber, so wird eine Provision von 6% gezahlt.
 * Ab einem Umsatz von 350.000,- Euro wird eine Provision von 10% gezahlt.
 *
 * Es ist ein Programm zu erstellen, welchen anhand des Umsatzes die zu
 * zahlende Provision in Euro ausgibt.
 *
 *
 */

import java.util.Scanner;

public class Provisionsberechnung {
    public static void main(String[] args) {



//meine Lösung
        Scanner scan = new Scanner(System.in);
        System.out.println("Bite geben Sie den erzielten Umsatz in Euro ein : ");

/*
        double umsatz1 = scan.nextDouble();
        double provision = 0.0 * 100;

        double pro = umsatz1 < 300.000 ? 0.3 : umsatz1 < 350.000 ? 0.6: 0.10;
        System.out.printf("umsatz1 = %,.2f Euro%n", umsatz1);
        System.out.printf("provision = %,.2f Euro%n",pro);
*/
 /*       if (umsatz1 < 300.000) {
            provision = 03;
        }
        if (umsatz1 < 350.000) {
            provision = 06;
        }
        else {
            provision = 10;
            System.out.println("Umsatz von " + umsatz1 + " Euro Provision " + provision+ "%");
        }

*/



/*

//meine Lösung
        double umsatz1 = 350000;
        int provision1 = 00;
        if(umsatz1 < 300000){
             provision1 = 03;

        }else if(umsatz1 < 350000){
            provision1 = 06;

        }
        else {
            provision1 =  10;
            System.out.println("Umsatz von " + umsatz1 + " Euro : " + provision1+"% Provision");
            //System.out.printf("Umsatz von %s Euro: %.2f " , umsatz1 , " Euro : " , provision1,"% Provision");
        }
        */


//meine Lösung
        /*
        double umsatz1 = 300.000;
        if (umsatz1 < 300.000 && umsatz1 >= 350.000) {
        }
        else {
            int provision = 00;
            if (umsatz1 < 300.000) {
                provision = 03;
            }
            else {
                if (umsatz1 < 350.000) {
                    provision = 06;
                }
                else {
                    provision = 10;
                }
            }
            System.out.println("Umsatz von " + umsatz1 + "Euro Provision " + provision+ "%");

        }

        //double pris =;
        double ums =351_000.0;
        double um = 100;
        double um1 = ums < 300_000.0 ? 0.3 * um : ums < 350_000.0 ? 0.6 * um : 0.10 * 100;
        System.out.println(ums + " Ums = "+um1 +"%");
*/

// Thomas Lösung
        /*
            Lösung 1 (Bad Edition)
         */
//        double u=3.245e5,p;
//        if(u>0) {
//            if(u<3e5) p=3; else
//            if(u<35e4) p=6; else p=1e1;
//            System.out.printf("Umsatz: %,.2f Euro%nProvision beträgt %,.2f Euro (%.2f%%)%n", u, u * p / 1e2, p);
//        }
//        else
//            System.out.println("Kein Umsatz! = keine Provision!");

        /*
            Lösung 2
         */
//        double umsatz = 324500.0; // erzielter Umsatz in Euro
//        double provision = 0.0; // zu zahlende Provision in Euro
//
//        if(umsatz > 0.0) {
//            if (umsatz < 300_000.0) {
//                provision = umsatz * 3.0 / 100.0;
//            }
//            else {
//                if (umsatz < 350_000.0) {
//                    provision = umsatz * 6.0 / 100.0;
//                }
//                else {
//                    provision = umsatz * 10.0 / 100.0;
//                }
//            }
//            System.out.printf("Umsatz: %,.2f Euro%n", umsatz);
//            System.out.printf("Provision beträgt %,.2f Euro", provision);
//        }
//        else {
//            System.out.println("Kein Umsatz! = keine Provision!");
//        }

        /*
            Lösung 3
         */
//        double umsatz = 324_500.0; // erzielter Umsatz in Euro
//        double provision = 0.0; // zu zahlende Provision in Euro
//        double provisionInProzent = 0.0;
//
//        if (umsatz > 0.0) {
//            if (umsatz < 300_000.0) {
//                provisionInProzent = 3.0;
//            }
//            else {
//                if (umsatz < 350_000.0) {
//                    provisionInProzent = 6.0;
//                }
//                else {
//                    provisionInProzent = 10.0;
//                }
//            }
//            provision = umsatz * provisionInProzent / 100.0;
//            System.out.printf("Umsatz: %,.2f Euro%n", umsatz);
//            System.out.printf("Provision beträgt %,.2f Euro", provision);
//            System.out.printf(" (%.2f%%)%n", provisionInProzent);
//        }
//        else {
//            System.out.println("Kein Umsatz! = keine Provision!");
//        }

        /*
            Lösung 4
         */
//        double umsatz = 324_500.0; // erzielter Umsatz in Euro
//        double provision = 0.0; // zu zahlende Provision in Euro
//        double provisionInProzent = 0.0;
//        String ausgabe = "";
//
//        if (umsatz > 0.0) {
//            if (umsatz < 300_000.0) {
//                provisionInProzent = 3.0;
//            }
//            else {
//                if (umsatz < 350_000.0) {
//                    provisionInProzent = 6.0;
//                }
//                else {
//                    provisionInProzent = 10.0;
//                }
//            }
//            provision = umsatz * provisionInProzent / 100.0;
//            ausgabe = String.format("Umsatz: %,.2f Euro%n", umsatz);
//            ausgabe += String.format("Provision beträgt %,.2f Euro", provision);
//            ausgabe += String.format(" (%.2f%%)%n", provisionInProzent);
//        }
//        else {
//            ausgabe = "Kein Umsatz! = keine Provision!";
//        }
//
//        System.out.println(ausgabe);

        /*
            Lösung 5 mit ternärem Operator
         */

//        double umsatz = 324_500.0; // erzielter Umsatz in Euro
//        double provision = 0.0; // zu zahlende Provision in Euro
//        double provisionInProzent = 0.0;
//        String ausgabe = "";
//
//        if (umsatz > 0.0) {
//            provisionInProzent = umsatz < 300_000.0 ? 3.0 : umsatz < 350_000.0 ? 6.0 : 10.0;
//            provision = umsatz * provisionInProzent / 100.0;
//            ausgabe = String.format("Umsatz: %,.2f Euro%n", umsatz);
//            ausgabe += String.format("Provision beträgt %,.2f Euro", provision);
//            ausgabe += String.format(" (%.2f%%)%n", provisionInProzent);
//        }
//        else {
//            ausgabe = "Kein Umsatz! = keine Provision!";
//        }
//
//        System.out.println(ausgabe);
        

    }
}
