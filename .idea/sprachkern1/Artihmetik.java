package sprachkern;
/**
 * Arithmetik
 */
public class Artihmetik {
    public static void main(String[] args) {
        double a;
        double b;

        //Zuweisungsoperator

        b = 3.0;
        a = b = 3.0; // Code Smell!

        /*
            Arithmetische Operatoren + - * /

            Ausdruck ( Expression )
                -Literale
                -Operatoren
         */
        b = 3.0 + 2.0; // 5.0
        a = b / 2.0;  //2.5
        b = a + 0.5 * 2.0; // 3.5  a  = 2.5 und 0.5 * 2.0 = 1.0 + 2.5 = 3.5
        b = (a + 0.5) * 2.0; // 6.0 ama wata yakam jar a + 0.5 bka pashan jarane bka
        b = ((a + 0.5) * (2.0)); // 6.0
        b = a + (0.5 * 2.0); // 3.5 a  = 2.5 und 0.5 * 2.0 = 1.0 + 2.5 = 3.5
        System.out.println(a);
        System.out.println(b);

        /*
            Module % = Rest
            ganzzahlige Restwertdivision
            17 % 5 = 2
            12 % 3 = 0
            7 % 8 = 7
         */

        int k = 7;
        int r = k / 2;
        double m = k / 2;
        double p = k / 2.0;
        System.out.println("R = " + r); // 3
        System.out.println("M = "+ m); // 3.0
        System.out.println("P = " + p); // 3.5


        int x;
        x = 7 % 2; // =1
        x = 8 % 2 ; // = 0
        x = 2 % 8; // = 2

        /*
            Zusammengesetze Operatoren / Verbundoperatoren
         */
        x = 0;
        x += 5; // entspricht x = x + 5;
        x -= 5; // entspricht x = x - 5;
        x *= 5; // entspricht x = x * 5;
        x /= 5; // // entspricht x = x / 5;

        x = 28;
        x %= 5; // entspricht x = x % 5; //-------------- /x ist/ Rest 3
        System.out.println(x);

        /*
            Inkrementoperator /Dekrement
         */
        x = 5;
        //Inkrementoperator , wata ++
        x++; // = 6 // entspricht x = x + 1; oder x += 1;
        // Dekrementoperator, wata --
        x--; // = 4 // entspricht x = x - 1; oder x -= 1;

        int z;
        z = 5;
        int y;
        //y = z++; // 5
        y = ++z; //6
        System.out.println(y);
        System.out.println(z);

        /*
            Innerhalb von Ausdrücken (Code Smell)
                - Post-Inkrement x++
                - Pre-Inkrement ++x
                - Post-Dekrement x--
                - Pre-Dekrement --x
         */
        int w;
        w = 5;
        w = ++w + w++; // 5+1 + 1+5 = 12
        System.out.println(w); // 12

        int dd = 5;
        int f = 6;
        dd = ++dd + f++; // 12
        dd = dd++ + f++; // 11   5 + 6 = 11
        dd = dd++ + ++f; // 12    5 + 6+ 1 = 12
        System.out.println("D : "+ dd); // 12 weil so rechnet dd = 1+5 + 6; = 12




    }
}
