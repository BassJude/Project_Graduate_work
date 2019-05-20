package pierzchala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pierzchala.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query(value = "SELECT * FROM studenci ORDER BY id_studenta DESC LIMIT 1", nativeQuery = true)
    Student findLastAddStudent();

    @Query(value = "SELECT * FROM studenci ORDER BY id_studenta DESC", nativeQuery = true)
    List<Student> findAllOrderByIdDesc();



}
