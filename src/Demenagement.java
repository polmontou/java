
import java.util.Scanner;

public class Demenagement {
    public static void main(String[] args) {
        boolean finished = false;
        while (!finished) {
            try {
                Scanner clavier = new Scanner(System.in);
                System.out.print("Combien de cartons à bouger? ");
                int totalBoxes = clavier.nextInt();
                System.out.print("Quelle est la capacité du camion? ");
                int truckCapacity = clavier.nextInt();
                Moving moving = new Moving(totalBoxes, truckCapacity);
                moving.PerformMoving();
                finished = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrez un nombre entier");
            }
        }
    }
}