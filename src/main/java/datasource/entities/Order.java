package datasource.entities;

import java.sql.Timestamp;

public class Order {
    private int id;
    private int mealId;
    private int customerId;
    private int status;
    private int quantity;
    private Timestamp timestamp;

    public Order(int mealId, int customerId, int status, int quantity, Timestamp timestamp) {
        this.mealId = mealId;
        this.customerId = customerId;
        this.status = status;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }

    public Order(int mealId, int customerId, int status, int quantity) {
        this.mealId = mealId;
        this.customerId = customerId;
        this.status = status;
        this.quantity = quantity;
    }

    public Order(int id, int mealId, int customerId, int status, int quantity, Timestamp timestamp) {
        this.id = id;
        this.mealId = mealId;
        this.customerId = customerId;
        this.status = status;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }
    public Order(int id, int mealId, int customerId, short status, short quantity, Timestamp timestamp) {
        this.id = id;
        this.mealId = mealId;
        this.customerId = customerId;
        this.status = status;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", mealId=" + mealId +
                ", customerId=" + customerId +
                ", status=" + status +
                ", quantity=" + quantity +
                ", timestamp=" + timestamp +
                '}';
    }
}
