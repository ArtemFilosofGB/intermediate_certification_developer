package org.example;

public class PackAnimal extends Animal{
    private Integer LoadСapacity;

    public PackAnimal(String name, int age, Integer LoadСapacity) {
        super(name, age);
        this.LoadСapacity = LoadСapacity;
    }

    public String getLoadСapacity() {
        return LoadСapacity.toString();
    }

    public String getCommands() {
        return super.getCommands() + ", Load Capacity: " + getLoadСapacity();
    }
}
