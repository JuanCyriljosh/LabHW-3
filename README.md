Develop a payment application that allows users to place orders for items, define the quantity, unit price, and choose a payment method (GCash, Maya, ShopeePay). The application should calculate the total amount based on the order details and any applicable discounts offered by the chosen payment method, storing the result in the totalAmount attribute of the Order class.<br>

Specific requirements:<br>

PaymentApp class: This class serves as the entry point for the application. It demonstrates how to create an Order object, set its properties (item, quantity, unit price, and payment method), and calculate the total amount based on the chosen payment method.<br>
The application should have an Order class that stores information about the ordered item, quantity, unit price, chosen payment method, and the calculated total amount (totalAmount).<br>
The application should implement a PaymentMode interface that defines a method for calculating the discount offered by the payment method.<br>
The application should have concrete implementations of PaymentMode for GCash, Maya, ShopeePay:<br>
GCash: Does not offer any discount (discount rate = 0.0)<br>
Maya: Offers a 5% discount (discount rate = 0.05)<br>
ShopeePay: Offers a 10% discount<br>
The application should allow users to set the payment method for an order and calculate the total amount, storing it in the totalAmount attribute.<br>

Sample Output:<br>

Order item is keyboard<br>
Unit Price is 300.0<br>
Quantity is 10<br>

Payment Order details if GCash<br>
Discount rate is 0.00<br>
Payment amount is 3000.0<br>

Payment Order details if Maya<br>
Discount rate is 0.05<br>
Payment amount is 2850.0<br>

Payment Order details if ShopeePay<br>
Discount rate is 0.10<br>
Payment amount is 2700.0<br>
