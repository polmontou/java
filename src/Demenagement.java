
import java.util.Scanner;

public class Demenagement {
    public static void main(String[] args) {

        boolean finished = false;

        while (!finished) {
            try {
                Scanner clavier = new Scanner(System.in);

                Message.displayMessage("Combien de cartons à bouger?");
                int totalBoxes = clavier.nextInt();

                Message.displayMessage("Quelle est la capacité du camion?");
                int truckCapacity = clavier.nextInt();

                Moving moving = new Moving(totalBoxes, truckCapacity);
                moving.performMoving();
                finished = true;

            } catch (java.util.InputMismatchException e) {

                Message.displayMessage("Entrez un nombre entier");

            }
        }
    }
}