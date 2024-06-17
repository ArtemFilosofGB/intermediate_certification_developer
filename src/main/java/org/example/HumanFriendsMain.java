package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanFriendsMain {
    private static List<Pets> pets = new ArrayList<>();
    private static List<PackAnimal> packAnimals = new ArrayList<>();

    public void addPet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pet type (Pet/Pack):");
        String type = scanner.nextLine();

        System.out.println("Enter animal name:");
        String name = scanner.nextLine();

        System.out.println("Enter animal age:");
        int age = scanner.nextInt();
        scanner.nextLine();
/*
        if (type.equalsIgnoreCase("Dog")) {
            System.out.println("Enter dog breed:");
            String breed = scanner.nextLine();
            pets.add(new Dog(name, age, breed));

        } else if (type.equalsIgnoreCase("Cat")) {
            System.out.println("Enter cat color:");
            String color = scanner.nextLine();
            pets.add(new Cat(name, age, color));

        } else*/
        if (type.equalsIgnoreCase("Pet")) {
            System.out.println("Enter pet breed:");
            String breed = scanner.nextLine();
            pets.add(new Pets(name, age, breed));

        } else if (type.equalsIgnoreCase("Pack")) {
            System.out.println("Enter load capacity:");
            int loadCapacity = scanner.nextInt();
            scanner.nextLine();
            packAnimals.add(new PackAnimal(name, age, loadCapacity));
        } else {
            System.out.println("Invalid pet type.");
        }
        /*
        try (Counter counter = new Counter()) {
            counter.add();
            // ... (Rest of the code)
        } catch (Exception e) {
            System.err.println("Error using Counter: " + e.getMessage());
        }*/
    }


    public void showCommands(Animal pet) {
        System.out.println("Commands for " + pet.getName() + ":");
        System.out.println("1. Make sound");
        System.out.println("2. Take five");
        System.out.println("3. Jump");

    }

    public void trainPet(Pets pet) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter new command:");
        String command = scanner.nextLine();

        pet.commands.add(command);

        System.out.println("Command added successfully.");
    }

    public void showPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets registered yet.");
            return;
        } else {

            System.out.println("Registered pets:");
            for (Animal pet : pets) {
                System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge());
                // Display additional pet details based on type
            }
        }
        if(packAnimals.isEmpty()) {
            System.out.println("No pets registered yet.");
        } else {
            System.out.println("Registered pets:");
            for (PackAnimal pet : packAnimals) {
                System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge() + ", Load Capacity: " + pet.getLoadСapacity());
            }
        }
    }
    //3 Select pet and show commands
    private static void SelectPatAndCommand() {
        for (Pets pet : pets) {
            System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge() + ", Breed: " + pet.getBreed() + ", Commands: " + pet.getCommands());
        }
        for(PackAnimal packAnimal : packAnimals) {
            System.out.println("Name: " + packAnimal.getName() + ", Age: " + packAnimal.getAge() + ", Load Capacity: " + packAnimal.getLoadСapacity() + ", Commands: " + packAnimal.getCommands());
        }
    }


    public static void main(String[] args) {
        HumanFriendsMain registry = new HumanFriendsMain();
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
                    SelectPatAndCommand();
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

