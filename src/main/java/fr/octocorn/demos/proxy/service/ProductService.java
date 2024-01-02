package fr.octocorn.demos.proxy.service;

import fr.octocorn.demos.proxy.product.Product;

import java.util.List;

public class ProductService implements PromotedProductService {
    @Override
    public List<Product> getPromotedProducts() {
        // Requête qui coute un peu cher.
        return null;
    }
}
