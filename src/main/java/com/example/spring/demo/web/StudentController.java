package com.example.spring.demo.web;


import com.example.spring.demo.model.Student;
import com.example.spring.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/get")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> studentList =  studentService.getAllStudents();
        return ResponseEntity.ok(studentList);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getbyid(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudent(id));
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }


    @PutMapping("{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.ok("delete success");
    }
}
