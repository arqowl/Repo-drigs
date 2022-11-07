package inheritance.example1;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth,
            String coat) {
        super(name, 1, 1, size, weight);  //brain and body already have value of 1(parameter not necessary)
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    //The subclass inherits fields from the superclass
     //methods from the superclass also get inherited.
    //super: initializes fields of the superclass animal on a constructor.

    //we can override methods from the animal class
    //Dogs eat in a specific way, just eating is too generic. They chew their food.
    // we can make a method that exists in the Animal class, but make it unique in the Dog class.

    public void chew(){
        System.out.println("Chews food");
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);  //calling function move(from Animal class because of super keyword)
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10); //calling function move(we have overwriten the function move in dog class)
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override  //tells compiler that this method was overwriten
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();  //calls eat method from superclass.
    }

    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

   
   

   
    
    
}
