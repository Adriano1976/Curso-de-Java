package model.entities;

import model.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private final List<OrderItem> items = new ArrayList<>();


    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Order moment: ");
        stringBuilder.append(simpleDateFormat.format(moment)).append("\n");
        stringBuilder.append("Order status: ");
        stringBuilder.append(status).append("\n");
        stringBuilder.append("Client: ");
        stringBuilder.append(client).append("\n");
        stringBuilder.append("Order items:\n");
        for (OrderItem item : items) {
            stringBuilder.append(item).append("\n");
        }
        stringBuilder.append("\nTotal price: $ ");
        stringBuilder.append(String.format("%.2f", calculateTotal()));

        return stringBuilder.toString();
    }
}
