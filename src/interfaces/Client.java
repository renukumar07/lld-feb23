package interfaces;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.walk();
        animal.eat();

        Animal animal1 = new Animal() {
            public void eat() {

            }

            public int walk() {
                return 0;
            }
        };

        animal.run();
    }
}
