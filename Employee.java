public class Employee {
    private int employeeId;
    private String name;
    private String role;
    private double salary;
    private String schedule;

    public Employee(int employeeId, String name, String role, double salary, String schedule) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return name + " | Role: " + role + " | Salary: $" + salary + " | Schedule: " + schedule;
    }
}
