package accessModifiersCheck;

import accessModifiers.Student;

public class ChildStudent extends Student {
    public void demo(){
        name = "Sandeep";
        //batchId = 456;
        psp = 80.80; // psp is protected, protected is accessible with in the child class outside the package
        //universityName = "XYZ"; // private
    }
}
