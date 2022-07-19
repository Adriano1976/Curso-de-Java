package Entities;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // 2.ª Version: Reference method com método estático.
    public static boolean staticProductPredicate(Product product) {
        return product.getPrice() >= 100.00;
    }

    // 3.ª Version: Reference method com método não estático.
    public boolean nonStaticProductPredicate() {
        return price >= 100.00;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f" ,price);
    }
}
