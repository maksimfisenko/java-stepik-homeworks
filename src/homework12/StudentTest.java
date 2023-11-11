package homework12;

public class StudentTest {
    public void compare1(Student s1, Student s2) {
        if (s1.studentId == s2.studentId && s1.name.equals(s2.name) && s1.surname.equals(s2.surname) && s1.yearOfStudying == s2.yearOfStudying) {
            System.out.println("Students are equal");
        } else {
            System.out.println("Students are not equal");
        }
    }
    public void compare2 (Student s1, Student s2) {
        if (s1.studentId == s2.studentId) {
            if (s1.name.equals(s2.name)) {
                if (s1.surname.equals(s2.surname)) {
                    if (s1.yearOfStudying == s2.yearOfStudying) {
                        System.out.println("Students are equal");
                    } else {
                        System.out.println("Student years of studying are not equal");
                    }
                } else {
                    System.out.println("Student surnames are not equal");
                }
            } else {
                System.out.println("Student names are not equal");
            }
        } else {
            System.out.println("Student IDs are not equal");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "John", "John", 2);
        Student s2 = new Student(1, "John", "Not John", 3);
        StudentTest test = new StudentTest();
        test.compare1(s1, s2);
        test.compare2(s1, s2);
    }
}
