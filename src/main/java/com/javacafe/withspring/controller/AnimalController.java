package com.javacafe.withspring.controller;

import com.javacafe.withspring.service.AnimalService;
import com.javacafe.withspring.service.DogServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by jojonari on 2017. 6. 9..
 */
@Controller
public class AnimalController {

    @Resource(name = "dogService")
    private AnimalService animalService;

    @Resource(name = "eagleService")
    private AnimalService animalService2;

    @GetMapping("/animal")
    public ModelAndView animaltest(){
        //DogServiceImpl 객체를 바로 호출하면 코드변경이 어렵다
        DogServiceImpl dogService = new DogServiceImpl();
        ModelAndView mv = new ModelAndView();
        mv.addObject("walk", dogService.walking());
        mv.addObject("fly", dogService.flying());
        mv.setViewName("index");
        return mv;
    }


    @GetMapping("/")
    public ModelAndView animal(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("walk", animalService2.walking());
        mv.addObject("fly", animalService2.flying());
        mv.setViewName("index");
        return mv;
    }
}
