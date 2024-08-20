package sprachkern;

/**
 * Die Klasse SchleifenArten
 *
 * @author k.bndyan
 * @version 1.0
 * @date 15.08.2024
 */
public class SchleifenArten {
    public static void main(String[] args) {
        /*
            while
            - kopfgesteuerte oder abweisende Schleife
            - wird eventuell gar nicht Anweisungsblock
            - eine einzele Anweisung

         */

        int i = 1; // agar am 1 bgoren bo har zhmarayake tr programakaman esh nakat
        while (i <= 5){
            System.out.printf("%d " ,i);
            i++; // agar awa laber bkaen la 5 ranawastet
        }
        System.out.println();


        /*
            do while
            - fußgesteuerte oder annehmende Schleife
            - wird mindestens einmal ausgeführt
            - eine einzelne Anweisung oder ein Anweisungsblock
         */

        int b = 1; // agar am 1 bgoren bo har zhmarayake tr programakaman esh dakat wa printe b dakat ka 6 w enja radawastet
        do{
            System.out.printf("%d " ,b);
            b++;
        }while (b <= 5);

        System.out.println("=========================0");

        /*
            for
            - kopfgesteuerte oder abweisende Schleife
            - wird eventuell gar nicht ausgeführt
            - eine einzelne Anweisung oder ein Anweisungsblock
            Syntax:
                   for(Initialisierung ; Abbruchbedingung ; Veränderung)
         */

        for (int sum = 1; sum <= 5; sum++ ){
            System.out.printf("%d ",sum);
        }
        System.out.println("\n======================");

//      1-  Aufgabe mit for =>  3 7 11 15 19

        for (int x = 3; x <= 19; x+=4){
            System.out.print(x + "\t");

        }
        System.out.println("\n======================");

        int e = 4;
        int f = 0;
        for(e = 1; e <= 5; e++){
            if (e % 3 > 0 ){
                f = f + e;
            }
        }
        System.out.println(f);


        //Thomas
         /*
            while
            - kopfgesteuerte oder abweisende Schleife
            - wird eventuell gar nicht ausgeführt
            - eine einzelne Anweisung oder ein Anweisungsblock
         */
        int a = 1;
        while (a <= 5) {
            System.out.printf("%d ", a);
            a++;
        }
        System.out.println();

        /*
            do while
            - fußgesteuerte oder annehmende Schleife
            - wird mindestens einmal ausgeführt
            - eine einzelne Anweisung oder ein Anweisungsblock
         */
        int bb = 1;
        do {
            System.out.printf("%d ", bb);
            bb++;
        } while (bb <= 5);
        System.out.println();

        /*
            for (Zählschleife)
            - kopfgesteuerte oder abweisende Schleife
            - wird eventuell gar nicht ausgeführt
		    - eine einzelne Anweisung oder ein Anweisungsblock

            Syntax:
                for(Initialisierung ; Abbruchbedingung ; Veränderung )
         */
        // int ii = 1;
        for (int ii = 1; ii <= 5; ii++) {      // while(i <= 5) {
            System.out.printf("%d ", ii);
            //     i++;
        }                                   // }










    }
}
