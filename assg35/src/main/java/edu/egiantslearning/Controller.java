package edu.egiantslearning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Viggi on 5/2/17.
 */

@RestController
public class Controller {

    @RequestMapping(value = "/echo")
    public String echo(@RequestParam(value = "request", defaultValue = "Hello!")String request){
        return request;
    }
}