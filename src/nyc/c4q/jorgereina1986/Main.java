package nyc.c4q.jorgereina1986;


/**
 * Created by Jorge Reina on 4/3/15.
 */

public class Main {

    public static void main(String[] args) {

        int N = 15;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i % j == 0 || j % i == 0)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }


    }
}
