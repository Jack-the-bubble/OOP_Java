public class Bicycle implements Cloneable{
    int startCadence;
    int startSpeed;
    int startGear;

    public Bicycle() {
        startCadence = 0;
        startSpeed = 0;
        startGear = 0;
    }

    public Bicycle(int stCadence, int stGear, int stSpeed) {
        startCadence = stCadence;
        startGear = stGear;
        startSpeed = stSpeed;
    }

    public void printDescription() {
        System.out.println("This Bicycle has "+startCadence+" cadence, "+startGear+" gear and "+startSpeed +" speed.");
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
