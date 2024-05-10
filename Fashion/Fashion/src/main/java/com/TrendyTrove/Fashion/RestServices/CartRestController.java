package com.TrendyTrove.Fashion.RestServices;


import com.TrendyTrove.Fashion.Entity.Cart;
import com.TrendyTrove.Fashion.Entity.Products;
import com.TrendyTrove.Fashion.Services.CartService;
import com.TrendyTrove.Fashion.Services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CartRestController {

    private final CartService cartService;

    @Autowired
    public CartRestController(CartService theCartService) {
        this.cartService = theCartService;
    }

    @PostMapping("/cart/add/{productId}/{userId}/{quantity}")
    public String productDetails(@PathVariable String productId, @PathVariable String userId, @PathVariable String quantity)
    {
        int user_id = Integer.parseInt(productId);
        int product_id = Integer.parseInt(productId);
        int qty = Integer.parseInt(productId);
        Cart cart = new Cart(user_id,product_id,qty);
        cartService.addToCart(cart);

        return "Product " + productId + " is added to cart succesfully!";

    }
}
