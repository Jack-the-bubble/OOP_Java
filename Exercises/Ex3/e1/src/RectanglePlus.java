import java.util.Objects;

public class RectanglePlus implements Relatable, Cloneable{
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }

    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect = (RectanglePlus)other;
        if (this.getArea() < otherRect.getArea()) {
            return -1;
        } else if (this.getArea() > otherRect.getArea()) {
            return 1;
        }
        else
            return 0;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj instanceof RectanglePlus) {
            RectanglePlus object = (RectanglePlus)obj;
            return Objects.equals(getArea(), object.getArea()) && Objects.equals(origin.x, object.origin.x) && Objects.equals(origin.y, object.origin.y);
        }
        else
            return false;
    }

    public int hashCode() {
        int result = 11;
        return ((7*result+(int)height)*37+(int)width)*37+origin.hashCode();
    }

    public String toString() {
        return "width = "+width+", height = "+height+", origin: "+origin.x+" "+ origin.y;
    }


}
