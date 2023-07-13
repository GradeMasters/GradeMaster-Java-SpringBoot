package com.grademaster.grademasterapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassroomController {

    @GetMapping("/classrooms")
    public String showClassroom(Model model) {
        return "classrooms";
    }

}
