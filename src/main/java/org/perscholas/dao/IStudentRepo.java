package org.perscholas.dao;

import org.perscholas.models.Student;
import org.perscholas.services.StudentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

/*
        - add annotation
        - extend spring jpa
        - add custom methods if needed

 */
@Repository

public interface IStudentRepo extends JpaRepository<Student,Long> {
    public Student findByStudentEmail(String studentEmail);
    public Student findByStudentId(Long studentId);

}