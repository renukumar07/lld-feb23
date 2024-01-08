package inheritance;

public class C extends B{
    C(){
        System.out.println("Constructor of C");
    }

    C(String name){
        // WIthout super -> default constructor of the parent class will be executed.
        System.out.println("Constructor of C "+name);
    }

    C(String name, int x){
        System.out.println("Constructor of C "+name+" "+x);
    }
}
