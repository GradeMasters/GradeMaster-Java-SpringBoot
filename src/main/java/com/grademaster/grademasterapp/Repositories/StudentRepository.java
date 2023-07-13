package com.grademaster.grademasterapp.repositories;

import com.grademaster.grademasterapp.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
