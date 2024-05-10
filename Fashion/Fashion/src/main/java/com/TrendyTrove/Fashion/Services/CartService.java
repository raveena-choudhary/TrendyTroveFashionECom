package com.TrendyTrove.Fashion.Services;

import com.TrendyTrove.Fashion.DAOInterfaces.CartDAO;
import com.TrendyTrove.Fashion.DAOInterfaces.ProductsDAO;
import com.TrendyTrove.Fashion.Entity.Cart;
import org.springframework.stereotype.Service;


@Service
public class CartService {

    private final CartDAO cartDAO;

    public CartService(CartDAO cartDAO) {
        this.cartDAO = cartDAO;
    }

    public void addToCart(Cart cart)
    {
        cartDAO.addToCart(cart);
    }
}
