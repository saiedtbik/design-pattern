package creational.factorymethod.challenge;

public interface Animal {
 void walk();
 void eat();
}

class Tiger implements  Animal{
    @Override
    public void walk() {
        System.out.println("Tiger is walking ...");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating ...");
    }
}

class Duck implements Animal{
    @Override
    public void walk() {
        System.out.println("Duck is walking ...");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating ...");
    }
}
