package com.javacafe.withspring.controller;

import com.javacafe.withspring.service.WebServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jojonari on 2017. 6. 9..
 */
@Controller
public class WebController {
    @Autowired
    WebServiceImpl webService;

    @GetMapping("/")
    public ModelAndView webView(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("body", webService.getBody());
        mv.setViewName("index");
        return mv;
    }
}
