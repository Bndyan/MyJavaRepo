package sprachkern;

/**
 * Mathe- die Klasse Math
 *
 */
public class Mathe {
    public static void main(String[] args) {
        // Beispiel Wurzel = Math.sqrt();
        double x = 144.0;
        double wurzel =Math.sqrt(x);
        System.out.println(wurzel); // 12.0

        int b = 16; //  4 * 4 = 16
        double wur = Math.sqrt(b);
        System.out.println("Rage duja :" + wur); // 4.0

        double wurzell = Math.sqrt(36);
        System.out.println("Squer rot : " + wurzell); // 6.0 => 6 * 6 = 36

        // Beispiel Konstanten = Math.PI
        System.out.println(Math.PI); // 3.141592653589793



        x = Math.random(); // 0....0.9999999
        System.out.println(" Random X :"+ x); // 0.8184578201964046

        // Beispiel: Würfel

        //int wuerfel = (int)Math.random() * 6 + 1; // immer 1 output Fehler
        int wuerfel = (int)(Math.random() * 6.0) + 1; // balam lerada har jarek run dakaenawa zmarayake lewaz wardagen le newan 1 bo 6
        System.out.println(wuerfel);

    }
}
