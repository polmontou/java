/**
 * The class Demenagement
 */
public class Moving {
    private int totalBoxes;
    private int truckCapacity;
    private int totalTrips;

    /**
     * The constructor for the class Moving
     */
    public Moving(int totalBoxes, int truckCapacity) {
        this.totalBoxes = totalBoxes;
        this.truckCapacity = truckCapacity;
        this.totalTrips = 0;
    }
    /**
     * The method who calculate the process of doing the Moving
     */
    public void PerformMoving(){
        while (totalBoxes > 0){
            if(totalBoxes < truckCapacity){
                truckCapacity = totalBoxes;
            }
            totalTrips++;
            totalBoxes -= truckCapacity;
            System.out.println(truckCapacity + " ont été déplacés");
        }
        System.out.println("Le déménagement est terminé en " + totalTrips + " voyages!");
    }
}