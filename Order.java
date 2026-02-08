public class Order {
    private MenuItem item;

    public Order(MenuItem item) {
        this.item = item;
    }

    public String identifyRole() {
        return "I am the Order Class Chester. I manage the selection made by the customer.";
    }

    public String orderSummary() {
        return "Order Summary: [" + item.itemDetails() + "]";
    }
}


