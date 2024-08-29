package cse
class Animal {
    public void move() {
        System.out.println("The animal moves.");
    }
}

class Cheetah extends Animal {
   
    public void move() {
        System.out.println("The cheetah runs.");
    }
}

public class animal {
    public static void main(String[] args) {
        new Cheetah().move();
    }
}

