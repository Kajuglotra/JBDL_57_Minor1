package org.gfg.minor1.controller;

import org.gfg.minor1.models.*;
import org.gfg.minor1.request.CreateStudentRequest;
import org.gfg.minor1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student create(@RequestBody CreateStudentRequest createStudentRequest){
       return studentService.create(createStudentRequest);
    }

    @GetMapping("/find")
    public List<Student> findStudent(@RequestParam("filter") StudentFilterType studentFilterType,
                                     @RequestParam("value") String value,
                                     @RequestParam("operation") OperationType operationType){
        return studentService.findStudent(studentFilterType, value, operationType);
    }

}
