package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetReg {
    private List<Animal> pets = new ArrayList<>();

    public void addPet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pet type (Dog/Cat):");
        String type = scanner.nextLine();

        System.out.println("Enter pet name:");
        String name = scanner.nextLine();

        System.out.println("Enter pet age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (type.equalsIgnoreCase("Dog")) {
            System.out.println("Enter dog breed:");
            String breed = scanner.nextLine();
            pets.add(new Dog(name, age, breed));
        } else if (type.equalsIgnoreCase("Cat")) {
            System.out.println("Enter cat color:");
            String color = scanner.nextLine();
            pets.add(new Cat(name, age, color));
        } else {
            System.out.println("Invalid pet type.");
        }
        try (Counter counter = new Counter()) {
            counter.add();
            // ... (Rest of the code)
        } catch (Exception e) {
            System.err.println("Error using Counter: " + e.getMessage());
        }
    }


    public void showCommands(Animal pet) {
        System.out.println("Commands for " + pet.getName() + ":");
        System.out.println("1. Make sound");
        // Add more commands as needed
    }

    public void trainPet(Animal pet) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter new command:");
        String command = scanner.nextLine();
        // Implement logic to add command to pet's command list
    }

    public void showPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets registered yet.");
            return;
        }

        for (Animal pet : pets) {
            System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge());
            // Display additional pet details based on type
        }
    }

    public static void main(String[] args) {
        PetReg registry = new PetReg();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPet Registry Menu:");
            System.out.println("1. Add new pet");
            System.out.println("2. Show registered pets");
            System.out.println("3. Select pet and show commands");
            System.out.println("4. Train pet");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registry.addPet();
                    break;
                case 2:
                    registry.showPets();
                    break;
                case 3:
                    // Implement logic to select pet and show commands
                    break;
                case 4:
                    // Implement logic to select pet and train it
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

