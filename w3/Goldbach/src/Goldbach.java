import java.util.Arrays;
import java.util.Scanner;

public class Goldbach {

    public static int[] findPrimes(int max) {
        int[] primes = new int[max];
        int index = 0, isP;
        for (int i = 2; i < max; i++) {
            isP = 1;
            for (int j = 0; j < index; j++) {
                if (i % primes[j] == 0) {
                    isP = 0;
                    break;
                }
            }
            if (isP == 1) {
                primes[index] = i;
                index++;
            }
        }
        int[] realPrimes = new int[index+1];
        realPrimes[0] = index+1; //first element - number of elements with primes[0]
        for (int i = 1; i < index+1; i++) {
            realPrimes[i] = primes[i-1];
        }
        return realPrimes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] answers = new int[n*16000+n*2];
        int mainIndex = 0;
        int size, wasAlready;
        int factors;
        for (int i = 0; i < n; i++) {
            factors = 0;
            answers[mainIndex] = scanner.nextInt();
            int[] myPrimes = findPrimes(answers[mainIndex]);
            size = myPrimes[0];
            for (int j = 1; j < size-1; j++) {
                for (int x = 1; x <= size-1; x++) {
                    if (myPrimes[j] + myPrimes[x] == answers[mainIndex]) {
                        wasAlready = 0;
                        for (int k = mainIndex + 1; k < mainIndex + 1 + factors; k++) {
                            if (myPrimes[x] == answers[k] || myPrimes[j] == answers[k]) {
                                wasAlready = 1;
                                break;
                            }
                        }
                        if (wasAlready == 0) {
                            factors++;
                            answers[mainIndex+factors] = myPrimes[j];
                            factors++;
                            answers[mainIndex+factors] = myPrimes[x];

                        }
                        break;
                    }
                }
            }
            for (int j = factors; j > 0; j--) {
                answers[mainIndex+1 + j]=answers[mainIndex+j];
            }
            answers[mainIndex+1] = factors;
            mainIndex+= factors+2;

        }
        for (int i = 0; i < mainIndex; i++) {
            i++;
            System.out.println(answers[i-1]+" has "+answers[i]/2+" representation(s)");
            for (int j = i+1; j < i+answers[i]; j= j+2) {
                System.out.println(answers[j]+"+"+answers[j+1]);
            }
            System.out.println("");
            i=i+answers[i];
        }



    }
}
