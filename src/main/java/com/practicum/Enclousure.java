package com.practicum;

import javax.xml.namespace.QName;

public class Enclousure<V extends Animal> {
    V item;
}

class Animal {
    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void groom() {
        System.out.println("Grooming " + this.toString());
    }

}


class Mammal extends Animal {

    public Mammal(String name, String species) {
        super(name, species);
    }

    @Override
    public String toString() {
        return String.format("Mammal name = %s", name);
    }
}

class Lion extends Animal {

    public Lion(String name, String species) {
        super(name, species);
    }

    @Override
    public String toString() {
        return String.format("Lion name = %s", name);
    }
}
