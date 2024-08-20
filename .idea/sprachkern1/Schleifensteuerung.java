package sprachkern;

/**
 * Die Klasse Schleifensteuerung
 *
 * @author k.bndyan
 * @version 1.0
 * @date 16.08.2024
 */
public class Schleifensteuerung {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++){

            if (i % 2 == 0){
                continue;  // abbrechen des aktuellen Durchlaufs
            }

            if (i>15){ // abbrechen der gesamten Schleife
                break;
            }

            System.out.println(i);
        }

        for (int i = 0; i <= 15; i+=2){

            System.out.println(i);
        }

        /*

         */
        // mit continue
        for (int i = 0; i <= 20; i++){
            if (i % 2 == 0){
                continue;  // abbrechen des aktuellen Durchlaufs
            }
            System.out.println(i);
        }

        // ohne continue
        for (int i = 0; i <= 15; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }

        }

        // Tohmas
         /*
            Beispiel: 1 3 5 7 9 11 13 15 ausgeben
         */
        // mit continue und break
        for (int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
                continue; // abbrechen des aktuellen Durchlaufs
            }
            if(i > 15) { // abbrechen der gesamten Schleife
                break;
            }
            System.out.println(i);
        }
        // ohne continue und break
        for (int i = 1; i <= 15; i+=2) {
            System.out.println(i);
        }

        /*
            Beispiel: Jeden Zweiten ausgeben
         */
        // mit continue
        for (int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
                continue; // abbrechen des aktuellen Durchlaufs
            }
            System.out.println(i);
        }
        // ohne continue
        for (int i = 1; i <= 20; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
