package overloading;

public class Client {
    public static void main(String[] args) {
        A a = new A();

        // Compile Time Polymorphism
        a.printHello();
        a.printHello("Scaler");

        a.scaler(10);
        Integer integer = Integer.valueOf(10);
        //Integer integer1 = 10;
        a.scaler(integer);

        a.scaler(a);
    }
}
