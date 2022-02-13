package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Product {
    public String name;
    public String toyObject;

    public Product(String name, String toyObject) {
        this.name = name;
        this.toyObject = toyObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(toyObject, product.toyObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, toyObject);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", toyObject='" + toyObject + '\'' +
                '}';
    }
}
