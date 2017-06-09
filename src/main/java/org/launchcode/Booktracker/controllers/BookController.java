package org.launchcode.Booktracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Engineer on 6/9/2017.
 */
@Controller
public class BookController {
    @RequestMapping(value="")
    @ResponseBody
    public String index(){
        return "my personal App";
    }
}
