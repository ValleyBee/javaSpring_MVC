package com.valleybee.spring.mvc;

import com.valleybee.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    // @NotEmpty
    @NotBlank(message = "name is necessary field")
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
    @NotEmpty
    private String surName;
    @Min(value = 100, message = "min 100")
    @Max(value = 999, message = "999")
    private int salary;
    private String department;

    private Map<String, String> departments;

    private String agreement;

    private String[] languages;

    private Map<String, String> listLanguage;

    @NotBlank(message = "phone necessary field")
    @Size(min = 10, message = "error phone")
    @Pattern(regexp = "\\d{3}\\d{7}", message = "+38 xxx xxxxxxx")
    private String phoneNumber;

    //@CheckEmail (value = "abc.com", message = "only abc.com email")
    @Pattern(regexp = "\\w+@xyz\\.com")
    private String email;



    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("ENG", "Engineering");

        listLanguage = new HashMap<>();
        listLanguage.put("ENG", "English");
        listLanguage.put("ESP", "Spain");
        listLanguage.put("DE", "Dutch");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getListLanguage() {
        return listLanguage;
    }

    public void setListLanguage(Map<String, String> listLanguage) {
        this.listLanguage = listLanguage;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", departments=" + departments +
                '}';
    }
}
