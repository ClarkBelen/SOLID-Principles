public class OrderTest {
    public static void main(String[] args) {
        System.out.println("ORDER SUMMARY\n");

        //CUSTOMERS
        Customer customer1 = new Customer("Clark", "QC");
        Customer customer2 = new Customer("Andrea", "Manila");

        //ORDERS
        Order order1 = new Order(120.00, 2);
        Order order2 = new Order(250.00,2);

        //Assuming the order 1 is a small type of order
        SmallOrder mySmallOrder = new SmallOrder(); //Has only implemented the default order actions

        //For customer 1 that purchased order 1
        mySmallOrder.calculateTotal(order1);
        mySmallOrder.placeOrder(customer1);
        System.out.println();

        //For customer 2 that purchased order 1
        mySmallOrder.calculateTotal(order1);
        mySmallOrder.placeOrder(customer2);
        System.out.println();


        //Assuming the order 2 is a big type of order
        BigOrder myBigOrder = new BigOrder(); //Has implemented all order actions
        //For customer 1 that purchased order 2
        myBigOrder.calculateTotal(order2);
        myBigOrder.placeOrder(customer1);

        order2.setInvoiceFileName("order_123.pdf");
        myBigOrder.generateInvoice(order2);

        customer1.setEmail("clark@example.com");
        myBigOrder.sendEmailNotification(customer1);
        System.out.println();

        //For customer 2 that purchased order 2
        myBigOrder.calculateTotal(order2);
        myBigOrder.placeOrder(customer2);

        order2.setInvoiceFileName("order_234.pdf");
        myBigOrder.generateInvoice(order2);

        customer2.setEmail("andrea@example.com");
        myBigOrder.sendEmailNotification(customer2);
        System.out.println();

    }
}