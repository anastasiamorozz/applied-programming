package main.java.com.models;

import java.io.Serializable;

public class Supplier implements Serializable {
    private String supplierId;
    private String name;
    private String phone;
    private String email;

    public Supplier(String supplierId, String name, String phone, String email) {
        this.supplierId = supplierId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "ID='" + supplierId + '\'' +
                ", Name='" + name + '\'' +
                ", Phone='" + phone + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
