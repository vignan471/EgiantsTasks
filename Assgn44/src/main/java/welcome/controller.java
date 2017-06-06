package welcome;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class controller {
    
    @RequestMapping("/")
    public String index() {
        return "E-Giants Assignment 44 by Vignan";
    }
    
}