package com.example.demo.controller;

import com.example.demo.service.IGoodsService;
import com.example.demo.service.ISalesManService;
import com.example.demo.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @Autowired
    private ISalesManService salesManService;
    @Autowired
    private IGoodsService    goodsService;

    @GetMapping("/")
    public String indexFirst() {
        return "redirect:/index";
    }

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("list", goodsService.getAll());
        return "index";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }


    @PostMapping("login")
    public String login(String username, String password, Model model) {
        salesManService.login(username, password);
        Object errorTimes = UserContext.getSession().getAttribute("ErrorTimes");

        if (errorTimes == null) {
            UserContext.getSession().setAttribute("ErrorTimes", 1);
        } else {
            UserContext.getSession().setAttribute("ErrorTimes", (Integer) errorTimes + 1);
        }
        return "redirect:/index";
    }

    @GetMapping("logout")
    public String logout() {
        UserContext.getSession().removeAttribute("LoginSuccess");
        UserContext.getSession().removeAttribute("ErrorTimes");

        return "redirect:/index";
    }

    @GetMapping("error")
    public String error() {
        return "error";
    }
}
