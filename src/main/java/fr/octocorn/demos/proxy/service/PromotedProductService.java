package fr.octocorn.demos.proxy.service;

import fr.octocorn.demos.proxy.product.Product;

import java.util.List;

public interface PromotedProductService {
    List<Product> getPromotedProducts();
}
