public class TestBikes {
    public static void main(String[] args){
        Bicycle bike01, bike02, bike03;

        bike01 = new Bicycle(20, 10, 1);
        bike02 = new MountainBike(20, 10, 5, "Dual");
        bike03 = new RoadBike(40, 20, 8, 23);

        bike01.printDescription();
        bike02.printDescription();
        bike03.printDescription();

        try {

            MountainBike bike04;
            bike04 = (MountainBike)bike02.clone();
            System.out.println(bike04.getSuspension());
        } catch (CloneNotSupportedException e) {
            System.out.println("couldn't clone");
        }
        System.out.println(bike02.toString());

        if (bike03 instanceof Bicycle) {
            if (bike03 instanceof MountainBike) {
                System.out.println("Mountainbike");
            } else if (bike03 instanceof RoadBike) {
                System.out.println("Roadbike");
            } else {
                System.out.println("Just a bike");
            }
        }
    }
}
