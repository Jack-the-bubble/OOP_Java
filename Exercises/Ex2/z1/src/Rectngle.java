public class Rectngle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    public Rectngle(){
        origin = new Point(0, 0);
    }

    public Rectngle(Point p) {
        origin = p;
    }

    public Rectngle(int w, int h){
        width = w;
        height  = h;
        origin = new Point(0, 0);

    }

    public Rectngle(Point p, int w, int h){
        width = w;
        height  = h;
        origin = p;
    }


    public void move(int x, int y){
        origin.x = x;
        origin.y = y;
    }

    public int getArea(){
        return width*height;
    }

}
