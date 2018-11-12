import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

public class MixUp {
    public static void main(String[] args)  throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("text1.in"));
        String all = "";
        Vector<String> myVec = new Vector<String>();
        int length = 0, sinWordEnd = 0, sinWordBeg = 0;


        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            all = sb.toString();
            all.replaceAll("[\\n\\r]+", " ");
            length = all.length();
            System.out.println(all.replaceAll("[\\n\\r]+", " "));
            String[] singles = all.split(" ");
            myVec.addAll(Arrays.asList(singles));
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            br.close();
        }








    }
}
