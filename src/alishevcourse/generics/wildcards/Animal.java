package alishevcourse.generics.wildcards;

public class Animal {
    private int id;
    // создаём конструктор по умолчанию, так у класса Dog при наседовании должен быть конструктор
    // но конструктора по умолчанию не было
    public Animal(){}

    public void eat() {
        System.out.println("Animal is eating...");
    }
    public Animal(int id) {
        this.id = id;
    }

    public String toString() {
        return String.valueOf(id);
    }
}
