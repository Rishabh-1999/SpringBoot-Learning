package com.example.springjpa.controller;

import com.example.springjpa.dao.AlienRepo;
import com.example.springjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien) {

        repo.save(alien);
        return "home";
    }

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid) {

        ModelAndView mv= new ModelAndView("showAlien");
        Alien alien = repo.findById(aid).orElse(new Alien());

        mv.addObject("alien",alien);

        System.out.println((repo.findByTech("JS")));

        System.out.println((repo.findByAidGreaterThan(102)));

        System.out.println((repo.findByTech("JS")));
        return mv;
    }

    @RequestMapping("/aliens")
    @ResponseBody
    public List<Alien> aliens() {

      return repo.findAll();
    }

    @RequestMapping("/alien/{aid}")
    @ResponseBody
    public Optional<Alien> getAlien1(@PathVariable("aid") int aid) {
        return repo.findById(aid);
    }


}
