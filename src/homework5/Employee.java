package homework5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;

    public Employee(int id, String surname, int age, double salary) {
        this.id = id;
        this.age = age;
        this.surname = surname;
        this.salary = salary;
    }

    public void doubleSalary() {
        this.salary *= 2;
    }
}
