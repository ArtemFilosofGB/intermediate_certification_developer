package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanFriendsMain {
    private static List<Pets> pets = new ArrayList<>();
    private static List<PackAnimal> packAnimals = new ArrayList<>();
    Counter counter = new Counter();

    public void addPet() {
        Scanner scanner = new Scanner(System.in);
        String breed="";
        int loadCapacity = 0;

        System.out.println("Enter pet type (Pet/Pack):");
        String type = scanner.nextLine();

        System.out.println("Enter animal name:");
        String name = scanner.nextLine();

        System.out.println("Enter animal age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (type.equalsIgnoreCase("Pet")) {
            System.out.println("Enter pet breed:");
            breed = scanner.nextLine();
            pets.add(new Pets(name, age, breed));

        } else if (type.equalsIgnoreCase("Pack")) {
            System.out.println("Enter load capacity:");
            loadCapacity = scanner.nextInt();
            scanner.nextLine();
            packAnimals.add(new PackAnimal(name, age, loadCapacity));
        } else {
            System.out.println("Invalid pet type.");
        }

        try {
            if ((type.equalsIgnoreCase("Pet") || type.equalsIgnoreCase("Pack"))
                    && age > 0 && age < 100
                    && (!breed.equalsIgnoreCase("") || loadCapacity > 0) ){
                //System.out.println("Counter added.......");
                counter.add();
                counter.toString();
            } else {
                throw new Exception("Not all fields are filled correctly.");
            }
        } catch (Exception e) {
            System.out.println("Counter add error: " + e.getMessage());

        }
    }


    public void showPetsPacks() {
        if (pets.isEmpty()) {
            System.out.println("No pets registered yet.");
        } else {

            System.out.println("Registered pets:");
            for (Pets pet : pets) {
                System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge() + ", Breed: " + pet.getBreed());
            }
        }
        if (packAnimals.isEmpty()) {
            System.out.println("No pack animals registered yet.");
        } else {
            System.out.println("Registered pack animals:");
            for (PackAnimal pet : packAnimals) {
                System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge() + ", Load Capacity: " + pet.getLoadСapacity());
            }
        }
        System.out.println("Total animals = " + counter.getCount());
    }

    public void ShowPatAndCommand() {
        for (Pets pet : pets) {
            System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge() + ", Breed: " + pet.getBreed() + ", Commands: " + pet.getCommands());
        }
    }

    public void TrainCommandForPet() {
        ShowPatAndCommand();
        System.out.println("Enter pet name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Pets pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                trainPet(pet);
                break;
            }
        }
    }

    public void trainPet(Pets pet) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter new command:");
        String command = scanner.nextLine();

        pet.commands.add(command);

        System.out.println("Command added successfully.");
    }


}

