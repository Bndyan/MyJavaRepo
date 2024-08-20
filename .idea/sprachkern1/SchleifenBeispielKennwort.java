package sprachkern;

import java.util.Scanner;

/**
 * Die Klasse SchleifenBeispielKennwort
 *
 * @author k.bndyan
 * @version 1.0
 * @date 16.08.2024
 */
public class SchleifenBeispielKennwort {
    public static void main(String[] args) {

        final String KENNWORT = "r2d2";
        final int MAX_VERSUCHE = 3;
        String eingabe= "";
        int versuch = 0;
        boolean kennwortKorrekt = false;

        Scanner scan = new Scanner(System.in);

         do{
             versuch++;
            System.out.print("Kennwort: ");
            eingabe = scan.nextLine();
            kennwortKorrekt = eingabe.equals(KENNWORT);
            if (!kennwortKorrekt){
                System.out.println("Falsch!");
            }
        }while (!kennwortKorrekt && versuch < MAX_VERSUCHE);

        if (kennwortKorrekt){
            System.out.println("Willkommen");
        }else {
            System.out.println("Du kommst nicht vorbei");
        }
    }
}
