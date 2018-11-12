public class RandomSeqLotto {
    public static void main(String[] args) {
        int[] Tab= new int[6];
        for (int i = 0; i < 6; i++) {
            Tab[i]=1+(int)(Math.random()*48);
            if (i > 0){
                for (int a = i-1; a > 0; a--){
                    if (Tab[a] == Tab[i])
                        i--;
                }
            }
        }
        for (int i = 0; i < 6; i++)
            System.out.print(Tab[i]+" ");
    }
}
