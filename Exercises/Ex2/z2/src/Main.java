public class Main {
    public static void main(String[] args){
        Bicycle bicycle = new Bicycle(12, 7, 3);
        MountainBike mbike = new MountainBike(30, 5, 5, 7);

        mbike.setHeight(35);
        bicycle.setCadence(3);
        mbike.setGear(5);
        bicycle.speedUp(35);
        mbike.applyBrake(3);

        System.out.print("Mountain bike has speed " + mbike.speed +", bicycle has gear " + bicycle.gear);
    }
}
