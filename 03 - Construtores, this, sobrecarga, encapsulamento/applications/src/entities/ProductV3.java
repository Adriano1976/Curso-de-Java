package entities;

public class ProductV3 {

    public String name;
    public double price;
    public int quantity;

    // É um recurso que uma classe possui de oferecer mais de uma
    //operação com o mesmo nome, porém com diferentes listas de
    //parâmetros.

    public ProductV3(String name, double price, int quantity) {
        this.name = name; // Diferenciar atributos de variáveis locais
        this.price = price;
        this.quantity = quantity;
    }

    // Construtor opcional, o qual recebe apenas nome e preço do produto.
    public ProductV3(String name, double price) {
        this.name = name;
        this.price = price;
    }

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
