package aufgaben;

import java.util.Scanner;

/**
 * Die Klasse JavaQues
 *
 * @author k.bndyan
 * @version 1.0
 * @date 18.08.2024
 */
public class JavaQues {
    public static void main(String[] args) {
        int a =1;
        int b = 2;
        if (a++ == --b){
            System.out.println("2 = 2");
        }else {
            System.out.println("3 = 3");
        }



        char aa ='A'; // A la java nrxe 65 lerash 65++ = 66
        aa++;
        System.out.print((int)aa);

        System.out.println(" 1- ========================");

        String t ="Maya";
        String z = "Chaya";
        System.out.println(t.charAt(0) > z.charAt(0));
        System.out.println(t.charAt(0));

        System.out.println("2 - ========================");

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2));// true

        System.out.println("3 - ========================");

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter String .. \n");
//        String str = scan.nextLine();
//
//        if (str.length() == 0){
//            System.out.print("String is empty: " +str.length());
//        }else {
//            System.out.print("\nLength: "+str.length());
//        }


        System.out.println("4 - ========================");

//        5 1 2 3 4
//        4 5 1 2 3
//        3 4 5 1 2
//        2 3 4 5 1
//        1 2 3 4 5
//        Scanner ss = new Scanner(System.in);
//        System.out.println("Enter rows: ");
//        int row = ss.nextInt();
//        System.out.println();
//        for (int m=row; m>0;m--){
//            for (int n=m; n<=row;n++)
//                System.out.print(n + " ");
//            for (int k=1;k<m;k++){
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Wort ein: ");


    }
}
