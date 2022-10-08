package uam.springdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
    @RequestMapping("/hello")
    public String index() {
        return "<h1>Hello World</h1>";
    }
    
    @RequestMapping("/cadastro/{nome}")
    public String dizernome (@PathVariable String nome) {
        return "Olá, meu nome é " + nome;
    }
}
