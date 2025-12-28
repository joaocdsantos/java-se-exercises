package exercises.oop2.ex3;

public class Car extends Vehicle {

    private int numeroPortas;

    public Car(String nome, String modelo, int numeroPortas) {
        super(nome, modelo);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(" | Portas: " + getNumeroPortas());
    }
}
