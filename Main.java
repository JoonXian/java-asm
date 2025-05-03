public class Main {
        public static void main(String[] args) {
            EmployeeSystem system = new EmployeeSystem();
    
            system.addEmployee(new Employee(1, "Alice", "Front Desk", 3200.0, "9am-5pm"));
            system.addEmployee(new Employee(2, "Bob", "Housekeeping", 2800.0, "6am-2pm"));
            system.addEmployee(new Employee(3, "Carol", "Manager", 5000.0, "8am-4pm"));
    
            system.displayEmployees();
        }
    }
    

