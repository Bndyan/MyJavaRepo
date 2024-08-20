package konsole;

/**
 * Die Klasse SchlifenAufgaben_2
 *
 * @author k.bndyan
 * @version 1.0
 * @date 13.08.2024
 */
public class SchlifenAufgaben_2 {
    public static void main(String[] args) {

        System.out.print("\n\n");

//        1 Aufgabe 1 Alternative
//        1 X 5 = 5
//        2 X 5 = 10
//        3 X 5 = 15
//        4 X 5 = 20
//        5 X 5 = 25
//        6 X 5 = 30
//        7 X 5 = 35
//        8 X 5 = 40
//        9 X 5 = 45
//        10 X 5 = 50

        int y = 1;
        int x = 5;

        while (y <= 10){

            System.out.println("\t" + y + " X " + x + " = " + (y * 5 ));
            y++;
        }

        System.out.println("\n\t============= \n");

//        1 Aufgabe 2- Alternativ
//        1 X 5  = 5
//        2 X 5  = 10
//        3 X 5  = 15
//        4 X 5  = 20
//        5 X 5  = 25
//        6 X 5  = 30
//        7 X 5  = 35
//        8 X 5  = 40
//        9 X 5  = 45
//        10 X 5  = 50

        int i = 1;
        int ergebnis = 0;

        while (i <= 10){
            ergebnis = i * 5;

            System.out.println("\t" + i + " X 5  = " + ergebnis);
            i = i + 1;
        }



        System.out.println("\n\t============= \n");


        int result = 0;
        int a = 1;

        while (a <= 10){
            int b = 1;

            while (b <= 10){

                result = b * a;

                System.out.println("\t" + b + " X " + a + " = " + result);
                b = b + 1;
            }
            a = a + 1;

        }
    }
}
