package co.edu.uptc.ejemplo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
public class messsageController {
    @GetMapping()
    public String getMessage() {
        return "Bom dia";
    }
}
