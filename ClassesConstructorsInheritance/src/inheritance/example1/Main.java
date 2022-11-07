package inheritance.example1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        dog.eat();  // method eat was inherited from superclass animal to subclass dog
        dog.walk();
        dog.run();
       
    }
}
