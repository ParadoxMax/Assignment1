public class InvoiceItem {

    private String itemsId;
    private String description;
    private int quantity;
    private double unitPrice;

    public double getTotal( ) {     //getTotal method
        double total = this.quantity * this.unitPrice;
        return total;
    }

    public String toString2() {          //ToString method
       return " Item's ID: " + this.itemsId + "\n Item's description: " + this.description + "\n Item's quantity: " + this.quantity + "\n Item's unit price: " + this.unitPrice + "DT";

    }

    public String getId() {
        return itemsId;
    }

    public void setId(String itemsId) {
        this.itemsId = itemsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
