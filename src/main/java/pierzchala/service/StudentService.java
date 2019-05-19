package pierzchala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pierzchala.model.Student;
import pierzchala.repository.StudentRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void save(Student entity) {
        studentRepository.save(entity);
    }

    public void update(Student entity) {
        studentRepository.save(entity);
    }

    public void deleteById(Long id) {
        studentRepository.delete(id);
    }

    public void delete(Student entity) {
        studentRepository.delete(entity);
    }

    public Student findById(Long id) {
        return studentRepository.findOne(id);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
