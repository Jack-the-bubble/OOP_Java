import java.util.Scanner;

public class Stones {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 10000000 || N < 1){

            return;
        }

        if (N%2 == 1)
            System.out.print("Alice");
        else
            System.out.print("Bob");
    }
}
