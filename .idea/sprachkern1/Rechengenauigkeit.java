package sprachkern;

public class Rechengenauigkeit {
    public static void main(String[] args) {
        /*
            float

            Beispiele:
            f1      f2      ergebnisFloat
            0.04    0.03    0.01
            0.05    0.04    0.010000002
            0.06    0.05    0.009999998
         */
        float f1 = 0.06f; // 6 x 10-2
        float f2 = 0.05f;
        float ergebnisFloat = f1 - f2;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(ergebnisFloat); // = 0.009999998

        /*
            double
            Beispiele:

            d1      d2      ergebnisDouble
            0.02    0.01    0.01
            0.03    0.02    0.0
            0.06    0.05    0.009999998

         */

        double d1 = 0.06; // 6 x 10-2
        double d2 = 0.05;
        double ergebnisDouble = d1 - d2;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(ergebnisDouble); // = 0.009999999999999995
        System.out.println(ergebnisDouble);

        // summe
        double summe = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 ;
        System.out.println("summe"+summe);

        // produkt
        double produkt = 0.1 * 10.0;
        System.out.println(produkt+" product");

        // Differenz zwischen Produkt und Summe
        System.out.println("Differenz: " + (produkt - summe));
//        System.out.printf("Differenz: %.20", produkt - summe); hier felt f nach 20
        System.out.printf("Differenz: %.20f", produkt - summe);


    }
}
