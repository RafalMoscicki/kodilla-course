package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String number;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinTable(name="INVOICES_ITEMS",
            joinColumns = @JoinColumn(name="invoice_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="item_id", referencedColumnName="id"))
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public List<Item> getItems() {
        return items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }
}
