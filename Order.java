public class Order {
    private String orderId;
    private String itemName;
    
    public Order(String orderId, String itemName) {
        this.orderId = orderId;
        this.itemName = itemName;
    }
    
    // Getters and setters
    
    public String getOrderId() {
        return orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

