package cie;

public class Student {

    public String usn;
    public String name;
    public int semester;

    public Student(String usn, String name, int semester) {

        this.usn = usn;
        this.name = name;
        this.semester = semester;
    }

    public void displayStudentDetails() {

        System.out.println("USN       : " + usn);
        System.out.println("Name      : " + name);
        System.out.println("Semester  : " + semester);
    }
}
