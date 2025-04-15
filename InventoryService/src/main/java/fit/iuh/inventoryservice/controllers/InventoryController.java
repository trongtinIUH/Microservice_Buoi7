package fit.iuh.inventoryservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @PostMapping("/update")
    public String updateStock() {
        return "Stock updated successfully.";
    }
}