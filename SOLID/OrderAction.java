public interface OrderAction { //Default order operations needed for all orders
    void calculateTotal(Order order);
    void placeOrder(Customer customer);
}
