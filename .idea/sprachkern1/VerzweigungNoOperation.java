package sprachkern;
/**
 * NOP = No Operation = Leeranweisung
 */
public class VerzweigungNoOperation {
    public static void main(String[] args) {
        //  ; // NOP = No Operation = Leeranweisung

        int x = 15;
        if (x < 10)//; // hier darf KEIN Semikolon steht!
        {
            System.out.println("Hello");
        }
    }
}
