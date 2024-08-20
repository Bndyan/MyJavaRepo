package aufgaben;

import java.util.Scanner;

/**
 * Die Klasse A18_Palindrom
 *
 * @author k.bndyan
 * @version 1.0
 * @date 16.08.2024
 */
public class A18_Palindrom {
    public static void main(String[] args) {

        // 1 - alternativ
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Wort ein: ");
        String input = scan.nextLine().toUpperCase();

        boolean istPalindrome = true;
        int leange = input.length();

        for (int i = 0; i < leange /2 ; i++){
            if (input.charAt(i) != input.charAt(leange - 1 - i)){
                istPalindrome = false;
                break;
            }
        }
        if (istPalindrome){
            System.out.println(input + " ist ein Palindrom.");
        }else {
            System.out.println(input + " ist kein Palindrom.");
        }

//        2- alternativ für Nummer Palindrom
        System.out.print("Bitte geben Sie ein Nummer ein: ");
        int nummer = scan.nextInt();
        int ergebnis = 0;
        int doppel = nummer;
        while (nummer > 0){
            ergebnis = (ergebnis*10)+(nummer%10);
            nummer = nummer/10;
        }
        if (ergebnis==doppel){
            System.out.println("Die Nummer "+ ergebnis +" ist Palindrom");
        }
        else {
            System.out.println("Die Nummer "+ ergebnis +" kein Palindrom");
        }

//        3- Alternativ Wort Palindrom mit do ... while
        int i = 0;
        do{
            if (input.charAt(i) != input.charAt(leange - 1 -i)){
                istPalindrome = false;
                break;
            }
            i++;
        }while (i < leange / 2);
        {
            if (istPalindrome){
                System.out.println(input + " ist ein Palindrom.");
            }else {
                System.out.println(input + " ist kein Palindrom.");
            }

        }

//         4-  Satz Palindrom
//        String satz = "lagerregal";
//        String ergebnis = "";
//        for (int i = satz.length()-1 ; i >= 0 ;i-- ){
//            ergebnis = ergebnis + satz.charAt(i);
//        }
//        if (satz.equals(ergebnis)){
//            System.out.println(satz + " ist Palindrome Satz");
//        }else {
//            System.out.println(satz + " ist kein Palindrome satz");
//        }




//      5- Alternativ
//        System.out.print("Bitte geben Sie eine Wort ein: ");
//        String eingabe = scan.nextLine();
//        boolean isPalindrome = true;
//        int leangee = eingabe.length();
//
//        for (int b = 0; b < eingabe.length() / 2 ;b--) {
//
//            if (eingabe.charAt(b) != eingabe.charAt(leangee - 1 - b))
//                isPalindrome = false;
//            break;
//        }
//        if (isPalindrome)
//            System.out.print(  eingabe+ " ist ist Palindrom");
//        else
//            System.out.println(eingabe + " ist kein Palindrom");



////      6- Alternativ mit ture oder false

//        System.out.println("Bitte geben Sie die Zeichenkette ein: ");
//        String eingebenInput = scan.nextLine().toUpperCase();
//        int length = eingebenInput.length();
//        boolean  result = true;
//        for (int i = 0; i < length / 2; i++)
//            if (eingebenInput.charAt(i) != eingebenInput.charAt(length -1 - i))
//                result = false;
//        System.out.println(" 2- Wort Palindrom: " +result);
//
    }
}
