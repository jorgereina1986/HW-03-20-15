package nyc.c4q.jorgereina1986;

/**
 * Created by Jorge Reina and Elvis Boves.
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int fib_1 = 0;
        int fib_2 = 1;
        int answer = 0;
        System.out.println("Please enter");
        int enterValue = input.nextInt();

        if (enterValue == 1)
            System.out.println(fib_1);

        else if (enterValue == 2)
            System.out.println(fib_2);

        else {
            answer = fib_1 + fib_2;
            for (int i = 3; i < enterValue; i++) {

                fib_1 = fib_2;
                fib_2 = answer;
                answer = fib_1 + fib_2;

            }
            System.out.println(answer);
        }
    }
}