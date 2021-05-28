package challenge;

public class Client {

    public static void main(String[] args) throws Exception {

        AnimalFactoryInterface animalFactory = new AnimalFactory();

        Animal duck = animalFactory.getAnimal(AnimalType.DUCK);
        duck.eat();
        duck.walk();

        Animal tiger = animalFactory.getAnimal(AnimalType.TIGER);
        tiger.eat();
        tiger.walk();

        Animal lion = animalFactory.getAnimal(AnimalType.LION);
        lion.eat();
        lion.walk();

    }
}
