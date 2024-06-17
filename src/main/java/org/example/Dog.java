package org.example;

public class Dog extends Pets {
    private String breed;

    public Dog(String name, int age, String type) {
        super(name, age, type);
        this.breed = breed;
    }


    public Dog(String name, int age, String type, String breed) {
        super(name, age, type);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
