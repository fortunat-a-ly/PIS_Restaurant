package datasource.entities;

public enum OrderStatus {
    PREPARING(1),
    READY(2),
    RECEIVED(3);

    private final int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
