import java.util.Scanner;

public class Ladder {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double h, v;
        h=scanner.nextDouble();
        v=scanner.nextDouble();
        v=2*Math.PI*v/360.0;
        System.out.print((int) Math.ceil(h/Math.sin(v)));

    }
}
