package fit.iuh.shippingservice.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @PostMapping("/ship")
    public String shipOrder() {
        // Giả lập giao hàng
        return "Order shipped for Order ID: ";
    }

    @PostMapping("/track")
    public String trackOrder() {
        // Giả lập theo dõi đơn hàng
        return "Order status for Order ID " ;
    }
}