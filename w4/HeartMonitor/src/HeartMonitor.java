import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class HeartMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String wholeName = "";
            String[] line = scanner.nextLine().split(" ");
            int len = line.length, count = 0;
            double mean = 0;
            for (int i = 0; i < len; i++) {
                if ((int)line[i].charAt(0) > 64 && (int)line[i].charAt(0) < 123) {
                    wholeName+=line[i]+" ";
                    continue;
                }
                mean+=Double.parseDouble(line[i]);
                count++;
            }
            mean = mean / count;

            System.out.println(mean + " " + wholeName);

        }

    }
}
