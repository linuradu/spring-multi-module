package com.rl.application;

import com.rl.library.EvenOddService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EvenOddApplication {

    private EvenOddService evenOddService;

    public EvenOddApplication(final EvenOddService evenOddService) {
        this.evenOddService = evenOddService;
    }

    // constructor

    @GetMapping("/validate/{number}")
    public String isEvenOrOdd(@PathVariable("number") Integer number) {
        return evenOddService.isEvenOrOdd(number);
    }
}