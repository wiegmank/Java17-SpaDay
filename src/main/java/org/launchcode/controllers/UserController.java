package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
        public String displayAddUserForm(){
            return "user/add";
    }
    @PostMapping("")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("verify", verify);
        model.addAttribute("user", user);
        if (user.getPassword().equals(verify)) {
            return "/user/index";
        } else {
            model.addAttribute("error", "Passwords do not match");
            return "/user/add";
        }
    }
}
