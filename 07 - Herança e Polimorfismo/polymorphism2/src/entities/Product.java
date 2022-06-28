/*
- Make a program to read the data from N products (N provided by user). At end,
show the price tag of each product on the same order in which they were entered.
- Every product has a name and price. Products imported have a customs fee and Used products
have a manufacturing date. These specific data must be added to the price tag as example
(next page). For products imported, the fee and customs must be added to the final
price of the product.
 */

package entities;

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

    public String priceTag() {
        return name + " - $ " + String.format("%.2f", price);
    }
}
