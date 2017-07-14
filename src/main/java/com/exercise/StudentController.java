package com.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Shreya on 7/14/2017.
 */
@Controller
public class StudentController
{
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String printWelcome() {
        return "index";

    }
    @RequestMapping(value="/submitForm",method = RequestMethod.POST)
    public ModelAndView submitForm(@RequestParam("fname") String fname, @RequestParam("lname") String lname){
        System.out.println(fname);
        System.out.println(lname);
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("msg1", fname);
        model.addObject("msg2", lname);
        return model;
    }


}
