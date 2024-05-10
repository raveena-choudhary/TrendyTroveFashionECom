package com.TrendyTrove.Fashion.RestServices;


import com.TrendyTrove.Fashion.Entity.Products;
import com.TrendyTrove.Fashion.Services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomePageRestController {
    private final ProductsService productsService;

    @Autowired
    public HomePageRestController(ProductsService theProductsService) {
        this.productsService = theProductsService;
    }

    @GetMapping("/home")
    public List<Products> homePage()
    {
        return productsService.getAllProducts();
    }

}
