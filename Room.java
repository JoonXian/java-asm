public class Room {
    private int roomId;
    private String roomType;
    private boolean isOccupied;
    private double roomPrice;
    
    public Room(int roomId, String roomType, double roomPrice) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isOccupied = false;
    }
    
    public void checkIn() {
        if (!isOccupied) {
            isOccupied = true;
            System.out.println("Room " + roomId + " is now occupied.");
        } else {
            System.out.println("Room " + roomId + " is already occupied.");
        }
    }
}
