package entities;

public class ProductV4 {

    // Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
    private String name;
    private double price;
    private int quantity;


    public ProductV4() {
    }

    // É um recurso que uma classe possui de oferecer mais de uma
    //operação com o mesmo nome, porém com diferentes listas de
    //parâmetros.

    public ProductV4(String name, double price, int quantity) {
        this.name = name; // Diferenciar atributos de variáveis locais
        this.price = price;
        this.quantity = quantity;
    }

    // Construtor opcional, o qual recebe apenas nome e preço do produto.
    public ProductV4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Os atributos devem ser acessados por métodos get e set.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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
