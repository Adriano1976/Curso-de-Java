package Util;

import Entities.Product;

import java.util.function.Predicate;

// 1.ª Version: Implementação da ‘interface’.
public class ProdutctPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.00;
    }
}
