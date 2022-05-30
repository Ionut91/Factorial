package Api.SecondApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialClass {

    @GetMapping(value = "/{n}")
    public int getFactorail(@PathVariable Integer n){
        int factorial = n;
        int i = 0;
        for(i = n - 1; i > 0; i--){
            factorial = factorial * i;

        }
        return factorial;
    }
}
