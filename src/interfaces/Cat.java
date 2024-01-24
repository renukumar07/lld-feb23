package interfaces;

public class Cat implements Animal{
    public void eat() {
        System.out.println("Cat is eating");
    }

    public int walk() {
        System.out.println("Cat is walking");
        return 0;
    }

    public void meow(){
        System.out.println("meow");
    }

    public void run(){
        System.out.println("Cat is running");
    }
}
