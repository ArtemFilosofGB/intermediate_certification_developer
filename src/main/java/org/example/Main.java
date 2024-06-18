package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanFriendsMain registry = new HumanFriendsMain();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPet Registry Menu:");
            System.out.println("1. Add new animal");
            System.out.println("2. Show registered Pets and Packs");
            System.out.println("3. Show pet and show commands");
            System.out.println("4. Train command for pet");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registry.addPet();
                    break;
                case 2:
                    registry.showPetsPacks();
                    break;
                case 3:
                    registry.ShowPatAndCommand();
                    break;
                case 4:
                    registry.TrainCommandForPet();
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
