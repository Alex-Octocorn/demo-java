package fr.octocorn.demos.proxy.service;

import fr.octocorn.demos.proxy.product.Product;

import java.util.List;

public class ProductServiceProxy implements PromotedProductService {

    private ProductService service;
    private List<Product> cache;

    @Override
    public List<Product> getPromotedProducts() {
        if (cache == null) {
            this.cache = this.service.getPromotedProducts();
        }
        return this.cache;
    }
}
