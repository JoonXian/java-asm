public class Employee {
    int id;
    String name;
    String role;
    double salary;
    String schedule;

    public Employee(int id, String name, String role, double salary, String schedule) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.schedule = schedule;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Role: " + role + ", Salary: RM" + salary + ", Schedule: " + schedule;
    }
}
