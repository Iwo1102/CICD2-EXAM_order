package ie.atu.exam2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private OrderService orderService;
    private CustomerServiceClient customerServiceClient;

    @Autowired
    public OrderController(OrderService orderService, CustomerServiceClient customerServiceClient) {
        this.orderService = orderService;
        this.customerServiceClient = customerServiceClient;
    }

    @PostMapping("/order")
    public String addOrder(@RequestBody OrderDetails order) {
        CustomerDetails customer = customerServiceClient.getCustomer(New CustomerDetails);
        if (customer.getAge() >= 18) {
            orderService.createOrder(order);
            return "Order added";
        } else {
            return "You are too young to place an order";
        }
    }
}
