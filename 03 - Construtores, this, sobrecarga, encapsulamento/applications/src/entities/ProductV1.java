package entities;

public class ProductV1 {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Name: " + name
                + ", Price: $ " + String.format("%.2f", price)
                + ", Quantity: " + quantity + " units"
                + ", Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
