package com.example.cms.model.repository;

import com.example.cms.model.entity.CourseMark;
import com.example.cms.model.entity.CourseMarkKey;
import com.example.cms.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface CourseMarkRepository extends JpaRepository<CourseMark, CourseMarkKey> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE MARKS m SET mark = MIN(mark + 5, 100) WHERE m.courseCode = :code", nativeQuery = true)
    void increaseFive(@Param("code") String code);


}
