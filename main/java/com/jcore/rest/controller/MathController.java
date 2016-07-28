package com.jcore.rest.controller;


import com.jcore.model.Message;
import com.jcore.service.MathService;
import com.jcore.service.MathServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathService mathService;

    @RequestMapping("/factorial")
    public Message factorial(Integer number){
        if(number < 0) {
            throw new IllegalArgumentException();
        }
        return Message.from(mathService.factoria(number));
    }

    @RequestMapping("/fibonacci")
    public Message fibonacci(Integer number){
        if(number < 0) {
            throw new IllegalArgumentException();
        }
        return Message.from(mathService.fibonacci(number));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Message handleException(){
        return Message.from("You should set positive value!");
    }


}