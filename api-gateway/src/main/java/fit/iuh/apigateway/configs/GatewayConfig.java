package fit.iuh.apigateway.configs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("PaymentService", r -> r.path("/payment/**")
                        .uri("lb://PaymentService"))
                .route("InventoryService", r -> r.path("/inventory/**")
                        .uri("lb://InventoryService"))
                .route("ShippingService", r -> r.path("/shipping/**")
                        .uri("lb://ShippingService"))
                .build();
    }

}