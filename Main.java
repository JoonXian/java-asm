public class Main {
    public static void main(String[] args) {
        Room room = new Room(101, "Double", 120.0);
        Guest guest = new Guest(1, "Alice Smith", "alice@example.com", "2025-06-01", "2025-06-05");
        Employee employee = new Employee(1001, "John Doe", "Front Desk", 3000.0, "9am-5pm");
        Payment payment = new Payment(1, guest.getGuestId(), 480.0, "Credit Card", "Completed");
        Housekeeping housekeeping = new Housekeeping(101, "2025-05-01", true);

        System.out.println("Room Info: " + room);
        System.out.println("Guest Info: " + guest);
        System.out.println("Employee Info: " + employee);
        System.out.println("Payment Info: " + payment);
        System.out.println("Housekeeping Info: " + housekeeping);
    }
}
