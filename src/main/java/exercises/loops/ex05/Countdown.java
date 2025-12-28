package exercises.loops.ex05;

public class Countdown {
    /**
     * Exercise: Countdown
     * Print a countdown from 10 to 0 using a while loop.
     */
    public static void main(String[] args) {

        int count = 10;

        System.out.println("Countdown from 10 to 0:");

        while (count != -1) {
            System.out.println("Number: " + count);
            count--;
        }
    }
}
