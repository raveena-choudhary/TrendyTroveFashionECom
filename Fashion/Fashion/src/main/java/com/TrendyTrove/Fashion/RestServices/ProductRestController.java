package com.TrendyTrove.Fashion.RestServices;


import com.TrendyTrove.Fashion.Entity.Products;
import com.TrendyTrove.Fashion.Services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    private final ProductsService productsService;

    @Autowired
    public ProductRestController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/products/{productId}")
    public Products productDetails(@PathVariable String productId)
    {
//        System.out.println(productId);
        int id = Integer.parseInt(productId);
        return productsService.getProduct(id);
    }

}
