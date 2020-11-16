package B7_Abstract_and_Interface.Animal_and_interfaceEdible.Animal;

import B7_Abstract_and_Interface.Animal_and_interfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }


}