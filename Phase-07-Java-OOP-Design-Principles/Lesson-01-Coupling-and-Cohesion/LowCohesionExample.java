class Employee {
    void calculateSalary() {
        System.out.println("Salary calculated");
    }

    void saveToDatabase() {
        System.out.println("Employee saved");
    }

    void sendEmail() {
        System.out.println("Email sent");
    }
}

class LowCohesionExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.calculateSalary();
        employee.saveToDatabase();
        employee.sendEmail();
    }
}