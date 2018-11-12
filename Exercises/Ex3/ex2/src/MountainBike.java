import java.util.Objects;

public class MountainBike extends Bicycle implements Cloneable {
    private String suspension;
    public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType) {
        super(startCadence,startSpeed,startGear);
        this.setSuspension(suspensionType);
    }
    public String getSuspension(){
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has " +
                getSuspension() + " suspension.");
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "cadence: "+startCadence+", gear: "+startGear+", speed: "+startSpeed+", suspension: "+suspension;
    }

}
