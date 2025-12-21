package exercises.loops.ex01;

public class EvenNumbersPrinter {

    /**
     * Exercício: Contar números pares
     * Escreve um programa que imprime todos os números pares entre 1 e 50.
     */
    public static void main(String[] args) {

        System.out.println("Even numbers between 1 and 50:");

        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}
