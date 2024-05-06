public class SmallOrder implements OrderAction{
    @Override
    public void calculateTotal(Order order) {
        double total = order.getPrice() * order.getQuantity();
        System.out.println("Order total: $" + total);

    }

    @Override
    public void placeOrder(Customer customer) {
        // Simulate placing order in a system
        System.out.println("Order placed for " + customer.getCustomerName() + " at " + customer.getAddress());

    }
}
