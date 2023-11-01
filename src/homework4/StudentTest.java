package homework4;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentId = 1;
        student1.name = "Name1";
        student1.surname = "Surname1";
        student1.yearOfStudying = 1;
        student1.econAvg = 3.3f;
        student1.mathAvg = 2.0f;
        student1.engAvg = 4.0f;

        Student student2 = new Student();
        student2.studentId = 2;
        student2.name = "Name2";
        student2.surname = "Surname2";
        student2.yearOfStudying = 2;
        student2.econAvg = 3.8f;
        student2.mathAvg = 3.1f;
        student2.engAvg = 5.0f;

        Student student3 = new Student();
        student3.studentId = 3;
        student3.name = "Name3";
        student3.surname = "Surname3";
        student3.yearOfStudying = 3;
        student3.econAvg = 3.9f;
        student3.mathAvg = 4.1f;
        student3.engAvg = 3.2f;

        System.out.println("Student 1 avg: " + (student1.engAvg + student1.mathAvg + student1.mathAvg) / 3);
        System.out.println("Student 2 avg: " + (student2.engAvg + student2.mathAvg + student2.mathAvg) / 3);
        System.out.println("Student 3 avg: " + (student3.engAvg + student3.mathAvg + student3.mathAvg) / 3);
    }
}
