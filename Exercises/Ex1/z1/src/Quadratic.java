import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a, b, c, x0, x1;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        double discriminant = b*b-4*a*c;

        if (discriminant < 0) {
            System.out.println("negative discriminant");
            return;
        }
        else if (discriminant == 0){
            System.out.println("same roots");
            x0=-b/(2*a);
            x1=x0;
        }
        else {
            x0=(-b-Math.sqrt(discriminant))/(2*a);
            x1=(-b+Math.sqrt(discriminant))/(2*a);
        }

        System.out.println(x0+" "+x1);
    }
}
