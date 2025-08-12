import java.util.Scanner;

public class Demenagement {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Combien de cartons à bouger? ");
        int carton = clavier.nextInt();
        System.out.println("Quelle est la capacité du camion?");
        int truckCapacity = clavier.nextInt();
        int cartonMoved;
        while(carton > 0) {
            if(carton - truckCapacity > 0) {
                carton = carton - truckCapacity;
                cartonMoved = truckCapacity;
            } else {
                cartonMoved = carton;
                carton = 0;
            }
            System.out.println("Un voyage de " + cartonMoved + " cartons.");
        }
        System.out.println("Fini!");
    }
}