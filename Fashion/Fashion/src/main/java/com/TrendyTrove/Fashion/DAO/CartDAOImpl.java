package com.TrendyTrove.Fashion.DAO;


import com.TrendyTrove.Fashion.DAOInterfaces.CartDAO;
import com.TrendyTrove.Fashion.Entity.Cart;
import com.TrendyTrove.Fashion.Entity.Products;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CartDAOImpl implements CartDAO {

    private EntityManager entityManager;

    public CartDAOImpl(EntityManager theEntityManager)
    {
        this.entityManager = theEntityManager;
    }
    @Override
    @Transactional
    public void addToCart(Cart cart) {

        entityManager.persist(cart);
    }
}
