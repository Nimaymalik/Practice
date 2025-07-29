package DSA_Round2.OOPs;

// wrapping up the data into a single unit data binding  

class Employee {
    private int id;
    private String name;

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Nimay");

        System.out.println("Employee name is:" + emp.getName());
        System.out.println("Employee id is:" + emp.getId());
    }

}
