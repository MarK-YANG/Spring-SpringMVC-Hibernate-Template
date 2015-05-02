package com.mark.Action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mark on 5/2/15.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("")
    public String index(){
        return "index";
    }
}
