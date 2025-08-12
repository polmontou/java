public class Demenagement {
    public static void main(String[] args) {
        int carton = 34;
        int truckCapacity = 9;
        int cartonMoved;
        while(carton > 0) {
            if(carton - truckCapacity > 0) {
                carton = carton - truckCapacity;
                cartonMoved = 9;
            } else {
                cartonMoved = carton;
                carton = 0;
            }
            System.out.println("Un voyage de " + cartonMoved + " cartons.");
        }
        System.out.println("Fini!");
    }
}