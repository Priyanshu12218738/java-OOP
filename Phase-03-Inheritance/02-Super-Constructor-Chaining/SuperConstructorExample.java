class Person {
    Person(String name) {
        System.out.println("Person name is: " + name);
    }
}

class Employee extends Person {
    Employee(String name, int id) {
        super(name);
        System.out.println("Employee ID is: " + id);
    }
}

class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", 101);
    }
}