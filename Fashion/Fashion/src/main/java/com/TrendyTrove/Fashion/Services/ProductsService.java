package com.TrendyTrove.Fashion.Services;


import com.TrendyTrove.Fashion.DAOInterfaces.ProductsDAO;
import com.TrendyTrove.Fashion.Entity.Products;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProductsService {

    private final ProductsDAO productDAO;

    //inject DAO object
    public ProductsService(ProductsDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Products> getAllProducts()
    {
        return productDAO.getProducts();
    }


    public Products getProduct(int productId)
    {
        return productDAO.getProduct(productId);
    }

}
