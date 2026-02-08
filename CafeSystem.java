public class CafeSystem {
    public static void main(String[] args) {
        
        MenuItem coffee = new MenuItem("Caramel Macchiato");
        Order transaction = new Order(coffee);
        CafeCustomer buyer = new CafeCustomer("DreddMarco");

        String finalOutput = "--- CAFE SYSTEM REPORT ---\n" +
                             buyer.identifyRole() + "\n" +
                             coffee.identifyRole() + "\n" +
                             transaction.identifyRole() + "\n" +
                             "--------------------------\n" +
                             buyer.customerInfo() + "\n" +
                             transaction.orderSummary();

        
        System.out.println(finalOutput);
    }
}