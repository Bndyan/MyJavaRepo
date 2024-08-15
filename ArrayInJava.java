package javaprogramm;
/**
 *
 *
 * 
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ArrayInJava {
    public static void main(String[] args) { // main Method
        // Array in Java 1- one dimensional Arrays //
        // شیوەی یەکەم
        /*
        int [] myArray = new int[5]; //  ئەم پێنجە واتا ئەرایەکەمان لە پێنج ئیلیمێنت پێک هاتووە
        myArray[0] = 5; // ئەمە نرخی ئیلیمێنتی یەکەم
        myArray[1] = 2; // ئەمە نرخی ئیلیمێنتی دووەم
        myArray[2] = 33;// سێیەم
        myArray[3] = 12;// جوارە
        myArray[4] = 80;// پێنجە

        System.out.println(myArray[3]);// 12  جونکە نرخی ئیلیمێنتی سێ یەکسانە بە دوانزە
        */
        /*
        // شێوەی دووەم
        int[] mYarray= {5,14,2,7,70}; // ئەرێەکەمان لە پێنج خانە پێک هاتووە

        for(int i=0; i < 5; i++){ // ئەم پێنجە واتا ئەرێیەکەمان لە پێنج خانە پێک هاتووە
            System.out.println(mYarray[i]); // بەم شێوەیە دەتوانین تەواوی ئەرێیەکەمان پێکەوە پرێنت بکەین
        }

        String[] myArrayStri = {"Karwan ", "Karwasool ","Hasan ","Bndyan"};

        for(int i = 0; i < 4; i++){
            System.out.print(myArrayStri[i]); // Karwan Karasool Hasan Bndyan
        }
        */

        // Array in Java 2- two dimensional Arrays == 2D Array//////  واتا بە شیوەی ئاسۆی و ستونی
        // شیوەی یەکەم
        /*
        int [] [] my_arraY = new int [2] [3];
        my_arraY[0][0]= 2;
        my_arraY[0][1]= 33;
        my_arraY[0][2]= 22;
        my_arraY[1][0]= 11;
        my_arraY[1][1]= 99;
        my_arraY[1][2]= 66;

        System.out.println(my_arraY[0][1]); //33  جونکە داوامان کردووە لە ریزی سفر کۆلۆم یەک بۆمان پرینت بکات
        */
        /*
        int [] [] my_array = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        System.out.println(my_array[0][2]); // 3 row 0 colmme 2 ==3

        for(int i =0;i <4;i++){ // 4 weil ich 4 row habe
            for(int j = 0; j < 3; j++){ // 3 ich 3 colmmes habe
                System.out.println(my_array[i][j]);
            }
             // بەم شێوزە دەتوانین هەموو ئەرێیەکەمان پرێنت بکەین
        }
        */
        //Array Exercise 1  دروست کردنی بەرنامەیەک لە ڕێگەی ئەرایی  وە پێک هاتبێ لە دە ئەرای
        /*
        int [] array10 = new int[10];
        for(int i = 0 ; i < 10; i++){
            array10[i]=i;

            System.out.println(i); // 0 1 2 3 4 5 6 7 8 9
        }
        */

        //Array Exercise 2  دروست کردنی بەرنامەیەک کە تەنها ژمارە تاکەکان دەربخات لە ڕێگەی ئەرایی  وە پێک هاتبێ لە دە ئەرای
        /*
        int [] array10 = new int[10];
        for(int i = 0 ; i < 10; i++){
            array10[i]=i;
            if(i%2 == 1){ // bo jut (i % 2 == 0)
            System.out.println(i); // 1 3 5 7 9
            }
        }
        */
        /*
        int[]myNumber = new int[5];
        Scanner reder = new Scanner(System.in);
        for(int index = 0; index < myNumber.length; index++){
            System.out.println("Enter number : " + (index + 1));
            myNumber[index] = reder.nextInt();
        } //   لێرەدا دەبێت پێنج جار زمارە داخیل بکەین ئینجا کۆتایی دێت

        for(int index = myNumber.length - 1; index >= 0; index--){
            System.out.println(myNumber[index]);
        }// ئەم فۆرە دوای ئەوی کە پێنج ژمارە داخیل دەکەین ژمارەکانمان بۆ ریز دەکای لە گەورەوە بۆ بجوک
        */


        // Array Exercise -3  بەرنامەیەک دروست بکە لە رێگەی یەرای کە ئەم ژمارانەیخوارەوەی تێدابێت و لە کۆتایشدا یەمووی کۆبکاتەوە
        //3,5,8,10,4,9  ژمارەکان
        /*
        int [] array = {3,5,8,10,4,9};
        int sum = 0;
        for(int i =0; i < array.length;i++){// 6 بەکار دەهێنین ئاسانترە لە جیاتی نوسینی زارەی خانەکانی ئەرایەکەمان کە بریتیە لە  array.length
            sum = sum + array[i];
        }
        System.out.println("SUM " + sum);
        */

        // Array Exercise -3  بەرنامەیەک دروست بکە لە رێگەی یەرای کە ئەم ژمارانەیخوارەوەی تێدابێت و لە کۆتایشدا لە کۆتایدا گەورەترین ژمارە بدۆزەرەوە
        //3,5,8,10,4,9  ژمارەکان

        int [] array = {3,5,8,10,4,9};
        int max = array[0];
        for(int i =0; i < array.length;i++){

            if(array[i]> max){
                max =  array[i];
            }
        }
        System.out.println("Max " + max);



        // File in java
        /*
        try{
        File ff = new File("karwann.txt");  //  لەسەرەوە ئیمپۆرتی فایلی ژاڤامان کردووە
        ff.createNewFile();

        }catch(Exception e){ // try , catch   بۆ گرتنی هەلە یان ئیرۆر
            System.out.println("Error");
        } // C:\Users\PC\Documents\NetBeansProjects     لێرە فایلێکی بۆ دروست کردوینن
        */

        // ئەگەر بمانەوێت فایلێک لەسەر دیسک تۆپ دروست بکەین
        // بەلام نابێت لە بیر بکەین دەبێت لەسەرەوە پاکێجی ئیمپۆرت ئای ئۆ جاڤا ئەد بکەین

        try{
            File ff = new File("C:\\Users\\PC\\Desktop\\yad.txt"); //  من تەنها نوی فایلەکەم نوسیکە یادە
            ff.createNewFile();

            if(ff.exists()){

                System.out.println("yad.txt: "+ff.getName()); //  واتا نیشان دانی ناوی پرۆژێکتەکە
                System.out.println("Abslute path: "+ff.getAbsolutePath());// بۆ پاسی فایلەکە واتا لینکی فایلەکە یان فایلەکە لە کوێ دروست بووە
                System.out.println("writeablr: "+ff.canWrite());// واتا ئایا دەتوانین لەو فایلە شت بنوسین لە خوارە پێمان دەلێ تروو بەلێ
                System.out.println("readsble: "+ff.canRead());// ئایا دەتوانین فایلەکە بخوێنینەوە لە خوارەوە دەلێت تروو بەلێ
                System.out.println("file size in bytes "+ ff.length()); // بۆ دەست کەوتنی سایزی فایلەکەیە
            }
            else{
            }
        }catch(Exception e){ // try , catch   بۆ گرتنی هەلە یان ئیرۆر
            System.out.println("Error");
        }

        /*
        // کاتێک فایلێک دروست کرد جۆن بتوانین شتی تێدا بنوسین

        try{

        FileWriter fb = new FileWriter("yad.txt");  //import java.io.FileWriter; لەسەرەوە ئەم پاکێجەی دەبێت ئاد بکەین
        fb.write("slaw chone \n slaw la to"); // لێرەش جمان بوێت دەنوسین
        fb.close(); //  واتا فایلەکەم بۆ داخەوە
        }catch(Exception e){
            System.out.println("Error"); // C:\Users\PC\Documents\NetBeansProjects\karwan_array.java  ئەگەر بجینە ناو ئەو فایلە دەبینین کە ئەو شتانەی تێدا نوسرواە
        }
        */
        /*
        // بەم شێوازەش دەتوانین شت بنوسین لە ناو فایلەی دەمانەویت
        try{
        PrintWriter px = new PrintWriter("C:\\Users\\PC\\Desktop\\kar.txt");
        px.println(" Hello German");
        px.close();//  زۆر گرینگە ئەمە لەبیر نەکەی دەنا هیج نانوسێت
        }catch(Exception e){
        }
        */
        //java read text file  جۆن داتاکانی ناو فایلەکەمان بخوێنینەوە
        // 1 - a
        /*
        try{
        File fm = new File("yad.txt");
        Scanner sc = new Scanner(fm); //import java.util.Scanner;   ئەوە لەبیر نەکەی کە ئادی بکەین
        sc.nextLine();
            System.out.println(sc.nextLine()); // بەم شێوازە تەنها دێری یەکەم بۆ دەخوێنێتەوە

        }catch(Exception e){

        }
        */

        // 1- b
        /*
        try{
        File fm = new File("yad.txt");
        Scanner sc = new Scanner(fm);
            while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
            }

            }catch(Exception e){

        }
        */
        // 1- c
        /*
        try{
        File fm = new File("yad.txt");
        Scanner sc = new Scanner(fm);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
            System.out.println(data);
            }

            }catch(Exception e){

        }
        */
        //2   بەم شێوازە لە رێگەی کلاس ریدەرەوە داتاکان دەخوێنینەوە
        /*
        try{
            FileReader fr = new FileReader("yad.txt");

            int x ;
            while((x=fr.read())!= -1) { // لێرەدا مینوس سفر واتا فایلەکەمان داتای تێدا بێت بۆم بخوێنەوە
                System.out.print((char)x); //  ئەگەر ئەم جارە نەنوسین ئەوا بە زمارە دەمان داتێ وە نابێت پرینت لین بێت جونکە بەس نە پیت بۆمان دەخوێنێتەوە

            }

            }catch(Exception e){

        }
        */

        //How to Get Current Time in java ‌کات لە جاڤادا
        // 1
        /*
        Date kat = new Date(); // import java.util.Date;  کرینگترین شت ئەد کردنی ئەمەیە
        System.out.println(kat); // Fri Jul 26 22:33:41 CEST 2024  بەم شێوازە بۆمانی پرێنت کرد
        */
        // 2
        /*
        Date kat = new Date();


        //SimpleDateFormat sm = new  SimpleDateFormat("YYYY"); // ئەمە تەنها بۆ سالە
        //SimpleDateFormat sm = new  SimpleDateFormat("MM:YYYY"); // ئەمە تەنها بۆ سال و مانگە
        //SimpleDateFormat sm = new  SimpleDateFormat("dd:MM:YYYY"); // 2024  ئەمە تەنها سالمان بۆ دەهێنێت وە دەبێت زۆر ئاگاداری رۆژ بین بە سمۆلی دەنوسرێت
        //SimpleDateFormat sm = new  SimpleDateFormat("hh:mm:ss"); // ئەمە بۆ کات سەعات دەقە جرکە
        //SimpleDateFormat sm = new  SimpleDateFormat("hh:mm a"); // سەعات و دەقە وە ئەم ئەیە سمۆلە بۆ نیشان دانی پی ئێم و ئەی ئێمە
        //SimpleDateFormat sm = new  SimpleDateFormat("mm:ss");// جرکە
        //SimpleDateFormat sm = new  SimpleDateFormat("EEEE"); //  بۆرۆزەکانی هەفتە
        //SimpleDateFormat sm = new  SimpleDateFormat("E"); // بۆ رۆزەکانی هەفتە بە کورت کراوەیی
        System.out.println(sm.format(kat));
        */

        //
        /*
        Date kat = new Date();

        SimpleDateFormat sm = new  SimpleDateFormat("YYYY");

        String da = sm.format(kat);
        int x = Integer.parseInt(da);
        System.out.println(x - 1);
        */


    }
}
