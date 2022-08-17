package com.valleybee.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
//@RequestMapping("/employee")
public class myContreller {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

    // simple
    @RequestMapping("/showDetails")
    public String showDetails() {
        return "show-emp-details-view";
    }

    // HttpServletRequest  from java servlet
    @RequestMapping("/showFullDetails")
    public String showFullDetails(HttpServletRequest request, Model model) {
        String empName = request.getParameter("employeeName");
        String empSurname = request.getParameter("employeeSurname");
        empName = "Mr. " + empName;
        model.addAttribute("descriptionAttribute", "IT engineer");
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("surnameAttribute", empSurname);
        return "show-emp-details-view";

    }



    /* ************************************** @RequestParam work with fields ****************************************** */

    // @RequestParam from Springframework
    @RequestMapping("/showFullDetails2")
    public String showFullDetails2(@RequestParam("employeeName") String empName, @RequestParam("employeeSurname") String empSurname, Model model) {
        empName = "Mr. " + empName;
        model.addAttribute("descriptionAttribute", "IT engineer");
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("surnameAttribute", empSurname);
        return "show-emp-details-view";

    }

    /* ************************************* @ModelAttribute  work with objects*********************************************** */

    @RequestMapping("/askDetails2")

    public String askEmployeeDetails2(Model model) {
        model.addAttribute("emp", new Employee());
        return "ask-emp-details-view2";
    }

    @RequestMapping("/showDetails2")
    public String showDetails2(@Valid @ModelAttribute("emp") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view2";
        } else {
            return "show-emp-details-view2";
        }
    }
}
