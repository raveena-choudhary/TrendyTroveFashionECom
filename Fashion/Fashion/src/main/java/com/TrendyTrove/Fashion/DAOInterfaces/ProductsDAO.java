package com.TrendyTrove.Fashion.DAOInterfaces;

import com.TrendyTrove.Fashion.Entity.Products;

import java.util.List;

public interface ProductsDAO {

    List<Products> getProducts();

    Products getProduct(Integer productId);
}
