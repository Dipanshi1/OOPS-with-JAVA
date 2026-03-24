public class Student {
    int rollNo;
    String name, course;
    Student(int r, String n, String c){
        rollNo = r;
        name = n;
        course = c;
    }
    void display(){
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
    public static void main (String[] args){
        Student s1 = new Student(429, "Dipanshi Gupta", "BTech");
        Student s2 = new Student (100, "xyz", "BTech");
        System.out.println("Student1 Details: ");
        s1.display();
        System.out.println();
        System.out.println("Student2 Details: ");
        s2.display();
    }  }
