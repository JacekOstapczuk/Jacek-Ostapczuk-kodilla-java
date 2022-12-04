/*
 package com.kodilla.hibernate.invoice;

 import javax.persistence.*;
 import javax.validation.constraints.NotNull;

 import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public final class Invoice {
    private int id;
    private String number;
    private List<Item> items;

    public Invoice(String number  ) {this.number = number;

    }

    public Invoice() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name="NUMBER")
    public String getNumber() {
        return number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOneItem(Item item) {
        items.add(item);
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}



 */