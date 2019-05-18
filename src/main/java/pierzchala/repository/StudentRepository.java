package pierzchala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pierzchala.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {


}
