package sprachkern;

/**
 * Die Klasse Wrapperklassen
 * Wrapperklassen
 * Eine Wrapperklassen repräsentiert einen primitiven Datentyp als Objekt.
 *
 * @author k.bndyan
 * @version 1.0
 * @date 19.08.2024
 */
public class Wrapperklassen {
    public static void main(String[] args) {

        int primitiv = 123;
        Integer objekt; // Objektreferenztyp
        /*
            Explizite Typenkonvertierung
         */
        // String -> int
        String s = "4711"; // Objektreferenztyp
       // int x (int)s;
        int x = Integer.parseInt(s);
        System.out.println(x);

        // String -> double
        s = "12345.456789";
        double d = Double.parseDouble(s);
        System.out.println(s);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE + " Bit");
        System.out.println(Integer.BYTES + " Bytes");
//
//        s = "12.58f";
//        float dd = Float.parseFloat(s);
//        System.out.println(s);

        //int -> String
        x = 255;
        s = "abs" + x; //
        s = String.format("%d" , x);
        System.out.println(Integer.toString(x));
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toBinaryString(x));

        //String -> boolean
        s = "true";
        boolean b = Boolean.parseBoolean(s);

        /*
            Character
         */
        char c ='A'; // \n , \t
        //Character.isDigit(c);
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isWhitespace(c));
        System.out.println(Character.isLetter(c));

        c = '5'; // nrxe 5 la hexadeizimal ist 53
//        x = 10 * c; // 10 * 53 = 530
        x = 10 * Character.getNumericValue(c); // 50
        System.out.println(x);



    }
}
