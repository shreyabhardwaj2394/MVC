package com.exercise;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Shreya on 7/14/2017.
 */
public class StudentController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView model=new ModelAndView("index");
        model.addObject("message","HELLO FROM INDEX.JSP");
        return model;
    }
}
