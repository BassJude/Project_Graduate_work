package pierzchala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pierzchala.model.ResearchDegree;
import pierzchala.model.Student;
import pierzchala.service.ResearchDegreeService;
import pierzchala.service.StudentService;
import pierzchala.validator.EditValidator;
import pierzchala.validator.RegistrationValidator;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ResearchDegreeService researchDegreeService;

    @RequestMapping("/")
    public String start() {
        return "/home";
    }

    /////////////////// student ///////////////////////////

    @RequestMapping("/allStudents")
    public String allStudents(Model model) {
        List<Student> studentList = studentService.findAllDesc();
        model.addAttribute("studentList", studentList);
        return "/students/allStudents";
    }

    @GetMapping("/addStudent")
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "/students/addStudent";
    }

    @PostMapping("/addStudent")
    public String addStudent(@Validated(RegistrationValidator.class) Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/students/addStudent";
        }
        // add unique index
        student.setNumer_indeksu(studentService.indexGenerator());
        studentService.save(student);
        return "forward:/allStudents";
    }
    @GetMapping("editStudent/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student",studentService.findById(id));
        return "/students/addStudent";
    }
    @PostMapping("editStudent/{id}")
    public String editStudent(@Validated(EditValidator.class) Student student, BindingResult result, @PathVariable Long id) {
        if (result.hasErrors()) {
            return "/students/addStudent";
        }
        student.setId_studenta(studentService.findById(id).getId_studenta());
        student.setNumer_indeksu(studentService.findById(id).getNumer_indeksu());
        studentService.update(student);
        return "forward:/allStudents";
    }

    @RequestMapping(path = "/deleteStudent/{id}",produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String deleteStudent() {
        return "Usługa niedostępna";
    }


    ////////////////////////// ResearchDegree ///////////////////////////////

    @RequestMapping("/allResearchDegree")
    public String allResearchDegree(Model model) {
        List<ResearchDegree> researchDegreeList = researchDegreeService.findAll();
        model.addAttribute("researchDegree", researchDegreeList);
        return "/ResearchDegree/allResearchDegree";
    }

    @GetMapping("/addResearchDegree")
    public String addResearchDegree(Model model) {
        model.addAttribute("researchDegree", new ResearchDegree());
        return "/ResearchDegree/addResearchDegree";
    }

    @PostMapping("/addResearchDegree")
    public String addResearchDegree(@Validated(RegistrationValidator.class) ResearchDegree researchDegree, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/ResearchDegree/addResearchDegree";
        }
        researchDegreeService.save(researchDegree);
        return "forward:/allResearchDegree";
    }
    @GetMapping("editResearchDegree/{id}")
    public String editResearchDegree(@PathVariable Long id, Model model) {
        model.addAttribute("researchDegree",researchDegreeService.findById(id));
        return "/ResearchDegree/addResearchDegree";
    }
    @PostMapping("editResearchDegree/{id}")
    public String editResearchDegree(@Validated(EditValidator.class) ResearchDegree researchDegree, BindingResult result, @PathVariable Long id) {
        if (result.hasErrors()) {
            return "/ResearchDegree/addResearchDegree";
        }
        researchDegree.setId_stopnia(researchDegreeService.findById(id).getId_stopnia());
        researchDegreeService.update(researchDegree);
        return "forward:/allResearchDegree";
    }

}
