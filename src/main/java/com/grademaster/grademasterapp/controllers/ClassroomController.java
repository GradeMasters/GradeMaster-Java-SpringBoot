package com.grademaster.grademasterapp.controllers;

import com.grademaster.grademasterapp.models.Classroom;
import com.grademaster.grademasterapp.models.Student;
import com.grademaster.grademasterapp.repositories.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.grademaster.grademasterapp.repositories.ClassroomRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/classrooms")
public class ClassroomController {

    private final ClassroomRepository classroomRepo;
    private final StudentRepository studentRepo;

    public ClassroomController(ClassroomRepository classroomRepo, StudentRepository studentRepo) {
        this.classroomRepo = classroomRepo;
        this.studentRepo = studentRepo;
    }

    @GetMapping
    public String showClassroom(Model model) {
        List<Classroom> allClasses = classroomRepo.findAll();
        model.addAttribute("classes", allClasses);
        return "classes/class-list";
    }

    @GetMapping("/{classroomId}/gradebook")
    public String showGradebook(Model model, @PathVariable(name = "classroomId") long classroomId) {
        List<Student> allStudents = studentRepo.findAll();
        Classroom classroom = classroomRepo.findById(classroomId).get();
        model.addAttribute("class", classroom);
        model.addAttribute("students", allStudents);
        return "classes/gradebook";
    }

}
