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

    public List<Student> findAllDesc(){return studentRepository.findAllOrderByIdDesc();}

    // add unique index
    public String indexGenerator () {
        if (studentRepository.count()==0) {
            return "0000000001";
        } else {
            // get last index
            Student student =studentRepository.findLastAddStudent();
            String index = student.getNumer_indeksu();
            int lastIndex = Integer.parseInt(index);
            // new index
            lastIndex++;
            String newIndex = Integer.toString(lastIndex);
            // because index is String and it must has 10 characters we have to add "0" before index number
            String zeroBeforeNumber="";
            for (int i=0; i<10-newIndex.length(); i++) {
                zeroBeforeNumber+="0";
            }
            return zeroBeforeNumber+=newIndex;
        }


    }
}
