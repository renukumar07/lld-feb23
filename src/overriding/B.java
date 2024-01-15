package overriding;

public class B extends A{
//    String doSomething(){
//        System.out.println("Hello");
//        return null;
//    }
    //'doSomething()' in 'overriding.B' clashes with 'doSomething()' in 'overriding.A'; attempting to use incompatible return type

    void doSomething(){
        System.out.println("Hi");
    }
}
