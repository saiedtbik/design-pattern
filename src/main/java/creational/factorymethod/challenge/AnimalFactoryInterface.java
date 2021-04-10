package creational.factorymethod.challenge;

import java.util.Objects;

public interface AnimalFactoryInterface {
    Animal getAnimal(AnimalType type) throws Exception;
}


class AnimalFactory implements AnimalFactoryInterface {

    public  Animal getAnimal(AnimalType type) throws Exception {
        Animal animal ;
        if (Objects.isNull(type)) {
            throw new Exception("Animal type is null and can not be initiated");
        }
        switch (type) {
            case DUCK:
                animal = new Duck();
                break;
            case TIGER:
                animal = new Tiger();
                break;
            default:
                throw new Exception("Animal with type" + type + "can not be initiated");
        }
        return animal;
    }

}
