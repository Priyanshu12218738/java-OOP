class SalaryCalculator {
    void calculateSalary() {
        System.out.println("Salary calculated");
    }
}

class EmployeeRepository {
    void save() {
        System.out.println("Employee saved");
    }
}

class EmailService {
    void sendEmail() {
        System.out.println("Email sent");
    }
}

class HighCohesionExample {
    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        EmployeeRepository repository = new EmployeeRepository();
        EmailService emailService = new EmailService();

        calculator.calculateSalary();
        repository.save();
        emailService.sendEmail();
    }
}