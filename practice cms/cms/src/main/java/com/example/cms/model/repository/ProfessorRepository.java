package com.example.cms.model.repository;

import com.example.cms.model.entity.Professor;
import com.example.cms.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    @Query(value = "select * from students where " + "id IN SELECT p.firstName, p.lastName FROM professors p INNER JOIN courses c ON p.id = c.professorId " +
            "GROUP BY p.firstName, p.lastName HAVING COUNT(c.Code) > 2)", nativeQuery = true)
    List<Professor> topProfs();
    //SELECT p.firstName, p.lastName FROM Courses JOIN


}
