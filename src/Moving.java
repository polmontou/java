/**
 * Moving class
 */
public class Moving {
    private int totalBoxes;
    private int truckCapacity;
    private int totalTrips;

    /**
     * The Moving class's constructor
     */
    public Moving(int totalBoxes, int truckCapacity) {
        this.totalBoxes = totalBoxes;
        this.truckCapacity = truckCapacity;
        this.totalTrips = 0;
    }
    /**
     * This methods displays each trip in the terminal
     */
    public void performMoving(){
        while (totalBoxes > 0){
            if(totalBoxes < truckCapacity){
                truckCapacity = totalBoxes;
            }
            totalTrips++;
            totalBoxes -= truckCapacity;

            Message.displayMessage(truckCapacity + " cartons ont été déplacés.");

        }

        Message.displayMessage("Le déménagement est terminé en " + totalTrips + " voyage"+(totalTrips <= 1 ? "":"s")+"!");

    }
}