package javaprogramm;
import java.io.File;
import java.util.Scanner;

public class HelloWold {

    public static void main(String[] args) { // main method
        //System.out.println("Hello World!");

         /*
        // print , Println , String
        System.out.print("Hello World "); // println  واتا لە ریزی خوارەوە پرێنتی بکە
        System.out.println("Hello IT Bildungshaus");
        System.out.println("***");

        System.out.println("1 + 2"); // String
        System.out.println(1 + 3); //
        */

        /*
        //Data Types in Java
        //Variabill in Java 1- Beginnt small Bustabe oder _ under school oder Zeichen $ 2- kann nicht mit nummer 3- kann nicht mit Kye word in Java
        String name = "Karwan"; // Ama String Variabilla
        System.out.println("My name si " + name);

        int num = 5;// Ama Intiger Initializtion Variable
        int num1 = 3;
        System.out.println(num + num1);

        int num2; // Ama Declared Variable
        num2 = 5 + 4;
        System.out.println(num2 + 1);

        float num4 = 1.5f;// Float  بەلام دەبێ ئەم ف  لەگەل زمارەکە دا بنرێت
        System.out.println(num4 + 0.4);

        double num5 = 1.6; // Double  ئەمەش هەمان کاری فلۆت دەکات
        System.out.println(num5 + 0.5);
        */

        // kleine bis grosser => byte , short, int, long, float , double
        /*
        int num = 1;
        int num1 = (int) 12.5; //  لەبەر ئەوەی ئینتیجەر زمارەی تەواوە وەلێرەدا زمارەی تەواو نیە بۆیە لەپێش زمارەکە ئینتیجەرمان نوسیوە تاکو ئیرەر وەر نەگرین
        double num2 = 22; //  دەبل پۆینت وەردەگرێت بەلام لێرەدا پۆینتی نیە کە پرێنت کرا بە دەبل دەمان داتی
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num); // 22.0  هەرجەندا دەبل پۆینتە بەلام لێرەدا بەم شێوازە بە پۆینت بۆمان پرێنت دەکات
        System.out.println(num + num2); // 23.0  بەم شێوەیە بۆمان پرێنت دەکات

        long x = (long)12.5;// لەبەر ئەوی زمارەکەمان دەییە ناتوانین بیخەینە ناو لۆنگ بۆیە دەبێت کاستینگی بۆ بکەین بەم شئوەیە
        System.out.println(x); //بۆ پرێنت دەکا12


        int pip = 1;
        long mii = pip; //  دەتوانین جونکە ئینتیجەر بخوکترە لە لۆنگ
        System.out.println(mii); // 1
        */

        /*
        // Character in Java
        char bustabe = 'A'; //  لە یەک پیت زیاتر نابێت
        char bus = 'a';
        System.out.println(bustabe); //A
        System.out.println(bus); // a
        System.out.println(bustabe + bus); // 162  لێرەدا نرخی کۆدەکای پیتی ئەی کەپیتەل و سمۆلی سیستەمی کۆپیوتەر کۆدەکاتەوە بۆمان
        */
        /*
        //Escape Sequence \n wata break، \t wata Tab, \\ wata yak back slash \ printbka, \" \" w \' \' wata bam shewaza bet "Karwan" yan 'Karwan'

        System.out.println("\tmein name ist Karwan und \nbin 20 jare\\ alt ");// \n  ئەمە بۆمان دەباتە ریزی خوارەوە
        System.out.println("\"Karwan\""); // "Karwan"
        */

        // Object Scanner
        // wenn in consle etwas schreiben ,bekommen wir nummer+5 // Scanner  واتا داخل کردنی شتێک تاکو بۆمان کۆ بکاتەوە لەگەل زمارە پێنج
        /*Scanner sc = new Scanner(System.in); // oben public class muss import java.util.Scanner schreiben // schaue oben

        int numM = sc.nextInt();
        int numM1 = 5;

        int sum = numM + numM1;
        System.out.println(sum);
        */
        /*
        Scanner sc = new Scanner(System.in); //  لێرەدا دەبێ دوو زمارە داخیل بکەین بۆ ئەوەی بۆمان کۆ بکاتەوە

        System.out.print("Enter The First Nummber : ");
        int numM = sc.nextInt();
        System.out.print("Enter The Second Nummber : ");
        int numM1 = sc.nextInt();

        int sum = numM + numM1;
        System.out.println("The Sum = " + sum);
        */


        //  کاتێک داخلی وێب سایتێک دەبین پێمان دەلێت بەخێر بیت ئەمە جۆن دەکرێت
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");

        String name = sc.nextLine();
        System.out.println("Welcome " + name);
        */

        //Operators in Java 1- Arthmetic
        // Zyad krdn ba shewae increment operator   واتا زیادکردن بە شێوەی ئۆپەرەیتۆر
        /*
        int x = 1;
        x++; // x++ wata postfix     , ++x wata Prefix
        System.out.println(x); // 2 weil x== 1 und + 1 => 1+1= 2
        */
        /*
        int x = 1;
        int y = x++ + x;
        System.out.println(y); // 3 weil x == 1 und y = x + 1 + x => 1+1+1=3

        int s = 1;
        int d = ++s + s;
        System.out.println(d); // 4 weil s == 1 und d = 1+ 2 + 1 => d = 4

        int f =1;
        int g = f + f++;
        System.out.println(g); // 2 weil f ==1 und g == 1+1 = 2  جونکە کە ف پلەس پلەس پرێنت نابێت کە لە ناو گ دا نوسراوە
        */

        //Operators in Java 2- Assignment =, +=, -=, *=, /=, %=, <<=, >>= , >>>=, &=, ^=, |=   واتا یەکسان کردن
        /*
        int numb = 1;
        numb += 5; // Ama wak amaya numb = numb + 5;
        System.out.println(numb);
        */

        //Operators in Java 3- Relstional  < kleine, > grosse, <= kleine und gleische, >= grosse und gleische, == gleische != nicht gleische
        /*
        int x = 1;
        int y = 5;
        boolean z= x > y;
        System.out.println(z); // false weil 1 nicht kleine als 5
        */
        /*
        String t = "A";
        String w = "a";
        boolean e = t == w;
        System.out.println(e);
        */

        //Operators in Java 4- Logical && and , || or , ! not
        /*
        int i = 2;
        int n = 5;
        boolean q = !(i > n) && n < i;
        System.out.println(q); // fales  جونکە نیشانەی پرسیار واتە پێجەوانە لێرەدا دەلێین حای گەورەتر نیە لە ئێن وە ئێن بجوکترە لە ئای
        */

        //Operators in Java 5- Bitwise == Binäer
        /*
        int num = 12; // 1100
        int num2 = 10;// 1010

        int result = num & num2;
        int result1 = num | num2;
        System.out.println(result1);// 14
        System.out.println(result);// 8
        */

        //Operators in Java Ternary (? ==if), (: => else)
        /*
        int x = 1;
        String y;
        y = x > 5 ? "Whar": "Falsh";// sttat if und else habe verwendet
        System.out.println(y); // falsh
        */
        /*
        int num = -3;
        String result = num > 0 ? "Deine nummer ist Positive" : "deine nummer ist Negative";
        System.out.println(result); // نەتیجە لێرەدا نێگەتیڤە،  لێرەدا تەنها نێگەتیڤ و سالبمان هەیە

        int nummer = 0;
        String resultt = nummer == 0 ? "Deine nummer ist Null": nummer > 0 ? "Deine nummer ist Positive" : "deine nummer ist Negative";
        System.out.println(resultt); // لیرەدا سێ مەرجمان هەیە سفر و نێگەتیڤ و پۆسوتیف
        */
        /*
        // Nummer eingeben
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        String result = mark <= 0 ? "Dein Nummer ist Nul" : mark <= 50 ? "Fail"
                : mark <= 60 ? "Accept" : mark <= 70 ? "Fair" : mark <= 80 ? "Good" : mark <= 90 ? "Very Good"
                : mark <= 100? "Excellent" : "Dein nummer ist falsh,Bitte geben Sie die Nummer 1 bis 100 ein" ;
        System.out.println(result);
        */
        /*
        Scanner nummerEingeben = new Scanner(System.in);

        System.out.print("Gib eine Nummer: ");
        int input = nummerEingeben.nextInt();
        if(input %2 == 0){ // zhmare jut
            System.out.println("Deine Nummer ist gerade"+ input);
            }
        else{
            System.out.println("Deine nummer ist ungrade" + input);
            }
        */
        // Java nested if statement
        /*
        Scanner number = new Scanner(System.in);

        System.out.print("Geben Sie die Erste Nummer ein : ");
        int x  = number.nextInt();

        System.out.print("Geben Sie die zweite Nummer ein : ");
        int y =number.nextInt();

        if(x > y){
            System.out.println(x + " ist grosse als "+ y);
            }else if(x < y){
            System.out.println(y + "  ist kleine als " + x);
            }else{
            System.out.println(x + " = " + y);
            }
        */

        //Switch case in Java
        /*
        int day = 8;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
             case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Hiiii");
        }
        */

        // Java Loops => for , while, do while   دوبارە بوونەوە
        /*
        for(int i = 1; i <= 5; i++){
            System.out.println(i + " Hello");
        }*/
        /*
        int i =1;
        while(i<=4){
            System.out.println(i + " Hiiii");
            i++;
        }
        */
        /*
        int b = 0;
        do{
           System.out.println(b + " Hellooo");
           b++;
        }while(b <= 4);
        */
        /*
        //Frage : Schreiben Sie ein Programm zur Anzeige(display) der Zhal(number) von 1 bis 10?
        //1- for
        for(int i= 1; i <= 10; i++){
        System.out.println(i + " Slaw");
        }
        //2-
        int ii = 1;
        while(ii <= 10){
            System.out.println(ii + " Hello");
            ii++;
        }

        //3-
        int u = 1;
        do{
            System.out.println(u + " Wellt");
            u++;
        }while(u <= 10);
        */

        // Frage : Schreiben Sie ein Program in Java, das den Benutzer auffordert, die Endnummer einzugeben. Anschreiben
        // zeigt das Proggramm ungerade Zahlen von 1 bis zur Endummer an. Shlisslich gibt das Proggramm die Summe diser Zahlen aus.Ihre Ausgabe sollte wie folgt aussehen:
        //Enter nummer :
        // Die ungeraden nummer sind:
        //1
        //3
        //5
        //7
        //9
        // Die Summe der Nummer: 25
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie die Endnummer ein : ");
        int input = sc.nextInt();
        int sum = 0;
        System.out.println("Die ungrade Nummer sind : ");
        for(int i = 1; i <= input; i++){
            if(i %2 == 1){ // Modul : Mawa yan Rest
                System.out.println(i);
                sum+=i;
            }
            //System.out.println("Sum = "+sum);  ئەمە لێرەدا هەلەیە دەبی لەخوارەوە بنوسرێت
        }
        System.out.println("Sum = "+sum);
        */
        //Boolean => True oder False
        /*
        boolean c = 1 > 3;
        System.out.println(c); // false  جەنکە یەک بجوکتر نیە لە سێ بۆیە
        */

        // Java nested loops واتا لوپێک خستنە ناو لوپێک یان فۆرێک خستنە ناو فۆرێک
        /*
        for(int i=1;i<=3;i++){ // for == Colomm   فۆری یەکەم واتا ئاسۆی
            for(int j=1;j<=4;j++){
                System.out.print(" * "); // فۆری ناوەوە واتا ستونی وە هەروەها نابێت پرینت لن بەکاربهێنین جونکە دەچێتە ریزی خوارەوە
            }
            System.out.println();
        }
        */
        /*
        for(int i=1;i<=3;i++){
            for(int j=1;j<=4;j++){
                System.out.print(i); // j => 1234 1234 1234
            }
            System.out.println();// 1111 2222 3333
        }
        */

        // java Patterns
        /*
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j); // i => 1 22 333 wenn "*" => * ** ***
            }
            System.out.println();// 1 12 123
        }
        */
        /*
        int i , j;
        int n = 6;
        for(i = 0; i < n; i++){
            for(j = 0;j < n; j++){
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1){
                    System.out.print("*");
                }
                else{
                System.out.print("");
                }
            }
            System.out.println();
        }
        // ******
        // **
        // **
        // **
        // **
        // ******
        */

        /*
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= i; j++){

                    System.out.print( j+ " ");
            }
            System.out.println();
        }
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        */

        /*
         int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = i;j <= n; j++){
                System.out.print( j+ " ");
            }
            System.out.println();
        }
        // 12345
        // 2345
        // 345
        // 45
        // 5
        */

        // The break and continue Keywords
        /*
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i); // 1 2 3 4  جونکە ویستومانە ئای یەکسان بوو بە پێنج درێک بکات وە برێک واتا دەرجوون لە بەرنامەکەو بەرنامەکە زیاتی ئیش نەکات هەر کە مەرجەکە هاتە دی لە لوپەکە وەرە دەرەوە
        }
        */
        /*
        for( int i = 1; i <= 10; i++){
            if(i %2 == 0){
                continue;
            }
            System.out.println(i); // 1 3 5 7 9  کۆنتینیو واتا کەتێک مەرجەکە بەدی هات لەسەرەوە بەردەوان بێت  بەکورتی کۆنتینیو دەلێ لە لوپەکە مەیە دەرەوە و بەردەوام لە مەرجەکە تاکۆتایی
        }
        */

        // java excaption handling(Try , Catch, Finally )error واتا گرتنی هەلەکان
         /*
        int a = 0;
        int b = 4;
        //System.out.println(b/a); //  ئەمە هەلەیە لێرە ئیرەرمان دەداتێ جونکە زمارە دابەش ناکرێت بەسەر سفر
        try{ //  واتا تاقی کەرەوە
            System.out.println(b/a);
        }catch(Exception karwan){ //Exception  واتا ئیرۆرم بۆ بگرە با هیج ئیرۆرێکم نیشان نەدات
            System.out.println("Kannst du nicht Zhal durch 0 Null "); // کاتێک ئێرە پرێنت دەکات کە ئیرەرمان هەبێت
        }
        */
        /*
        int t = 2;
        int y = 4;
        try{
            System.out.println(y/t);
        }catch(Exception hala){
            System.out.println("Kannst du nicht Zhal durch 0 Null ");// لێرە هەلەمان نیە بۆیە ئەمە پرێنت ناکات
        }
        */
        /*
        int t = 0;
        int y = 4;
        try{
            System.out.println(y/t);
        }catch(Exception hala){
            System.out.println(hala.getMessage());//ئەمەمان بۆ پرێنت دەکات / by zero
        }finally{ // واتا لە کۆتایدا ئەمەم بۆ پرێنت بکە حەقت بە ترای و کەەتج نەبێت
            System.out.println("Hello");
        }
        */
        // string manipulation تایبەت مەندیەکانی سترینگ
        /*
        String kar = "DAS IST DER SRTING";
        int lange = kar.length();
        System.out.println(lange);//18  لێرە ثیمان دەلێ لە هەزدە پئت پێک هاتووە

        String kleine = kar.toLowerCase();
        System.out.println(kleine);

        String grosse = kar.toUpperCase();
        System.out.println(grosse);

        String verandern = kar.replace('S','b'); // replace  واتا بۆم بگۆرە بەمە
        System.out.println(verandern);

        String zyadkrdn = kar.concat(" hello");//concat   زیادکردن
        System.out.println(zyadkrdn);

        String ausschneiden = kar.substring(2);//وە ٢ واتا برە لە لێنگسی زمارە
        System.out.println(ausschneiden);// S IST DER SRTING

        String ausschneiden١ = kar.substring(0,7);
        System.out.println(ausschneiden١);// DAS IST  لێرەدا داوامان کردووە لە سفرەوە بۆ حەفتمان بۆ پرێنت بکات

        String kar1 = "       mit diser Methode kann man die Spaise wegmachen,die stehet ganz vorne";
        String weg = kar1.trim(); //  واتا لابردنی سپەیس
        System.out.println(weg);

        String kar2 = "DAS IST DER SRTING";
        char char1 = kar.charAt(2);
        System.out.println(char1); // charAt واتا تەنها ئەو پیتەم بۆ پرێنت نکە کە ثێت دەدەم کە لێرەردا دوومان نوسیوە

        String kar3 = "DAS IST DER SRTING";
        boolean bust = kar3.contains("IST"); //  واتا گەران بە دوای وشەیەک لە سترینگەکەمان
        System.out.println(bust); // true

        //change String to Int گۆرینی سترینگ بۆ ئینتەجەر

        String str = "3"; // String
        int a =2;
        System.out.println(a + str); // 23

        String str1 = "3"; // String
        int a1 =2 + Integer.parseInt(str1);// + Integer.parseInt(str1) بەم شێوازە سترینگ دەگۆرین بۆ ئینتیجەر
        System.out.println(a1); // 5
        */

        //Java Method

        int x = 1;
        int y = 2;
        getSum(x,y); //3 بەم شێوەیە میسۆدی خوارەوەمان بانگ کرد

        sayHello("Karwan");

        //int x1= 5; //1 kann auch
        //int y1= 3; //1 kann auch
        //getGett(x1,y1); // 8 //1 kann auch
        //int sum = getGett(x1,y1); //1 kann auch
        //int sum = getGett(5,3); // 2 kann auch
        //System.out.println(sum);//2 kann auch
        System.out.println(getGett(5,3)); // 8 //3 kann auch

    } //public static void main(String[] args) { // main Method ==تائێرە میسۆدی  مەین
    //Java Method
    // new Methode  لێرەوە دوای ئەم کەوانەیە دەتوانین میسۆدی نوێ دروست بکەین واتا مێوسۆد لە ناو میسۆد دروسی ناکرێت

    public static void getSum(int x, int y){ // new method

        int sum = x + y;
        System.out.println(sum); // بەلام دبێت لە مێسۆدی سەرەوە کە مینە بانگی بکەینەوە دانا کار ناکات یان بۆمان پرێنت ناکات
    }
    static void sayHello(String name){ // new method
        System.out.println("Hello Mr." + name);
    }

    // Return Value Method واتا گەراندنەوەی نرخێک
    public static int getGett(int x1,int y1){ // new method => return method هەر کاتێک میسۆدیکمان دروست کرد داتا تایپەکەی ڤۆید نەبوو مەرجە ریتورن هەبێت
        int sum = x1+ y1;
        return sum;

    }
}
