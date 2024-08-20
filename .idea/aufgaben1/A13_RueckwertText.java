package aufgaben;

/**
 * Die Klasse A13_RueckwertText
 *
 * @author k.bndyan
 * @version 1.0
 * @date 15.08.2024
 */
public class A13_RueckwertText {
    public static void main(String[] args) {

        String orginal = "Hello";
        String  revets = " ";
        int b = 0;

        while (b < orginal.length()){
            revets = (orginal.charAt(b) + revets);
            b = b + 1;
        }
        System.out.println(revets);


        String TextOrginal = "Karwan";
        int rueckwert = TextOrginal.length() -1;
        while (rueckwert >= 0 ){
            char zeichen =TextOrginal.charAt(rueckwert)   ;
            System.out.print(zeichen );
            rueckwert--;
        }
        System.out.println("\n" +"============================");



        String orginalText ="Ein Text";
        String anderungText= " ";
        int i = 0;
        while (i < orginalText.length()){
            anderungText = orginalText.charAt(i) + anderungText;
            i++;
        }
        System.out.println(anderungText);

        System.out.println("====================================" );



    }
}
