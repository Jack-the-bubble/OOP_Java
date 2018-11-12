import java.util.Scanner;

public class Duplo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        if (Y%2 == 0)
            System.out.print("possible");
        else
            System.out.print("impossible");
    }
}
