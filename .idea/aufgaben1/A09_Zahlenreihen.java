package aufgaben;

/**
 * Die Klasse A09_Zahlenreihen
 *
 * Zahlenreihen
 *
 *   Es ist jeweils ein Programm zu implementieren,
 *   welches die jeweiligen Zahlenreihen mit Hilfe
 *   der while Schleife in der Konsole ausgibt.
 *
 *   1) 3 7 11 15 19
 *   2) 8 16 32 64 128 256
 *   3) 243 81 27 9 3
 *   4) 3 2 1 0 -1 -2 -3
 *
 *   Bonusaufgabe:
 *   5) 1 0 1 0 1 0 1
 *
 * @author k.bndyan
 * @version 1.0
 * @date 15.08.2024
 */
public class A09_Zahlenreihen {
    public static void main(String[] args) {
          /*
            Aufgabe 1:  3 7 11 15 19
         */
        // Variante 1 - while
        int x = 3;
        while (x <= 19) {
            System.out.printf("%d\t", x);
            x += 4;
        }
        System.out.println();

        // Variante 2
        x = 3;
        while (x <= 19) {
            System.out.print(x + "\t");
            x += 4;
        }
        System.out.println();

        /*
            Aufgabe 2: 8 16 32 64 128 256
         */
        int number = 8;
        while (number <= 256) {
            System.out.print(number + " ");
            number *= 2;
        }
        System.out.println();

        /*
            Aufgabe 3: 243 81 27 9 3
         */
        x = 243;
        while (x >= 3) {
            System.out.print(x + " ");
            x /= 3;
        }
        System.out.println();

        /*
            Aufgabe 4: 3 2 1 0 -1 -2 -3
         */
        x = 3;
        while (x >= -3) {
            System.out.printf("%d\t", x);
            x--; // x -= 1 oder x = x - 1
        }
        System.out.println();

       /*
            Aufgabe 5: 1 0 1 0 1 0 1 (Bonusaufgabe)
        */
        // Variante 1
        x = 1;
        while (x < 8) {
            System.out.print(x % 2 + "\t");
            x++;
        }
        System.out.println();

        // Variante 2
        int b = 1;
        int a = 1;
        while (b <= 7) {
            System.out.printf("%d\t", a);
            if (a == 1) {
                --a;
            }
            else {
                ++a;
            }
            ++b;
        }
        System.out.println();

        // Variante 3
        b = 1;
        a = 1;
        while (b <= 7) {
            System.out.printf("%d\t", a);
            a = (a == 1) ? 0 : 1;
            ++b;
        }
        System.out.println();

        // Variante 4
        int i = 1;
        boolean toggle = true;
        while (i <= 7) {
            if (toggle) {
                System.out.printf("1\t");
            }
            else {
                System.out.printf("0\t");
            }
            toggle = !toggle;
            i++;
        }
        System.out.println();

        // Variante 5
        int count = 0;
        int zahl = 1;

        while(count <= 6) {
            System.out.print(zahl + "\t");
            switch(zahl) {
                case 1:
                    zahl--;
                    break;
                case 0:
                    zahl++;
                    break;
            }
            count++;
        }
        System.out.println();

        // Variante 6 (Bad Edition)
        b = 1;
        a = 0;
        while (b++ <= 7) {
            System.out.printf("%d\t", a = (a == 1) ? 0 : 1);
        }
        System.out.println();


    }
}
