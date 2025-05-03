public class Employee {
    int employeeId;
    String name;
    String role;
    double salary;
    String workSchedule;

    public Employee(int employeeId, String name, String role, double salary, String workSchedule) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.workSchedule = workSchedule;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId +
               ", Name: " + name +
               ", Role: " + role +
               ", Salary: RM" + salary +
               ", Schedule: " + workSchedule;
    }
}
