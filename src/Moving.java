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
    public void PerformMoving(){
        while (totalBoxes > 0){
            if(totalBoxes < truckCapacity){
                truckCapacity = totalBoxes;
            }
            totalTrips++;
            totalBoxes -= truckCapacity;
            String message = truckCapacity + " ont été déplacés";
            Message moveMessage = new Message(message);
            moveMessage.DisplayMessage();
        }
        String message = "Le déménagement est terminé en " + totalTrips + " voyage"+(totalTrips == 1 ? "":"s")+"!";
        Message endMessage = new Message(message);
        endMessage.DisplayMessage();
    }
}