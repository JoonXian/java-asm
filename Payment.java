public class Payment {
    private int paymentId;
    private int guestId;
    private double amount;
    private String method;
    private String status;

    public Payment(int paymentId, int guestId, double amount, String method, String status) {
        this.paymentId = paymentId;
        this.guestId = guestId;
        this.amount = amount;
        this.method = method;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment ID: " + paymentId + " | Guest ID: " + guestId + " | Amount: $" + amount + 
               " | Method: " + method + " | Status: " + status;
    }
}
