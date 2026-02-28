package com.aditya.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.aditya.portfolio.model.Project;
import com.aditya.portfolio.service.ProjectService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/add")
    public String showForm(Project project) {
        return "add-project";
    }

    @PostMapping("/save")
    public String saveProject(Project project) {
        projectService.saveProject(project);
        return "redirect:/";
    }
}