public class RectanglePlusdemo {
    public static void main(String[] args) {
        RectanglePlus rec1 = new RectanglePlus();
        RectanglePlus rec2 = new RectanglePlus(new Point(), 3, 4);
        RectanglePlus rec3 = new RectanglePlus(new Point(4, 5));
        RectanglePlus rec4 = new RectanglePlus(89, 4);

        rec4.move(34,134);

        System.out.println(rec3.isLargerThan(rec2));

        try {
            RectanglePlus rec5 = (RectanglePlus) rec4.clone();
            System.out.println("rec5 has area "+ rec5.getArea()+", rec4 has area "+rec4.getArea());
            rec4.move(1,1);
            System.out.println("rec5 hs origin "+ rec5.origin.x+" "+rec5.origin.y+", rec4 has origin"+ rec4.origin.x+" "+rec4.origin.y);
            if (rec5.equals(rec4))
                System.out.println("rec5 & rec4 are equal");
            else
                System.out.println("rec5 & rec4 are not equal");
        } catch (CloneNotSupportedException e) {
            System.out.println("error while cloning");
        }

        System.out.println(rec3.getClass());

        System.out.println(rec2.hashCode());

        System.out.println(rec1.toString());
    }




}
