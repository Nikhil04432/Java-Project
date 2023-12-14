
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        int f = 0, d = 0, attempt = 5;
        int maxRange = 100;
        int minRange = 1;
        Random ran = new Random();
        int a;
        int guess;

        System.out.println("________________________You have 4 attempts to guess a number_____________________ ");

        do {
            a = ran.nextInt((maxRange - minRange) + 1) + minRange;
            attempt--;

            if (attempt == 0) {
                System.out.println("Out of attempts. The correct number was " + a);
                break;
            }

            System.out.println("Guess a Number by entering any value : ");
            guess = as.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid Number. Exceeds the limit. Enter a proper number.");
                break;
            }

            if (a == guess) {
                System.out.println("What a guess! Congrats, you won!!! ");
                System.out.println("Number was " + a);
            } else {
                if (a < guess) {
                    for (int i = a; i < guess; i++) {
                        f++;
                    }
                    if (f >= 30) System.out.println("Guess is too low ");
                    else if (f <= 10) System.out.println("Guess is too high ");
                    else if (f <= 5) System.out.println("So close !!!!! ");
                } else if (a > guess) {
                    for (int i = guess; i < a; i++) {
                        d++;
                    }
                    if (d >= 30) System.out.println("Guess is too low ");
                    else if (d <= 10) System.out.println("Guess is too high ");
                    else if (d <= 5) System.out.println("So close !!!!! ");
                }

                System.out.println("Number was " + a);
            }

            if (attempt==1) {
                System.out.println("\nEnter 'Yes' to play the next round or any other key to exit: ");
                String st = as.next();

                if (!st.equalsIgnoreCase("Yes")) {
                    break;
                }

                attempt = 5;
            }

        } while (attempt > 0);
    }
}


