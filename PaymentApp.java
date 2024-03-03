public class PaymentApp {
    public static void main(String[] args){

        Order order = new Order("keyboard", 10, 300, new GCash());
        System.out.println("\nOrder item is " + order.getItem());
        System.out.println("Unit price is "+ order.getUnitPrice());
        System.out.println("Quantity is " + order.getQuantity());

        System.out.println("\nPayment order details if GCash");
        System.out.println("Discount rate is " + order.getPayMode().getDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());

        Order order2 = new Order("keyboard", 10, 300, new Maya());
        System.out.println("\nPayment order details if Maya");
        System.out.println("Discount rate is " + order2.getPayMode().getDiscountRate());
        System.out.println("Payment amount is " + order2.getTotalAmount());

        Order order3 = new Order("keyboard", 10, 300, new ShopeePay());
        System.out.println("\nPayment order details if ShopeePay");
        System.out.println("Discount rate is " + order3.getPayMode().getDiscountRate());
        System.out.println("Payment amount is " + order3.getTotalAmount());
    }
}