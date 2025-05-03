import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelEmployeeSystem system = new HotelEmployeeSystem();

        while (true) {
            System.out.println("\n===== Hotel Employee Management System =====");
            System.out.println("1. Add a New Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Edit an Employee");
            System.out.println("4. Delete an Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Role: ");
                    String role = scanner.nextLine();

                    System.out.print("Salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());

                    System.out.print("Schedule: ");
                    String sched = scanner.nextLine();

                    Employee e = new Employee(id, name, role, salary, sched);
                    system.add(e);
                    break;

                case "2":
                    system.showAll();
                    break;

                case "3":
                    System.out.print("Enter ID to edit: ");
                    int editId = Integer.parseInt(scanner.nextLine());
                    system.edit(editId, scanner);
                    break;

                case "4":
                    System.out.print("Enter ID to delete: ");
                    int delId = Integer.parseInt(scanner.nextLine());
                    system.delete(delId);
                    break;

                case "5":
                    System.out.println("Goodbye! Thank you for using the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }
}
