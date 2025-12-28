package exercises.exceptions.ex10;

public class Registration {

    public void validate(String name, int age, String email)
            throws IllegalArgumentException, InvalidAgeException, InvalidEmailException {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }

        if (email == null || !email.contains("@")) {
            throw new InvalidEmailException("Invalid email. Must contain '@'.");
        }

        System.out.println("Registration completed successfully!");
    }
}