package pl.adriankurek.springsimplestrestapiapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.adriankurek.springsimplestrestapiapp.manager.UserManager;

@Controller
public class HomeController {
    
    private UserManager manager;
    
    @Autowired
    public HomeController(UserManager manager) {
        this.manager = manager;
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("users", manager.findAll());
        return "index.html";
    }
}