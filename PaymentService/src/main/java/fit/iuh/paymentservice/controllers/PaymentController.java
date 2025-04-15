package fit.iuh.paymentservice.controllers;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {


    @PostMapping("/process")
    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallbackPayment")
    @Retry(name = "paymentService")
    public String processPayment() {
        // Giả lập xử lý thanh toán
        if (Math.random() > 0.5) {
            throw new RuntimeException("Payment failed!");
        }
        return "Payment processed successfully.";
    }
    public String fallbackPayment(Throwable t) {
        return "Payment service is currently unavailable. Please try again later.";
    }
    @PostMapping("/refund")
    public String processRefund() {
        // Giả lập hoàn tiền
        return "Refund processed successfully.";
    }
}

