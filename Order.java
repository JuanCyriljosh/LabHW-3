public class Order {

    private String item;
    private int quantity;
    private double unitPrice;
    private PaymentMode payMode;

    public void setItem(String item) {
        this.item = item;
    }
    public String getItem() {
        return item;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setMode(PaymentMode payMode) {
        this.payMode = payMode;
    }
    public PaymentMode getPayMode() {
        return payMode;
    }
    public Order(String item, int quantity, double unitPrice, PaymentMode payMode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.payMode=payMode;
    }
    public double getTotalAmount() {
        return (unitPrice*quantity)*(1-payMode.getDiscountRate());
    }
}