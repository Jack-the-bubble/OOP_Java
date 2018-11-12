import java.util.Scanner;

public class Maps {
    public static void main(String[] args){
        int x, y, z, i;
        x=0;
        y=0;
        Scanner scanner=new Scanner(System.in);

        String s= scanner.next();

        z=s.length();

        if (z>30 || z < 1)
            return;
//        for (int b =0 ; b < z; b++){
//            int example=(int)s.charAt(b)-48;
//            if (example != 0 & example != 1 & example != 2 & example != 3)
//                System.out.print("bla");
//                return;
//        }

//        System.out.print(z);
        for (int a=0;a < z ; a++) {
//            System.out.println(a+" "+x+" "+y);
            i=s.charAt(a)-48;
//            System.out.println("sprawdzam "+ i);
            switch ((int)(s.charAt(a))-48) {
                case 1:
//                    System.out.println("adding to x");
                    x = x + (int)Math.pow(2, z - a) / 2;
                    break;
                case 2:
//                    System.out.println("adding to y");
                    y = y + (int)Math.pow(2, z - a) / 2;
                    break;
                case 3:
//                    System.out.println("adding to both");
                    x = x + (int)Math.pow(2, z - a) / 2;
                    y = y + (int)Math.pow(2, z - a) / 2;
                    break;
                case 0:
                    break;
                 default:
                     return;
            }
        }
//        System.out.println(z);

        System.out.print(z+" "+x+" "+y);

    }
}
