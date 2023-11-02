package homework7;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Fisenko", 10, 10.05);
        Employee employee2 = new Employee(10.06, 1, 21, "Smith");

        employee1.doubleSalary();
        employee2.doubleSalary();
    }
}
