package datasource.entities;

public enum UserRole {
    CUSTOMER(1),
    ADMINISTRATOR(2);

    private final int code;

    private UserRole(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
