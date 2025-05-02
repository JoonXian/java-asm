public class Housekeeping {
    private int roomId;
    private String date;
    private boolean cleaned;

    public Housekeeping(int roomId, String date, boolean cleaned) {
        this.roomId = roomId;
        this.date = date;
        this.cleaned = cleaned;
    }

    @Override
    public String toString() {
        return "Room ID: " + roomId + " | Date: " + date + " | Cleaned: " + cleaned;
    }
}
