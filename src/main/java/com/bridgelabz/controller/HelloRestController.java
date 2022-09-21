package com.bridgelabz.controller;

import com.bridgelabz.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {

        return "Hello from Akhil Choudhari";
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " !";
    }
    @GetMapping("/params/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " !";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !";
    }

}

