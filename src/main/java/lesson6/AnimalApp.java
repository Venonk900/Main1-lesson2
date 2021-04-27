package lesson6;

public class AnimalApp {
    public static void main(String[] args){
        Dog dog = new Dog("белка");
        Cat cat = new Cat("абсент");
        Cat cat1 = new Cat("may");
        Shurk shurk = new Shurk("net");

        shurk.swim(9);

        dog.run(48);
        dog.swim(8);

        cat.run(140);
        cat.swim(9);

    }
}
