package exercises.generics.ex2;

/**
 * 2. Simple Generic List — MyList<T>
 * ----------------------------------
 * Create a generic class MyList<T> that stores up to 5 elements in an internal array.
 * Methods:
 *  - void add(T value)
 *  - T get(int index)
 *  - int size()
 * Goal:
 * Test with MyList<String> and MyList<Integer>.
 */
public class Main {

    public static void main(String[] args) {

        MyList<String> textList = new MyList<>();
        MyList<Integer> numberList = new MyList<>();


        try {
            textList.add("João");
            textList.add("Carlos");
            textList.add("Dias");
            textList.add("Santos");
            textList.add("Juanito");

            System.out.println("=== String List ===");
            System.out.println("Value at index 0: " + textList.get(0));
            System.out.println("Size: " + textList.size());

            numberList.add(10);
            numberList.add(20);

            System.out.println("\n=== Integer List ===");
            System.out.println("Value at index 1: " + numberList.get(1));
            System.out.println("Size: " + numberList.size());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}