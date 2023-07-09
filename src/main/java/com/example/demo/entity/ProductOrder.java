package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
//had to rename order to product order as order is reserwed keyword in H2O database
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    private String userId;

    @OneToMany(
            mappedBy = "productOrder",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        product.setProductOrder(this);
    }

    public void removeProduct(Product product) {
        products.remove(product);
        product.setProductOrder(null);
    }
}
