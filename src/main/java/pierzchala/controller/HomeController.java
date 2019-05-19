package pierzchala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pierzchala.model.Student;
import pierzchala.service.StudentService;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public String start() {
        return "/home";
    }

    /////////////////// student ///////////////////////////

    @RequestMapping("/allStudents")
    public String allStudents(Model model) {
        List<Student> studentList = studentService.findAll();
        model.addAttribute("studentList",studentList);
        return "/students/allStudents";}




}
