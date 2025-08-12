import java.util.Scanner;

public class Demenagement {
    public static void main(String[] args) {
        boolean finished = false;
        while(!finished) {
            Scanner clavier = new Scanner(System.in);
            try {
                System.out.print("Combien de cartons à bouger? ");
                int carton = clavier.nextInt();
                System.out.println("Quelle est la capacité du camion?");
                int truckCapacity = clavier.nextInt();
                int cartonMoved;
                while (carton > 0) {
                    if (carton - truckCapacity > 0) {
                        carton = carton - truckCapacity;
                        cartonMoved = truckCapacity;
                    } else {
                        cartonMoved = carton;
                        carton = 0;
                        finished = true;
                    }
                    System.out.println("Un voyage de " + cartonMoved + " cartons.");
                }
                System.out.println("Fini!");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Rentrez un nombre valide!");
            }
        }
    }
}