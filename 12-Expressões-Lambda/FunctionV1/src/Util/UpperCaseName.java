package Util;

import Entities.Product;

import java.util.function.Function;

// 1.ª Version: Implementação da ‘interface’.
public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
