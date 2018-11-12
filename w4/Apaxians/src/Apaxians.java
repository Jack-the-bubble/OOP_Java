import java.util.Scanner;

public class Apaxians {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(), out = "";
        out+=name.charAt(0);
        for (int i = 0; i < name.length()-1; i++) {
            if (name.charAt(i) != name.charAt(i+1))
                out+=name.charAt(i+1);
        }
        System.out.println(out);
    }
}
