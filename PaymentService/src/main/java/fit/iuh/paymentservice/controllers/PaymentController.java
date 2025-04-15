package fit.iuh.paymentservice.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {


    @PostMapping("/process")
    public String processPayment() {
        // Giả lập xử lý thanh toán
        return "Payment processed successfully.";
    }

    @PostMapping("/refund")
    public String processRefund() {
        // Giả lập hoàn tiền
        return "Refund processed successfully.";
    }
}

