
package com.example.spring.demo.dao;

import com.example.spring.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student, Long> {
}
