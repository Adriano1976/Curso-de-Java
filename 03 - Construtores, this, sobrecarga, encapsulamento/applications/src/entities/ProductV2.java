package entities;

public class ProductV2 {

    public String name;
    public double price;
    public int quantity;

    // Permitir ou obrigar que o objeto receba dados / dependências no momento da sua
    //instanciação (injeção de dependência)
    public ProductV2(String name, double price, int quantity) {
        this.name = name; // Diferenciar atributos de variáveis locais
        this.price = price;
        this.quantity = quantity;
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
