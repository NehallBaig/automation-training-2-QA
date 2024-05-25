package class25_05StaticClassObjects;

public class Student {

    String name;
    int age;
    String instanceVariableAddress;
    static String address = "Pakistan";

    // Constructor

    //Student("nehal", 22);
    //Student("naveed", 20);
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void studentDetails(){
        System.out.println("Student name "+name);
        System.out.println("Student age "+age);
        System.out.println("address "+address);
    }
}
