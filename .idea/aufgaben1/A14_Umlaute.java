package aufgaben;

/**
 * Die Klasse A14_Umlaute
 *
 * @author k.bndyan
 * @version 1.0
 * @date 15.08.2024
 */
public class A14_Umlaute {
    public static void main(String[] args) {


        String text_1 = "Übel wütend der kahlköpfige Gürtelwürger";

//        Aufgabe Umlaute erste variant

        String text = "Übel wütend der kahlköpfige Gürtelwürger".toUpperCase();
        int wortU = 0;
        int wortA = 0;
        int wortO = 0 ;
        int i = 0;

        while (i < text.length()){
            char zeichen = text.charAt(i);
            if(zeichen == 'Ü'){
                wortU++;
            }if (zeichen == 'Ö') {
                wortA++;
            }if (zeichen == 'Ä') {
                wortO++;
            }
            i++;
        }
        System.out.println(wortA + " X " + "Ä");
        System.out.println(wortO + " X " + "Ö");
        System.out.println(wortU + " X " + "Ü");


        System.out.println("#########################################");

//        Aufgabe Umlaut zweite variant
        String txt = ("Übel wütend der kahlköpfige Gürtelwürger ärger  Österreich Österreich österreich," +
                " Übel wütend der kahlköpfige Gürtelwürger änderung österreich ähnlich übung").toLowerCase();
        int wordU = 0;
        int wordO = 0;
        int wordA = 0;
        int O = 0 ;
        int leange = 0;
        while (leange < txt.length()){
            char Um = txt.charAt(leange);
            switch (Um){
                case 'ä':
                    wordA++;
                    break;
                case 'ö':
                    wordO++;
                    break;
                case 'ü':
                    wordU++;
                    break;
                default:
            }leange++;
        }
        System.out.printf("Der Text \"%s\" enthält:\n%d X Ä\n%d X Ä\n%d X Ä\n" ,txt, wordA ,wordO ,wordU);



    }
}
