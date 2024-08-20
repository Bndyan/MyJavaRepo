package konsole;
/***
 * Versandkostenberechnung
 *
 * Der Paketdienst „FixWech“ berechnet für den Versand von Paketen folgende Gebühren:
 *      Gewicht             Preis
 *      bis 5 kg             7,00 EUR
 *      über 5 bis 10 kg    10,50 EUR
 *      über 10 bis 20 kg   14,00 EUR
 *
 * Pakete mit einem Gewicht über 20 Kilogramm können nicht versendet werden!
 * Aufgabe:
 * Schreiben Sie ein Programm, welches anhand eines gegebenen Gewichts den Preis berechnet.
 * Sollte das Gewicht außerhalb des gültigen Bereichs liegen, soll eine entsprechende
 * Fehlermeldung ausgegeben werden.
 *

 */

import java.util.Scanner;

public class VersandKostenBerechnung {
    public static void main(String[] args) {

        //  Alternativ 1 von mir
        double gewicht = 0.0;

        if(gewicht > 0 && gewicht <= 5) {
            System.out.println("Bis 5 kg versand kosten : 7,00 Euro" );

        }if(gewicht > 5 && gewicht <= 10){
            System.out.println("Über 5 bis 10 kg versand kosten : 10,50 Euro" );
        }
        if(gewicht > 10 && gewicht <= 20) {
            System.out.println("Über 10 bis 20 kg versand kosten : 14,00 Euro");
        }
        if(gewicht <= 0 || gewicht > 20){
            System.out.println("ungültiges Gewicht!");
        }
        else {
            System.out.println("Pakete mit einem Gewicht über 20 Kilogramm können nicht versandet werden!");
        }

        //  Alternativ 2 von mir

        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie die Paket gewicht : ");
        double weightKg = scan.nextDouble();
        double price = 0.0;

        if(weightKg <= 20.0 ) {
            if(weightKg > 1 && weightKg <= 5){
                price = 7.00;
            }if(weightKg >= 5 && weightKg <= 10){
                price = 10.50;
            }if(weightKg > 10 && weightKg <= 20){
                price = 14.00;
            }System.out.println( "Versand " + weightKg + " kg kostet " + price + " EUR");
        } else {
            if(weightKg == 0.0){
                price = 0.0;
                System.out.println("Bitte überprüfen die Gewichte");
            }else
                System.err.println("Pakete mit einem Gewicht über 20 Kilogramm können nicht versandet werden!"); // ba range sor l konsolakaman neshanman dadat
        }



        // Alternativ 3 von Thomas

         /*
            Lösung 1
         */
        double gewichtInKg = 0.0;

        if (gewichtInKg > 0 && gewichtInKg <= 5) {
            System.out.println("Preis = 7,00 Euro");
        }
        if (gewichtInKg > 5 && gewichtInKg <= 10) {
            System.out.println("Preis = 10,50 Euro");
        }
        if (gewichtInKg > 10 && gewichtInKg <= 20) {
            System.out.println("Preis = 14,00 Euro");
        }
        if (gewichtInKg <= 0 || gewichtInKg > 20) {
            System.out.println("ungültiges Gewicht!");
        }

       /*
            Lösung 2
         */
        if (gewichtInKg > 0 && gewichtInKg <= 5) {
            System.out.println("Preis = 7,00 Euro");
        }
        else {
            if (gewichtInKg > 5 && gewichtInKg <= 10) {
                System.out.println("Preis = 10,50 Euro");
            }
            else {
                if (gewichtInKg > 10 && gewichtInKg <= 20) {
                    System.out.println("Preis = 14,00 Euro");
                }
                else {
                    if (gewichtInKg <= 0 || gewichtInKg > 20) {
                        System.out.println("ungültiges Gewicht!");
                    }
                }
            }
        }
        /*
            Lösung 3
         */
        if (gewichtInKg > 0 && gewichtInKg <= 20) {
            if (gewichtInKg > 0 && gewichtInKg <= 5) {
                System.out.println("Preis = 7,00 Euro");
            }
            else {
                if (gewichtInKg > 5 && gewichtInKg <= 10) {
                    System.out.println("Preis = 10,50 Euro");
                }
                else {
                    if (gewichtInKg > 10 && gewichtInKg <= 20) {
                        System.out.println("Preis = 14,00 Euro");
                    }
                }
            }
        }
        else {
            System.err.println("ungültiges Gewicht!");
        }
        /*
            Lösung 4
         */
        if (gewichtInKg > 0 && gewichtInKg <= 20) {
            double preis = 0.0;
            if (gewichtInKg > 0 && gewichtInKg <= 5) {
                preis = 7.0;
            }
            else {
                if (gewichtInKg > 5 && gewichtInKg <= 10) {
                    preis = 10.5;
                }
                else {
                    if (gewichtInKg > 10 && gewichtInKg <= 20) {
                        preis = 14.0;
                    }
                }
            }
            System.out.printf("Preis = %.2f Euro", preis);
        }
        else {
            System.err.println("ungültiges Gewicht!");
        }

        /*
            Lösung 5
         */
        if (gewichtInKg > 0 && gewichtInKg <= 20) {
            double preis = 0.0;
            if (gewichtInKg <= 5) {
                preis = 7.0;
            }
            else {
                if (gewichtInKg <= 10) {
                    preis = 10.5;
                }
                else {
                    preis = 14.0;
                }
            }
            System.out.printf("Preis: %.2f Euro", preis);
        }
        else {
            System.err.println("ungültiges Gewicht!");
        }

        /*
            Lösung 5b
         */
        if (gewichtInKg <= 0 || gewichtInKg > 20) {
            System.err.println("ungültiges Gewicht!");
        }
        else {
            double preis = 0.0;
            if (gewichtInKg <= 5) {
                preis = 7.0;
            }
            else {
                if (gewichtInKg <= 10) {
                    preis = 10.5;
                }
                else {
                    preis = 14.0;
                }
            }
            System.out.printf("Preis: %.2f Euro", preis);
        }

       /*
            Lösung 6
         */
        if (gewichtInKg > 0 && gewichtInKg <= 20) {
            double preis = 0.0;
            if (gewichtInKg <= 5) {
                preis = 7.0;
            }
            else {
                if (gewichtInKg <= 10) {
                    preis = 10.5;
                }
                else {
                    preis = 14.0;
                }
            }
            System.out.printf("Preis: %.2f Euro", preis);
        }
        else {
            System.err.println("ungültiges Gewicht!");
        }

          /*
            Lösung 6b
         */
        if (gewichtInKg > 0 && gewichtInKg <= 20) {
            double preis = 7.0;
            if (gewichtInKg > 5.0 && gewichtInKg <= 10) {
                preis = 10.5;
            }
            else {
                if (gewichtInKg > 10.0) {
                    preis = 14.0;
                }
            }
            System.out.printf("Preis: %.2f Euro", preis);
        }
        else {
            System.err.println("ungültiges Gewicht!");
        }

         /*
            Lösung 7
         */
        if (gewichtInKg <= 0 || gewichtInKg > 20) {
            System.err.println("ungültiges Gewicht!");
        }
        else {
            double preis = 0.0;
            if (gewichtInKg <= 5) {
                preis = 7.0;
            }
            else {
                if (gewichtInKg <= 10) {
                    preis = 10.5;
                }
                else {
                    preis = 14.0;
                }
            }
            double preise = gewichtInKg <= 5 ? 7.0 : gewichtInKg <= 10 ? 10.5 : 14.0;
            System.out.printf("Preis: %.2f Eurooooooooo", preise);
        }





    }
}
