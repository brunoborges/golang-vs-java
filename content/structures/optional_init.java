public class Student {
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }
}

var student = new Student("John");