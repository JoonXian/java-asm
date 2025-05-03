import java.util.ArrayList;
import java.util.List;

public class EmployeeSystem {
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Hotel Employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
