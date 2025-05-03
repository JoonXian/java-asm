import java.util.ArrayList;
import java.util.Scanner;

public class HotelEmployeeSystem {
    ArrayList list = new ArrayList();

    void add(Employee e) {
        list.add(e);
        System.out.println("Employee added successfully. ID: " + e.id);
    }

    boolean nameExists(String name) {
        for (Object obj : list) {
            Employee e = (Employee) obj;
            if (e.name.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    void showAll() {
        if (list.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\n===== Employee List =====");
        System.out.printf("%-5s %-10s %-15s %-15s %-10s %-15s%n", "No.", "ID", "Name", "Role", "Salary", "Schedule");
        System.out.println("--------------------------------------------------------------------------");

        int count = 1;
        for (Object obj : list) {
            Employee e = (Employee) obj;
            System.out.printf("%-5d %-10s %-15s %-15s RM%-9.2f %-15s%n",
                    count++, e.id, e.name, e.role, e.salary, e.schedule);
        }
    }

    void edit(String id, Scanner sc) {
        for (Object obj : list) {
            Employee e = (Employee) obj;
            if (e.id.equalsIgnoreCase(id)) {
                System.out.println("\nEditing Employee: " + e.name + " (ID: " + e.id + ")");

                System.out.print("New name [press Enter to keep current]: ");
                String name = sc.nextLine();
                if (!name.isEmpty()) {
                    if (nameExists(name)) {
                        System.out.println("Another employee with this name already exists.");
                    } else {
                        e.name = name;
                    }
                }

                System.out.print("New role [press Enter to keep current]: ");
                String role = sc.nextLine();
                if (!role.isEmpty()) e.role = role;

                System.out.print("New salary [enter -1 to keep current]: ");
                String salaryInput = sc.nextLine();
                if (!salaryInput.isEmpty()) {
                    double salary = Double.parseDouble(salaryInput);
                    if (salary > 0) e.salary = salary;
                }

                System.out.print("New schedule [press Enter to keep current]: ");
                String sched = sc.nextLine();
                if (!sched.isEmpty()) e.schedule = sched;

                System.out.println("✅ Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    void delete(String id) {
        for (int i = 0; i < list.size(); i++) {
            Employee e = (Employee) list.get(i);
            if (e.id.equalsIgnoreCase(id)) {
                list.remove(i);
                System.out.println("✅ Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
