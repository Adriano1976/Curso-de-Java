package Services;

import Entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    //  Imprementation function thet receives other functions.
    public Double filteredSum(List<Product> list, Predicate<Product> criterion) {

        double sum = 0.0;
        for (Product product : list) {
            if (criterion.test(product)) {
                sum += product.getPrice();
            }
        }

        return sum;
    }
}
