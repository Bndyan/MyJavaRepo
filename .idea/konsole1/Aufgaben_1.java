package konsole;

import java.util.Scanner;

public class Aufgaben_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //2-Aufgabe mit Scanner
        System.out.println("Auflösung (DPI): ");
        double dpi= scan.nextDouble();

        System.out.println("Farbtiefe (Bit) : ");
        double bitProKanal = scan.nextDouble();

        double seitenBreiteCM = 21.0;
        double seitenHoheCM = 29.7;
        int anzahalSeiten = 100;

        double pixelBreite = seitenBreiteCM / 2.54 * dpi;
        double pixelHohe = seitenHoheCM / 2.54 * dpi;

        long pixelProSeite = (long) (pixelBreite * pixelHohe);
        double speicherProSeite = pixelProSeite * (bitProKanal * 3 / 8 ) ;

        double gesamtSpeicherMB = (speicherProSeite * anzahalSeiten / 1024.0) / 3 ;
        double  gesamtSpeicherGB = gesamtSpeicherMB / 1024.0 / 1024.0 ;
        System.out.printf("Speicherbedarf : %.0f MB = %.2f GB\n",gesamtSpeicherMB ,gesamtSpeicherGB);


        /*

        // 3-Aufgabe mit Scanner
        System.out.println("Geben Sie den durchmesser das Tank in Metern ein: ");
        double durchMessere = scan.nextDouble();

        System.out.println("Geben Sie die Füllhöhe in Metten ein: ");
        double fullHohe = scan.nextDouble();

        double dichtOil= 0.91;

        double volumnLiter = Math.PI * Math.pow(durchMessere / 2 ,2) * fullHohe * 1000;
        double messeKG =volumnLiter  * dichtOil;


        System.out.printf( "Volumen: %.3f Liter%n Masse: %.3f kg%n " , volumnLiter , messeKG );
        */

    }
}
