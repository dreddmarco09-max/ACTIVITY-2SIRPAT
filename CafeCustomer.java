public class CafeCustomer {
    private String customerName;



    public CafeCustomer(String name) {
        this.customerName = name;
    }
    


      public String identifyRole() {
        return "I am the CafeCustomer Kurt Class. I hold the identity of the person placing the order.";
    }
    


    public String customerInfo() {
        return "Customer: " + customerName;
    }



    
}