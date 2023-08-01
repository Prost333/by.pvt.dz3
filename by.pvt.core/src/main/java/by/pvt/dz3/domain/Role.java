package by.pvt.dz3.domain;

public enum Role {
    ADMIN("Администратор"),
    CLIENT("Клиент");
    String name;

    Role(String name) {
        this.name = name;
    }
}
