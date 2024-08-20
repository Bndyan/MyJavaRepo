package konsole;

/**
 * Die Klasse Zhalensyteme
 *
 * @author k.bndyan
 * @version 1.0
 * @date 19.08.2024
 */
public class Zhalensyteme {
    public static void main(String[] args) {

        int zhal = 211;
        String binary ="";

        while (zhal > 0){
            int ergebnis = zhal % 2;
            binary = ergebnis + binary;
            zhal = zhal / 2;
        }
        System.out.println("Dezimal 211 = " + binary);



        String zhal1 = "11010011";
        int dezimal= 0;
        for (int i = 0; i < zhal1.length(); i++){
            int bit = Character.getNumericValue(zhal1.charAt(i));
            dezimal = dezimal * 2 + bit;
        }
        System.out.println("Binär : " + zhal1);
        System.out.println("Dezimal : " + dezimal);




    }
}
