
import java.util.Scanner;

public class Demenagement {
    public static void main(String[] args) {
        boolean finished = false;
        while (!finished) {
            try {
                Scanner clavier = new Scanner(System.in);
                Message inputMessage = new Message("Combien de cartons à bouger? ");
                inputMessage.DisplayMessage();
                int totalBoxes = clavier.nextInt();
                Message input2Message = new Message("Quelle est la capacité du camion? ");
                input2Message.DisplayMessage();
                int truckCapacity = clavier.nextInt();
                Moving moving = new Moving(totalBoxes, truckCapacity);
                moving.PerformMoving();
                finished = true;
            } catch (java.util.InputMismatchException e) {
                Message errorMessage = new Message("Entrez un nombre entier");
                errorMessage.DisplayMessage();
            }
        }
    }
}