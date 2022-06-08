package Static_Method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student = new Student(111, "Khánh");
        Student student1 = new Student(222, "Vũ");
        Student student2 = new Student(888, "Linh");
        student.display();
        student1.display();
        student2.display();
    }
}
