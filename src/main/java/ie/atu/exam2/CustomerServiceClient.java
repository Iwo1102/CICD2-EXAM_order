package ie.atu.exam2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Order-Service", url = "http://localhost:8081")
public interface CustomerServiceClient {
    @GetMapping("/customers/" + orders.getOrderById(id))
    CustomerDetails getCustomer(@RequestBody CustomerDetails customerDetails);
}
