package com.example.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home() {
        return "home";
    }

//    @RequestMapping("home-user")
//    public String home(HttpServletRequest req, HttpServletResponse res) {
//       HttpSession session =req.getSession();
//       String name=req.getParameter("name");
//       System.out.println("hi "+name);
//       session.setAttribute("name",name);
//       return "home-user";
//    }

//    @RequestMapping("home-user")
//    public ModelAndView home(String name, HttpSession session) {
//        ModelAndView mv= new ModelAndView();
//        mv.addObject("name",name);
//        mv.setViewName("home-user");
//
//        return mv;
//    }

    @RequestMapping("home-user")
    public ModelAndView home(@RequestParam("name") String myName, HttpSession session) {
        ModelAndView mv= new ModelAndView();
        mv.addObject("name",myName);
        mv.setViewName("home-user");

        return mv;
    }

    @RequestMapping("home-user-obj")
    public ModelAndView home(Alien alien, HttpSession session) {
        ModelAndView mv= new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("home-user-obj");

        return mv;
    }
}
