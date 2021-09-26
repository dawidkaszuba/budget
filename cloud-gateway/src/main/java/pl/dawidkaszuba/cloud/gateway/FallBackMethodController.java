package pl.dawidkaszuba.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "USER-SERVICE unavailable. Please contact support";
    }

    @GetMapping("/expenseServiceFallBack")
    public String expenseServiceFallBackMethod() {
        return "EXPENSE-SERVICE unavailable. Please contact support";
    }
}
