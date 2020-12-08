package com.bochkovoleg.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("askDetails")
    public String askEmployeeDetails(Model model) {

//        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Ivanov");
//        emp.setSalary(111);
        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }

    @RequestMapping("showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp) {
        //АННОТАЦИЯ Valid - означает, что наш атрибут будет подвергаться проверке

//        String name = emp.getName();
//        emp.setName("Mr." + name);
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//        Integer salary = emp.getSalary();
//        emp.setSalary(salary + 1000);

        return "show-emp-details-view";
    }





}
//    @RequestMapping("/")
//    public String showFirstView() {
//        return "first-view";
//    }
//
//    @RequestMapping("askDetails")
//    public String askEmployeeDetails() {
//        return "ask-emp-details-view";
//    }

//    @RequestMapping("showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description", " - udemy instructor");
//
//        return "show-emp-details-view";
//    }

//    @RequestMapping("showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description", " - udemy instructor");
//
//        return "show-emp-details-view";
//    }



