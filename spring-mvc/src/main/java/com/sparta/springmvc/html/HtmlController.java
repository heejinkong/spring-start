package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@Controller
public class HtmlController {

    private static long visitCount = 0;
    private final SpringResourceTemplateResolver springResourceTemplateResolver;

    public HtmlController(SpringResourceTemplateResolver springResourceTemplateResolver) {
        this.springResourceTemplateResolver = springResourceTemplateResolver;
    }

    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits",visitCount);
        return "hello-visit";
    }


}
