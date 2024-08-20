package aufgaben;

/**
 * Die Klasse A15_zwischenraeume
 *
 *
 *
 * Geben sei eine Variable, welche einen beliebigen String enthält.
 *
 * z.B. String txt = "Ein Text ist ein String ist eine Zeichenkette";
 *
 * Es ist ein Programm zu schreiben, welches die in der Zeichenkette
 * enthaltenen Leerzeichen zählt und das Ergebnis ausgibt.
 *
 * Zum Beispiel: Der Text enthält 7 Leerzeichen

 *
 * @author k.bndyan
 * @version 1.0
 * @date 15.08.2024
 */
public class A15_zwischenraeume {

    public static void main(String[] args) {

//      1-Aufgabe

//        String txt = "Ein Text ist ein String ist eine Zeichenkette";
//        int leerZeichenZeahler = 0;
//        for (int i = 0; i < txt.length(); i++) {
//            if(txt.charAt(i) == ' '){
//                leerZeichenZeahler++;
//            }
//        }
//        System.out.println("Der Text enthält " + leerZeichenZeahler + " Leerzeichen");
//
//        //int leerZeichen = 0;
//
//        String txt_1 = "Ein Text ist ein String ist eine Zeichenkette";
//        int leerZeichenZeahler_1 = 0;
//        int pos = 0;
//        while (pos < txt_1.length()){
//            char c1 = txt_1.charAt(pos);
//            pos++;
//            if(c1 == ' '){
//                leerZeichenZeahler_1++;
//            }
//        }
//        System.out.println("Der Text enthält " +leerZeichenZeahler_1 + " Leerzeichen");
//
//


        String txt = "Ein Text ist ein String ist eine Zeichenkette";
        int anzahlLeerzeichen = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == ' ') {
                anzahlLeerzeichen++;
            }
        }
        System.out.printf("Der Text enthält %d Leerzeichen\n", anzahlLeerzeichen);

//        System.out.println("==============================");

////      2-Aufgabe
//        String durin = "sprich freund und tritt ein";
//        String[] erstBustabe = durin.split(" ");
//        for(int ei = 0; ei < erstBustabe.length; ei++){
//            char zeichen = erstBustabe[ei].charAt(0);
//            String zeichen_1 = String.valueOf(zeichen).toUpperCase() ;
//            String sub = erstBustabe[ei].substring(1);
//            System.out.print( zeichen_1 + sub +" " );
//        }
//        System.out.println("\n============");

////      2-Aufgabe
//        String durin = "sprich freund und tritt ein";
//       // String lerze = " ";
//
//
//        for (int i = 0 ; i < durin.length(); i++){
//
//            char zeichen = durin.charAt(i);
//
//            if( i == 0){
//                zeichen =(char) (durin.charAt(i) - 32);
//                System.out.print(zeichen);
//            }else {
//                System.out.print(zeichen);
//            }
//            if(durin.charAt(i) == 32){
//                i++;
//                zeichen = (char) (durin.charAt(i) - 32);
//                System.out.print(zeichen);
//            }
//
//        }

        System.out.println("\n===================");

//
////        3-Aufgabe
//           String jedenZweiten ="mgajyk rtth eu isoopu recyev nbzet twqi tfhc eyaowue";
//
//            String[] firstLetter = jedenZweiten.split(" ");
//
//
////         Ama Halaya
//        for (int n = 0; n < firstLetter.length; n++){
//            char zeichen = firstLetter[n].charAt(1); // agar 0 bet awa tanha 3arfakane yakame wshakan print dakat
//           String zeichen_2 = String.valueOf(zeichen).toUpperCase() ;
//            System.out.print( zeichen_2);
//        }
//
//        for (int n = 0; n < jedenZweiten.length(); n+=2){
//            System.out.print(jedenZweiten.charAt(n));
//
//        }

        // Class Variant

        String name_1 = "karwan karasool hassan bndyan";

        for (int y = 0; y < name_1.length(); y++){
            char zeichen = name_1.charAt(y);

            if ( y == 0 || name_1.charAt(y - 1) == ' ') {
                zeichen -= 32;
            }
            System.out.print(zeichen);
        }
        System.out.println();

        int spasses = 0;
        for (int le = 0; le < name_1.length(); le++){
            if (name_1.charAt(le) == ' '){
                spasses++;
            }
        }
        System.out.print("Text Spassing are : " + spasses);
        System.out.println();

        String text = "ich lerne java programmer sprach";
        for(int g = 0; g < text.length(); g++){
            char sum =text.charAt(g);
            if(g == 0 || text.charAt(g -1) == ' '){
                sum -= 32;

            }
            System.out.print(sum);
        }

        System.out.println();
        for(int z = 0; z < text.length(); z++){
            char zeichen_1 = text.charAt(z);
            if(z == 0){
                zeichen_1 =(char) (text.charAt(z) - 32);
                System.out.print(zeichen_1);
            }
            else {
                System.out.print(zeichen_1);
            }
            if (text.charAt(z) == 32){
                z++;
                zeichen_1 = (char) (text.charAt(z) - 32);
                System.out.print(zeichen_1);

            }
        }










    }
}
