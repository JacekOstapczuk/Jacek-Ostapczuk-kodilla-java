/*
package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "ITEM")
public class Item {

     private int id;
    private BigDecimal price;
    private int quantity;
    private  BigDecimal value;
    private Product product;
    private  Invoice invoice;

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        BigDecimal bigQuantity = BigDecimal.valueOf(quantity);
        this.value = price.multiply(bigQuantity);
    }

    public Item() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name= "PRODUCK_ID")
    public Product getProduct() {
        return product;
    }

    @Column(name="PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name="QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column(name="VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne
    @JoinColumn(name = "INVOLCE_ID")
    public Invoice getInvoice() {
        return invoice;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}


 */