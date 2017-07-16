package com.exercise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Shreya on 7/14/2017.
 */
@RequestMapping("/")
public class StudentController extends MultiActionController {
    @RequestMapping(value = "/index.html")
    public ModelAndView dummy() {
        ModelAndView modelAndView=new ModelAndView("index");
        return modelAndView;

    }
    @RequestMapping(value = "/two")
    public void dummy2(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<b>HELLO World</b>");
    }

}
