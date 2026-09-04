class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Salary: ₹%.2f%n", salary);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloperDetails() {
        displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        System.out.println("===== EMPLOYEE MANAGEMENT SYSTEM =====");

        Developer developer = new Developer(
            "Riya",
            101,
            50000,
            "Java"
        );

        developer.displayDeveloperDetails();
    }
}
