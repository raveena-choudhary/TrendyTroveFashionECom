package com.TrendyTrove.Fashion.DAO;

import com.TrendyTrove.Fashion.DAOInterfaces.ProductsDAO;
import com.TrendyTrove.Fashion.Entity.Products;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;


@Repository
public class ProductDAOImpl implements ProductsDAO{

    private EntityManager entityManager;

    //inject entityManager - Constructor injection
    public ProductDAOImpl(EntityManager theEntityManager)
    {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Products> getProducts() {

        TypedQuery<Products> productsTypedQuery = entityManager.createQuery("FROM Products", Products.class);
        return productsTypedQuery.getResultList();
    }

    @Override
    public Products getProduct(Integer productId) {

        TypedQuery<Products> productsTypedQuery = entityManager.createQuery("FROM Products WHERE id=:productId", Products.class);
        productsTypedQuery.setParameter("productId",productId);

        return productsTypedQuery.getSingleResult();

    }
}
