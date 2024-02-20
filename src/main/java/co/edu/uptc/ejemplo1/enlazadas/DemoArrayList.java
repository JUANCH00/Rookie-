package co.edu.uptc.ejemplo1.enlazadas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collection")
public class DemoArrayList {

    @GetMapping("/list")
    public String demoArrayList() {
        List<String> list = new ArrayList<String>();
        list.add("arg0");
        list.add("arg0");
        list.add("arg0");

        return "lista ok";
    }
}
