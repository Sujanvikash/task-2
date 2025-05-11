// Base class
class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass
class Employee extends Person {
    String employeeID;
    double salary;

    // Constructor for Employee using super
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Call to superclass constructor
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployeeInfo() {
        displayPersonInfo(); // Call to base class method
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}
