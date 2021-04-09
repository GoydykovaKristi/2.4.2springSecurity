package com.kristinaG.spring.security.contollers;

import com.kristinaG.spring.security.model.User;
import com.kristinaG.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;


@Controller
@RequestMapping("")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String forUser(Principal principal, Model model){
        User username = userService.findUserByName(principal.getName());
        model.addAttribute("user", username);
        return "user";
    }
}