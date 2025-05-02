public class Guest {
    private int guestId;
    private String name;
    private String contactInfo;
    private String checkInDate;
    private String checkOutDate;

    public Guest(int guestId, String name, String contactInfo, String checkInDate, String checkOutDate) {
        this.guestId = guestId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getGuestId() {
        return guestId;
    }

    @Override
    public String toString() {
        return name + " | Contact: " + contactInfo + " | Check-in: " + checkInDate + " | Check-out: " + checkOutDate;
    }
}
