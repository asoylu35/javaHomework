
public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        //tek sayılar
        System.out.println("tek sayılar");
        for (int i = 1; i < 10; i += 2) {

            System.out.println(i);
        }
        //çift sayılar
        System.out.println("çift sayılar");
        for (int i = 2; i < 10; i += 2) {

            System.out.println(i);
        }

        System.out.println("For Döngüsü bitti");

        //While
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }


        System.out.println("While Döngüsü bitti");

        //Do-While
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Döngüsü bitti");
    }
}