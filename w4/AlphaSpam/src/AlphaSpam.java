import java.util.Scanner;

public class AlphaSpam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String full = scanner.next();
        int lenght = full.length();
        double white = 0, low = 0, Upp = 0, syms = 0;
        for (int i = 0; i < lenght; i++) {
            if (full.substring(i, i+1).matches("_")) {
                white++;
            } else if (full.substring(i, i+1).matches("[!-@?]")) {
                syms++;
            } else if (full.substring(i, i+1).matches("[{-~?]")) {
                syms++;
            } else if (full.substring(i, i+1).matches("[Z-a?]")) {
                if (full.substring(i, i + 1).matches("Z")) {
                    Upp++;
                } else if (full.substring(i, i + 1).matches("a")) {
                    low++;
                } else {
                    syms++;

                }
            }  else if (full.substring(i, i+1).matches("[b-z?]")) {
                low++;
            } else if (full.substring(i, i+1).matches("[A-Y?]")) {
                Upp++;
            }
        }
        System.out.println((white/lenght));
        System.out.println((low/lenght));
        System.out.println((Upp/lenght));
        System.out.println((syms/lenght));

    }
}
