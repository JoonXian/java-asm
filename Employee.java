public class Employee {
    static int counter = 1;  
    String id;
    String name;
    String role;
    double salary;
    String schedule;

    public Employee(String name, String role, double salary, String schedule) {
        this.id = String.format("A%03d", counter++);  
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.schedule = schedule;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Role: " + role +
               ", Salary: RM" + salary + ", Schedule: " + schedule;
    }
}
