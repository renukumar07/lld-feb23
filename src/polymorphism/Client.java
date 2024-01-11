package polymorphism;

public class Client{
    public static void main(String[] args) {
        A a = new C();
        // type of the variable - A
        // compiler only knows about A
        // Object is created at run time.
        //a.companyName = "company"; // Compile Time Error

        a.name = "Rajat";
        a.age = 25;

        //C c = new A();
        // Can't store the object of parent class into child class reference;
        //c.companyName = "Google";

        //C c = (C) new A();
        //Exception in thread "main" java.lang.ClassCastException: class polymorphism.A cannot be cast to class polymorphism.C (polymorphism.A and polymorphism.C are in unnamed module of loader 'app')
        //c.companyName = "Google";
    }
}
