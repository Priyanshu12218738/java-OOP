class Employee {
    private final String name;
    private final double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }
}

class SalaryCalculator {
    void calculateSalary(Employee employee) {
        System.out.println("Salary: " + employee.getSalary());
    }
}

class EmployeeRepository {
    void save(Employee employee) {
        System.out.println(employee.getName() + " saved to database");
    }
}

class PayslipGenerator {
    void generate(Employee employee) {
        System.out.println("Payslip generated for " + employee.getName());
    }
}

class EmailService {
    void send(Employee employee) {
        System.out.println("Email sent to " + employee.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahul", 50000);

        new SalaryCalculator().calculateSalary(employee);
        new EmployeeRepository().save(employee);
        new PayslipGenerator().generate(employee);
        new EmailService().send(employee);
    }
}