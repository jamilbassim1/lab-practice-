/**
 * Student
 */
public class Student {

    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of Student is " + this.name);
        System.out.println("The name of Student is " + this.age);

    }
}

public class Oop {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = new Student();
        s1.age = 24;
        s1.getInfo();
        Student s2 = new Student();
        s2.name = "jamie";
        s2.age = 22;
        s2.getInfo();
    }

    
}