package com.example.jsonFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JsonFormatController {

    @RequestMapping("/")
    public String index() {
        return "JsonFormat/jsonFormat";
    }

    @RequestMapping("/format")
    public String format(Model model) {
    	
    	
    	return "JsonFormat/jsonFormat";
    }
}