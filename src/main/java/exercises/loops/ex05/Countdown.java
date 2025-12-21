package exercises.loops.ex05;

public class Countdown {
    /**
     * Exercício: Contagem decrescente
     * Imprime uma contagem decrescente de 10 até 0 usando while.
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
