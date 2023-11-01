package homework5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Fisenko", 20, 1000);
        Employee employee2 = new Employee(2, "Smith", 30, 2000);

        employee1.doubleSalary();
        employee2.doubleSalary();

        System.out.println("Employee 1 Salary: " + employee1.salary);
        System.out.println("Employee 2 Salary: " + employee2.salary);
    }
}
