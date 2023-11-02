package homework7;

public class Employee {
    private int id;
    protected String surname;
    int age;
    public double salary;

    public Employee(int id, String surname, int age, double salary) {
        this.id = id;
        this.age = age;
        this.surname = surname;
        this.salary = salary;
    }

    private Employee(int id, int age, String surname, double salary) {
        this.id = id;
        this.age = age;
        this.surname = surname;
        this.salary = salary;
    }

    Employee(double salary, int id, int age, String surname) {
        this.id = id;
        this.age = age;
        this.surname = surname;
        this.salary = salary;
    }

    public void doubleSalary() {
        this.salary *= 2;
    }
}
