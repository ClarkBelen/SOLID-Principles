public class Order {
    private Double price;
    private Integer quantity;
    private String invoiceFileName;

    public Order(Double price, Integer quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setInvoiceFileName(String invoiceFileName) {
        this.invoiceFileName = invoiceFileName;
    }

    public String getInvoiceFileName() {
        return invoiceFileName;
    }
}
