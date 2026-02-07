public class CafeSystem {
    public static void main(String[] args) {
        MenuItem item = new MenuItem();
        Order order = new Order();
        CafeCustomer customer = new CafeCustomer();
        
        
        String finalOutput = item.identifyRole() + "\n" + 
        order.identifyRole() + "\n" + 
        customer.identifyRole();
 
        System.out.println(finalOutput);
    }
}
