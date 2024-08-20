package konsole;

/**
 * Die Klasse SchleifenAufgaben_1
 *
 * @author k.bndyan
 * @version 1.0
 * @date 13.08.2024
 */
public class SchleifenAufgaben_1 {
    public static void main(String[] args) {

        System.out.println("\n\t");

        //1-  Aufgabe =>  3 7 11 15 19

        int x = 3;
        while (x <= 19){
            System.out.print("\t"+ x );
//          System.out.printf("\t"+ x );
            x = x + 4;
        }

        for (x = 3; x <= 19; x+=4){
            System.out.print(x + "\t");

        }

        System.out.println("\n\t");

        //2-  Aufgabe =>  8 16 32 64 128 256

        int y = 8;
        while (y <= 256){
            System.out.print("\t"+ y );
            y = y * 2;
        }
        System.out.println("\n\t");


        //3-  Aufgabe =>  243 81 27 9 3

        int z = 243;
        while (z >= 3){
            System.out.print("\t"+ z );
            z = z / 3;
        }
        System.out.println("\n\t");



        //4-  Aufgabe =>  3 2 1 0 -1 - 2 -3

        int r = 3;
        while (r >= -3){
            System.out.print("\t"+ r);
            r--;
        }

        System.out.println("\n\t");



        //5-  Aufgabe =>  1 0 1 0 1 0 1

        int f = 1;
        while (f <= 7){

            int unm = f %2 == 1 ? 1 : 0;

                System.out.print("\t"+ unm );
                f++;
        }


    }
}
