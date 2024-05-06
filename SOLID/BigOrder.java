public class BigOrder implements OrderAction, InvoiceGenerator, EmailNotifier{

    @Override
    public void sendEmailNotification(Customer customerEmail) {
        // Simulate sending email notification
        System.out.println("Email notification sent to: " + customerEmail.getEmail());

    }

    @Override
    public void generateInvoice(Order orderInvoice) {
        // Simulate generating invoice file
        System.out.println("Invoice generated: " + orderInvoice.getInvoiceFileName());

    }

    @Override
    public void calculateTotal(Order order) {
        double shippingFee = 50;
        double total = order.getPrice() * order.getQuantity() + shippingFee;
        System.out.println("Order total: $" + total + " (shipping fee of $" + shippingFee + " is already included)");
    }

    @Override
    public void placeOrder(Customer customer) {
        // Simulate placing order in a system
        System.out.println("Order placed for " + customer.getCustomerName() + " at " + customer.getAddress());
    }
}
