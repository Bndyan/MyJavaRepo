package konsole;

/**
 * Die Klasse ScleifenAufgabeMatrix
 *
 * 	        1	2	3	4	5	6	7	8	9	10
 *      1	1	2	3	4	5	6	7	8	9	10
 *      2	2	4	6	8	10	12	14	16	18	20
 *      3	3	6	9	12	15	18	21	24	27	30
 *      4	4	8	12	16	20	24	28	32	36	40
 *      5	5	10	15	20	25	30	35	40	45	50
 *      6	6	12	18	24	30	36	42	48	54	60
 *      7	7	14	21	28	35	42	49	56	63	70
 *      8	8	16	24	32	40	48	56	64	72	80
 *      9	9	18	27	36	45	54	63	72	81	90
 *      10	10	20	30	40	50	60	70	80	90	100
 *
 * @author k.bndyan
 * @version 1.0
 * @date 13.08.2024
 */

public class ScleifenAufgabeMatrix {
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        int x = 1;
        while (x <= 10){
            System.out.print(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "\t\t" + x   );
            x = x + 1;
        }
        System.out.println( "\n" );
        int y = 1;
        while (y <= 10){

            System.out.print( ANSI_GREEN_BACKGROUND  + ANSI_BLACK + y  );
            x = 1;

            while (x <= 10){

                System.out.print("\t" + ANSI_BLACK_BACKGROUND + ANSI_RED + "\t"+ y * x );
                x = x +1;

            }
            System.out.println( );
            y = y +1;

        }

        System.out.println("\n========================================================================================\n");

        int x1 = 1;
        char zeichen = '*';
        while (x1 <= 10){
            System.out.print(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "\t\t" + zeichen   );
            x1 = x1 + 1;
        }
        System.out.println( "\n" );
        int y1 = 1;
        while (y1 <= 10){

            System.out.print( ANSI_GREEN_BACKGROUND  + ANSI_BLACK + zeichen  );
            x1 = 1;

            while (x1 <= 10){

                System.out.print("\t" + ANSI_BLACK_BACKGROUND + ANSI_RED + "\t"+ "#" );
                x1 = x1 +1;

            }
            System.out.println( );
            y1 = y1 +1;

        }


    }//ANSI_GREEN_BACKGROUND   + ANSI_BLACK  +

}
