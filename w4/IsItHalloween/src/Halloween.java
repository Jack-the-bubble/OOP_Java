import java.util.Scanner;

public class Halloween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String man = scanner.nextLine();
        if (man.matches("OCT 31") || man.matches("DEC 25")) {
            System.out.println("yup");
        }
        else
            System.out.println("nope");
    }
}
