package konsole;

/**
 * Formatiert Ausgabe mit print
 * syntax (grob):
 *      printf(format, var1 , var1, .....)
 */
public class PrintF {
    public static void main(String[] args) {

        int anzahl = 42;

        /*
            Ausgabe:
            Gesamtanzahl: 42 Stück
         */
        System.out.println("Gesamtanzahl: " + anzahl + " Stück");

        System.out.printf("Gesamtanzhal: %d Stück\n",anzahl);
        System.out.printf("Gesamtanzhal: %d Stück%n",anzahl);

        System.out.printf("%d bla %d blub %d",42,4711,8);
        System.out.printf("%d bla %-8d blub %d%n",42,4711,8);

        System.out.printf("%x\n",65535); //ffff

        //Fließkommazahlen
        double prise = 12345.67890123456;
        System.out.printf(" Prise = %f Euro",prise);//Prise = 12345,678901 Euro
        System.out.printf(" Prise = %.2f Euro",prise); //Prise = 12345,68 Euro
        System.out.printf(" Prise = %,.2f Euro",prise);//Prise = 12.345,68 Euro

        System.out.println("\n========================================");
        double kosten = 12.99;
        System.out.printf("Kosten = %,.4f Euro",kosten );
        System.out.printf("\nKosten = %f Euro",kosten);
        System.out.printf("\nKosten = %f Euro",kosten);

        double num = 10.1234;
        System.out.printf("\n%f%n",num); //10,123400
        // Decimal
        double num1 = 12.3456789;
        System.out.printf("\n%.0f%n",num1); // 12
        System.out.printf("\n%.1f%n",num1); // 12.3
        System.out.printf("\n%.2f%n",num1); // 12.35
        System.out.printf("\n%.3f%n",num1); // 12.346
        System.out.printf("\n%.4f%n",num1); // 12.3457
        System.out.printf("\n%.5f%n",num1); // 12.34568
        System.out.printf("\n%.6f%n",num1); // 12.345679
        System.out.printf("\n%.7f%n",num1); // 12.3456789
        System.out.printf("\n%.8f%n",num1); // 12.34567890
        System.out.printf("\n%.9f%n",num1); // 12.345678900

        String str = "hello";
        int num22 = 15;
        char let = 'A';

        System.out.printf("%.2s%n",str); //he
        System.out.printf("%.3b%n",true); //tru
        System.out.printf("%.2h%n",str); //5e
        //System.out.printf("%.3d%n",num22); // error war dagren
       // System.out.printf("%.2c%n",let); // error war dagren
        //System.out.printf("%.3n",num22); // error war dagren


        System.out.printf("%8d%n",123); // 5 spases enja print ,wata ba spaesawa 8 xana bet

        System.out.printf("\n%4d%5d%n",123,456); // ba speasawa 4 xabet wa awae tr ba spaesawa 5 xana bet

        System.out.printf("%4d%n",12345); // lerada damanwet ba spaesawa 4 xana bet balam ema 5 xaneman heaw hamuman bo print dakat

        System.out.printf("%6.2f%n",123.12586789); // 123,13 cunke la dwae xane 6 boman uzek dakatawa la 5 basarawa bet deykata jmaraey gawratr

        System.out.printf("%-8d%n",123456789); //

        System.out.printf("%-6s%5d%n", "Num =",456); // wata la 11 xana prente bka


        String name = "Albert";
        int age = 18;
        double gpa=3.5;
        System.out.printf("%-7s%7s%n","Name =",name); // Name =  Albert
        System.out.printf("%-7s%7d%n","Age =", age); // Age =       18
        System.out.printf("%-7s%7.2f%n","GPA =", gpa); // GPA =     3,50








    }
}
