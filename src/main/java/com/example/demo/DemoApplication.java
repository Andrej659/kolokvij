
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

   public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
   }
   @RestController
   static class HelloWorldController {
     @GetMapping("/hello/{name}")
     public String hello(@PathVariable String name) {
        return "Hello2 " + name + "\n";
      }
   }
}
