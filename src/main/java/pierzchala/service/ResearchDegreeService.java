package pierzchala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pierzchala.model.ResearchDegree;
import pierzchala.repository.ResearchDegreeRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ResearchDegreeService {

    @Autowired
    private ResearchDegreeRepository researchDegreeRepository;

    public void save(ResearchDegree entity) {
        researchDegreeRepository.save(entity);
    }

    public void update(ResearchDegree entity) {
        researchDegreeRepository.save(entity);
    }

    public void deleteById(Long id) {
        researchDegreeRepository.delete(id);
    }

    public void delete(ResearchDegree entity) {
        researchDegreeRepository.delete(entity);
    }

    public ResearchDegree findById(Long id) {
        return researchDegreeRepository.findOne(id);
    }

    public List<ResearchDegree> findAll() {
        return researchDegreeRepository.findAll();
    }


}
