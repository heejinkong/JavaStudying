package java_base.pack.com.helloshop.order;

import java_base.pack.com.helloshop.product.Product;
import java_base.pack.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
