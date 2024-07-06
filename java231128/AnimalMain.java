package java231128;

public class AnimalMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Whale whale = new Whale();
        Shark shark = new Shark();
        Penguin penguin = new Penguin();
        Eagle eagle = new Eagle();


        Mammals[] mammals = new Mammals[]{dog, cat, whale};
        Birds[] birds = new Birds[]{penguin, eagle};
        Fishes[] fishes = new Fishes[]{shark};
        Waterlife[] waterlives = new Waterlife[]{whale, shark, penguin};


/*
        for (Animal a : animals) {
            a.cry();
        }
*/

        for (int i = 0; i < mammals.length; i++) {
            mammals[i].eat();
            mammals[i].cry();
            mammals[i].move();

            if (mammals[i] instanceof Dog) {
                Dog tmp = (Dog) mammals[i];
                tmp.stay();
            }

            if (mammals[i] instanceof Cat) {
                Cat tmp = (Cat) mammals[i];
                tmp.scratch();
            }

            if (mammals[i] instanceof Whale) {
                Whale tmp = (Whale) mammals[i];
                tmp.swim();
            }
            System.out.println();

        }

        for (int i = 0; i < birds.length; i++) {
            birds[i].eat();
            birds[i].cry();
            birds[i].move();

            if (birds[i] instanceof Penguin) {
                Penguin tmp = (Penguin) birds[i];
                tmp.swim();
            }

            if (birds[i] instanceof Eagle) {
                Eagle tmp = (Eagle) birds[i];
                tmp.fly();
            }
            System.out.println();

        }

        for (int i = 0; i < fishes.length; i++) {
            fishes[i].eat();
            fishes[i].cry();
            fishes[i].move();

            if (fishes[i] instanceof Shark) {
                Shark tmp = (Shark) fishes[i];
                tmp.bite();
                tmp.waterAction();
            }
        }
        System.out.println();


        for (int i = 0; i < waterlives.length; i++) {

            if (waterlives[i] instanceof Whale) {
                Whale tmp = (Whale) waterlives[i];
                tmp.waterAction();
            }

            if (waterlives[i] instanceof Penguin) {
                Penguin tmp = (Penguin) waterlives[i];
                tmp.waterAction();
            }

            if (waterlives[i] instanceof Shark) {
                Shark tmp = (Shark) waterlives[i];
                tmp.waterAction();
            }
            System.out.println();

        }


    }
}
