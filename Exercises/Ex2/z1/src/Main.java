public class Main {
    public static void main(String[] args){
        Point p = new Point(24, 45);
        Rectngle rec1= new Rectngle();
        Rectngle rec2 = new Rectngle(p);
        Rectngle rec3 = new Rectngle(45, 21);
        Rectngle rec4 = new Rectngle(p, 12, 34);
        Rectngle rec5 = new Rectngle(new Point(5, 4));
        rec2.move(15, 62);

        System.out.print("area of rec4 equals "+rec4.getArea()+", rec1 has origin in("+rec1.origin.x+", "+rec1.origin.y+") ");
    }
}
