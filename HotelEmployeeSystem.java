import java.util.ArrayList;
import java.util.Scanner;

public class HotelEmployeeSystem {
    ArrayList<Employee> list = new ArrayList<>();

    void add(Employee e) {
        list.add(e);
        System.out.println("Employee added.");
    }

    void showAll() {
        if (list.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
    
        System.out.println("\n===== Employee List =====");
        System.out.printf("%-5s %-10s %-15s %-10s %-10s %-15s%n", "No.", "ID", "Name", "Role", "Salary", "Schedule");
        System.out.println("---------------------------------------------------------------");
        int count = 1;
        for (Employee e : list) {
            System.out.printf("%-5d %-10d %-15s %-10s RM%-9.2f %-15s%n",
                count++, e.id, e.name, e.role, e.salary, e.schedule);
        }
    }
    

    void edit(int id, Scanner sc) {
        for (Employee e : list) {
            if (e.id == id) {
                System.out.print("New name (or press enter to skip): ");
                String name = sc.nextLine();
                if (!name.isEmpty()) e.name = name;

                System.out.print("New role (or press enter to skip): ");
                String role = sc.nextLine();
                if (!role.isEmpty()) e.role = role;

                System.out.print("New salary (or -1 to skip): ");
                double salary = Double.parseDouble(sc.nextLine());
                if (salary > 0) e.salary = salary;

                System.out.print("New schedule (or press enter to skip): ");
                String sched = sc.nextLine();
                if (!sched.isEmpty()) e.schedule = sched;

                System.out.println("Employee updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    void delete(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == id) {
                list.remove(i);
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
