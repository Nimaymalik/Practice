package DSA_Round2.OOPs;

class Employee {
    private String name;
    private float salary;

    // Constructor
    Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;

    }

    // getters method
    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    // setters method
    public void setame(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name is: " + name);
        System.out.println("Salary is: " + salary);
    }

}

public class GettersSetters {
    public static void main(String[] args) {
        Employee emp = new Employee("Nimay", 100000);
        emp.displayDetails();
    }

}
