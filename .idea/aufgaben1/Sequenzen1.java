package aufgaben;
/**
 * Übungsaufgaben - Sequenzen (3)
 *
 * Speicherbedarf 1 (Fachinformatiker Zwischenprüfung Frühjahr 2007 - Aufgabe 2.2)
 *
 * Ein Monitor soll mit High Color (16 Bit pro Pixel) und einer Auflösung
 * von 1280 x 1024 Pixel betrieben werden.
 * Berechnen Sie den mindestens benötigten Grafikspeicher in MegaByte!
 * (1 Megabyte = 1024 KiloByte, 1 KiloByte = 1024 Byte)
 *
 * Ergebnis: 2,5 MB
 *
 */

public class Sequenzen1 {
    public static void main(String[] args) {

        // 1.1_ Alternativ
        double hohe = 1280;
        double breit = 1024;
        double pixel = 16.0 / 8.0;

        double proPixel = hohe * breit;
        double Auflosung = proPixel * pixel /1024 /1024;

        System.out.println( "Grafikspeicher = "+Auflosung+" MB" );

        // 1.2_ Alternativ
        final int FAKTOR_EINHEIT = 1024;

        int aufloesungX = 1280;
        int aufloesungY = 1024;
        int farbtiefe = 16;
        int bytesProPixell = farbtiefe / 8;
        int pixelGesamt = aufloesungX * aufloesungY;
        double bytesGesamt = pixelGesamt * bytesProPixell;

        double mebibyte = bytesGesamt / FAKTOR_EINHEIT / FAKTOR_EINHEIT;

        System.out.printf("%.2f MiB\n", mebibyte); // = 2.5 MiB

        //============================================================

        // 2.
        /**
         * Übungsaufgaben - Sequenzen (3)
         *
         * Speicherbedarf 2 (Fachinformatiker Abschlussprüfung 2006/07 Winter (GA2, HS3 ac))
         *
         * Ermitteln Sie den Speicherplatzbedarf für 100 DIN-A4-Seiten anhand folgender Vorgaben:
         *      - Scanner Auflösung: 600 dpi x 600 dpi
         *      - Farbtiefe: 16 Bit
         *      - Fläche DIN-A4-Seite: 21 cm x 29,7 cm
         *      - 1 inch = 25,4 mm
         *
         * Ergebnis: 6638 MiB = 6,48 GiB
         *
         */

        //2-1-Alternativ
        double dpi = 600;
        double bitProKanal = 16.0;
        double seitenBreiteCm = 21.0;
        double seitenHoeheCm = 29.7;
        int anzahlSeiten = 100;
        double cmProInch = 2.54;

        double seitenBreiteInch = seitenBreiteCm / cmProInch;
        double seitenHoeheInch = seitenHoeheCm / cmProInch;

        int pixelBreite = (int) (seitenBreiteInch * dpi);
        int pixelHoehe = (int) (seitenHoeheInch * dpi);

        long pixelProSeite = (long) pixelBreite * pixelHoehe;
        int bytesProPixel = (int) (bitProKanal * 3 / 8);
        long speicherProSeiteBytes = pixelProSeite * bytesProPixel;
        long gesamtSpeicherbedarfBytes = speicherProSeiteBytes * anzahlSeiten ;
        double gesamtSpeicherbedarfMB = (gesamtSpeicherbedarfBytes / 1024.0) / 1024.0 / 3;
        double gesamtSpeicherbedarfGB = gesamtSpeicherbedarfMB / 1024.0 ;

        System.out.printf("Speicherbedarf: %.0f MB = %.2f GB\n", gesamtSpeicherbedarfMB , gesamtSpeicherbedarfGB );


        //2-2-Alternativ
        final double CM_PER_INCH = 2.54; // cm

        int seitenanzahl = 100;
        int aufloesungXX = 600; // dpi
        int aufloesungYY = 600; // dpi
        int farbtiefee = 16; // Bit
        double breite = 21.0; // cm
        double hoehe = 29.7; // cm
        double speicherbedarf = 0.0;

        double breiteInPunkten = breite * aufloesungXX / CM_PER_INCH;
        double hoeheInPunkten = hoehe * aufloesungYY / CM_PER_INCH;
        double punkteProSeite = breiteInPunkten * hoeheInPunkten;
        int bytesProPunkt = farbtiefee / 8;
        double bytesProSeite = punkteProSeite * bytesProPunkt;
        double gesamtBytes = bytesProSeite * seitenanzahl;
        // Binärpräfixe
        speicherbedarf = gesamtBytes / 1024 / 1024 / 1024; // = 6.48247629498303
        System.out.printf("%.2f GiB\n",speicherbedarf);
        // Dezimalpräfixe
        speicherbedarf = gesamtBytes / 1000 / 1000 / 1000; // = 6.9605059210118405
        System.out.printf("%.2f GB\n",speicherbedarf );



        // 3-

        /**
         /**
         * Übungsaufgabe - Sequenzen (2)
         *
         * Olivenöltank
         *
         * Die griechische Firma „Hellas“ stellt seit mehreren Generationen Olivenöl her.
         * Die Olivenbäume werden nicht bewässert und stehen auf einem extrem kargen Boden:
         * beste Voraussetzungen für ein aromatisches Olivenöl!
         * Die Ernte ist und bleibt reine Handarbeit, um die Oliven nicht unnötig zu verletzen;
         * zudem werden die Oliven noch am Erntetag in einer bio-zertifizierten Mühle extrahiert,
         * als auch in einer bio-zertifizierten Anlage abgefüllt!
         * Das Olivenöl wird in einem Edelstahltank mit luftdichter Abdichtung zwischengelagert.
         * Der Tank hat einen Innendurchmesser von 2,5 m und eine Höhe von 6 m.
         * An diesem Tank befindet sich ein Füllstandsanzeiger, welcher die Füllhöhe in Millimetern anzeigt.
         * Eine Anzeige der Füllmenge in Litern oder Kilogramm existiert nicht.
         *
         * Aufgabenstellung:
         * Erstelle ein Programm welches Anhand der Füllhöhe die Menge des Olivenöls
         * in Litern und in Kilogramm (Dichte Olivenöl: 0,91 g/cm³) berechnet und ausgibt.
         *
         * Beispielrechnung:
         * Bei einer Füllhöhe von 2400 mm enthält der Tank 11.780,963 Liter Olivenöl.
         * Das entspricht 10.720,676 kg Olivenöl.
         *
         * Die Ergebnisse müssen nicht gerundet werden und können von denen der Beispielrechnung geringfügig abweichen.
         *
         *
         */

        //3-1- Alternative
        double durchMesser = 2.5;
        double dichteOel = 0.91;
        double fuellHoehe = 2.4;
        double radius = durchMesser / 2;
        //System.out.println("radius"+ radius); // 1,25
        double volumenKubikmeter = Math.PI * Math.pow(radius, 2) * fuellHoehe; // 3.141592653589793 x (1,25 x 1,25) x 2,4 =
        //System.out.println("Math " + Math.PI); // 3.141592653589793
        //System.out.println("volumenKubikmeter :" + volumenKubikmeter); //11.780972450961725
        double volumenLiter = volumenKubikmeter * 1000;
        double masseKg = volumenLiter * dichteOel;

        // Ausgabe der Ergebnisse
        System.out.printf("Bei einer Füllhöhe von %.3f mm enthält der Tank %.3f Liter Olivenöl.%n",fuellHoehe, volumenLiter);
        System.out.printf("Das entspricht %.3f kg Olivenöl.%n", masseKg);

        //3-2- Alternative
        double DURCH_MESSER = 2.5;
        double DICHT_OIL = 0.91;
        double FULL_HOEHE = 2.4;

        double VOLUMEN_LITER = Math.PI * Math.pow(DURCH_MESSER / 2, 2) * FULL_HOEHE * 1000;
        double MASSE_KG = VOLUMEN_LITER * DICHT_OIL;

        System.out.printf("Das entspricht %.3f kg Olivenöl.%n", MASSE_KG);

        //3- 3 Alternativ
        final double PI = 3.14159;
        double dichte = 0.91; // g/cm³ = kg/L
        double fuellhoeheMillimeter = 2400;
        double fuellhoeheMeter = fuellhoeheMillimeter / 1000.0;
        double durchmesser = 2.5; // m
        double radiuss = durchmesser / 2.0; // m
        double volumenKubikmeterr = 0.0;
        double volumenLiterr = 0.0;
        double gewicht = 0.0; // kg

        volumenKubikmeterr = PI * radiuss * radiuss * fuellhoeheMeter;
        volumenLiterr = volumenKubikmeterr * 1000.0;
        gewicht = volumenLiterr * dichte;

        System.out.println("Volumen: " + volumenLiterr + " Liter");
        System.out.println("Gewicht: " + gewicht + " kg");



    }
}
