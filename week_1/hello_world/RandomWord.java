import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        boolean isSwap;
        String cand;
        String champ = "";
        int i = 1;
        while (!StdIn.isEmpty()) {
            cand = StdIn.readString();
            isSwap = StdRandom.bernoulli((double) 1 / i);
            if (isSwap) {
                champ = cand;
            }
            i += 1;
        }
        StdOut.println(champ);
    }
}
