package exercises.matrix.ex14;

public class IdentityMatrix {
    /**
     * Exercício: Matriz identidade
     * Gera uma matriz identidade 5×5 usando ciclos aninhados.
     */
    public static void main(String[] args) {

        int size = 5;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }

        System.out.println("Identity Matrix " + size + "x" + size + ":");

        for (int[] number : matrix) {
            System.out.print("[ ");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(number[j] + " ");
            }
            System.out.println("]");
        }
    }
}