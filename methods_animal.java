package cse;
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
    public void sound() {
        System.out.println("This animal makes a sound.");
    }
}
class Lion extends Animal {
    public void eat() {
        System.out.println("The lion eats meat.");
    }
    public void sound() {
        System.out.println("The lion roars.");
    }
}
class Tiger extends Animal {
    public void eat() {
        System.out.println("The tiger eats meat.");
    }
    public void sound() {
        System.out.println("The tiger growls.");
    }
}
class Panther extends Animal {
    public void eat() {
        System.out.println("The panther eats meat.");
    }
    public void sound() {
        System.out.println("The panther growls.");
    }
}
public class method_animal{
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal panther = new Panther();
        lion.eat();
        lion.sound();
        tiger.eat();
        tiger.sound();
        panther.eat();
        panther.sound();
    }
}

