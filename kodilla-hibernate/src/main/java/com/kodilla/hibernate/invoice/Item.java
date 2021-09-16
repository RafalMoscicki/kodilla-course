package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;
import jdk.jfr.Unsigned;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @NotNull
    @Unsigned
    private BigDecimal price;

    @NotNull
    @Unsigned
    private int quantity;

    @NotNull
    @Unsigned
    private BigDecimal value;

    public Item() {
    }

    public Item(BigDecimal price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(BigDecimal.valueOf(quantity));
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
