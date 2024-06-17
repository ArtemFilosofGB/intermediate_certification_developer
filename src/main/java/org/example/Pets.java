package org.example;

public class Pets extends Animal{
private String type;

    /**
     * Pats class constructor for Dogs, Cats, etc.
     * @param name String
     * @param age Int
     * @param type of Pet String
     */
    public Pets(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }
}
