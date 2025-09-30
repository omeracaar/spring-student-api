package com.omeracar.repository;

import com.omeracar.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    //@Query(value = "from Student" , nativeQuery = false)
    //List<Student> findAllStudents();

    @Query("from Student s where s.id = :studentId")
    Optional<Student> findStudentById(Integer studentId);

}
