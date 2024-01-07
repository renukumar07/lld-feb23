package accessModifiers;

public class Student {
    public String name;

    int batchId; // default

    protected double psp;

    private String universityName;



    void doSomething(){
        universityName = "Deepak";
    }

    public Student(){
        name = "Saptarshi";
        batchId = 123;
        psp = 98.0;
        universityName = "XYZ";
    }

    public Student(String name) {
        this.name = name;
    }

    //Parameterized constructors.
    public Student(String studentName, int batch, double marks, String college){
        name = studentName;
        batchId = batch;
        psp = marks;
        universityName = college;
    }

    public Student(String name, int batchId){
        this.name = name;
        this.batchId = batchId;
    }

    public Student(Student st){
        this.name = st.name;
        this.batchId = st.batchId;
        this.psp = st.psp;
    }
}
