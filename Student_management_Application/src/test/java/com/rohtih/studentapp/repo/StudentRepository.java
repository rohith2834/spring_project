package com.rohtih.studentapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohtih.studentapp.models.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
