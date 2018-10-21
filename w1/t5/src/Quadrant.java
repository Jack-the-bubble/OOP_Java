import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x, y;
        x=scanner.nextInt();
        y=scanner.nextInt();
        if (x < -1000 || x > 1000 || x == 0)
            return;
        if (y < -1000 || y > 1000 || y == 0)
            return;
        if (x > 0) {
            if (y > 0)
                System.out.println(1);
            else
                System.out.println(4);
        }
        else {
            if (y > 0)
                System.out.println(2);
            else
                System.out.println(3);
        }
    }
}
