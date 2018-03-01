package edu.nuc.web;

import edu.nuc.model.User;
import edu.nuc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * fen  z +mx
 * Created by 超 on 2017/10/19.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    public ModelAndView getUserById(String id){
        User user = userService.getUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("user/user");
        return modelAndView;
    }

    @RequestMapping("/getAllUser")
    public ModelAndView getAllUser(){
        List<User> users = userService.getAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("user/users");
        return modelAndView;
    }
}
