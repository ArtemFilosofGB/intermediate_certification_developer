package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pets extends Animal{
private String breed;
public List<String> commands = new ArrayList();



    /**
     * Pats class constructor for Dogs, Cats, etc.
     * @param name String
     * @param age Int
     * @param breed of Pet String
     */
    public Pets(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public String getCommands() {
        return commands.toString();
    }
}
