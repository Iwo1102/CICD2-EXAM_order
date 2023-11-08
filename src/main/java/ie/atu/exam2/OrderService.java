package ie.atu.exam2;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    List<OrderDetails> orders = new ArrayList<>();
    public void createOrder(OrderDetails orderDetails) {
        orders.add(orderDetails);
    }

    public OrderDetails getOrderById(int id) {
        return orders.get(id);
    }

}
