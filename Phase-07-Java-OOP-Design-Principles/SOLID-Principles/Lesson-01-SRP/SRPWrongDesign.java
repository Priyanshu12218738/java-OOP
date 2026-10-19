class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Salary: " + salary);
    }

    void saveToDatabase() {
        System.out.println("Employee saved to database");
    }

    void generatePayslip() {
        System.out.println("Payslip generated");
    }

    void sendEmail() {
        System.out.println("Email sent");
    }
}

class SRPWrongDesign {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahul", 50000);
        employee.calculateSalary();
        employee.saveToDatabase();
        employee.generatePayslip();
        employee.sendEmail();
    }
}