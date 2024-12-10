package java_base.pack.com.helloshop.order;

import java_base.pack.com.helloshop.user.User;
import java_base.pack.com.helloshop.product.Product;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
