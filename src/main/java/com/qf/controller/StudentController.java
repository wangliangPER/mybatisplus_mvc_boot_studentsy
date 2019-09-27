package com.qf.controller;


import com.qf.entity.Student;
import com.qf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/stuList")
    public String getSTuList(ModelMap map){
        List<Student> list = studentService.list();
        map.put("stuList", list);
        return "stuList";
    }
    @RequestMapping("update/{id}")
    public  String update(@PathVariable("id") Integer id,ModelMap map){
        Student student = studentService.getById(id);
        System.out.println(student);
        map.put("Stu", student);
        return "updateStu";
    }

    @RequestMapping("updateStu")
    public String updateStu(Student student){
        studentService.updateById(student);
        return "redirect:/stu/stuList";
    }
}

