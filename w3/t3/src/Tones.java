import java.util.Arrays;
import java.util.Scanner;


public class Tones {
    public static String[] createScale(int x) {
        String[] scale = new String[8];
        String[] base = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        scale[0]=base[(0+x)%12];
        scale[1]=base[(2+x)%12];
        scale[2]=base[(4+x)%12];
        scale[3]=base[(5+x)%12];
        scale[4]=base[(7+x)%12];
        scale[5]=base[(9+x)%12];
        scale[6]=base[(11+x)%12];
        scale[7]=base[(12+x)%12];
        return scale;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] Tab = new String[n];
        String[] newScale;
        int good;
        int none = 0;
        for (int i = 0; i < n; i++) {
            Tab[i] = scanner.next();
        }

        for (int i = 0; i < 12; i++) {
            good = 1;
            newScale = createScale(i);
            for (int j = 0; j < 8; j++) {

                if (!Arrays.asList(newScale).contains(Tab[j])) {
                    good = 0;
                    break;
                }
            }
            if (good == 1) {
                System.out.print(newScale[0]+" ");
                none = 1;
            }
        }
        if (none == 0) {
            System.out.print("none");
        }


    }
}
