
class Person {
    String name;
    int age;
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Student2 extends Person {
    String studentId;
    void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }
    public static void main(String[] args) {
        Student2 student = new Student2();
        student.name = "Dipanshi";
        student.age = 19;
        student.studentId = "2400320100429";
        student.display();
    }
}
