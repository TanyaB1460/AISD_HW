package hw7_2;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] moves = new int[n+1][];
        moves[0] = new int[0];

        for (int i = 1; i <= n; i++) {
            int k = sc.nextInt();
            moves[i] = new int[k];
            for (int j = 0; j < k; j++) {
                moves[i][j] = sc.nextInt();
            }
        }

        boolean[] isWinning = new boolean[n+1];
        isWinning[0] = false;

        for (int i = 1; i <= n; i++) {
            for (int move : moves[i]) {
                if (i - move >= 0 && !isWinning[i - move]) {
                    isWinning[i] = true;
                    break;
                }
            }
        }

        System.out.println(isWinning[n] ? "First" : "Second");
    }
}