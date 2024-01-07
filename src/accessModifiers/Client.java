package accessModifiers;

public class Client {

    public static void main(String[] args) {
        int x = 10;
        Student student = new Student();
        // new keyword is responsible for creating a new object
        // new keyword creates a new memory/object in the HEAP
        // DOT operator

        //student.universityName = "ABC";
        student.name = "Deepak"; //public
        student.psp = 90.0; // protected
        student.batchId = 123; //default;



    }
}
