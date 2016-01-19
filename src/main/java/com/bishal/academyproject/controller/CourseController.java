/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bishal.academyproject.controller;

import com.bishal.academyproject.entity.Course;
import com.bishal.academyproject.service.CourseService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Bishal
 */
@Controller
@RequestMapping(value = "/admin/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) throws SQLException{
        map.addAttribute("courses", courseService.getAll());
        return "/admin/courses/index";
        
    }
    
    @RequestMapping(value="/add",method = RequestMethod.GET)
    public ModelAndView add() throws SQLException{
        ModelAndView mv=new ModelAndView("admin/courses/add");
        mv.addObject("Course",new Course());
        return mv;
        
    } 
    @RequestMapping(value="/edit/{id}",method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id")int id) throws SQLException{
        ModelAndView mv=new ModelAndView("admin/courses/edit");
        mv.addObject("Course",courseService.getById(id));
        return mv;
        
    }     
    
    @RequestMapping(value="/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable("id")int id) throws SQLException{
       courseService.delete(id);
       return "redirect:/admin/courses";
        
    }    
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public  String save(@ModelAttribute("Course") Course c){
        try{
            if(c.getId()==0){
                courseService.insert(c);
            }else{
                courseService.update(c);
            }
           
        }catch(SQLException se){
            
        }
        
         return "redirect:/admin/courses";
    }
}