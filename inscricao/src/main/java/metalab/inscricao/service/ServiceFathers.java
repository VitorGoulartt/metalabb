package metalab.inscricao.service;

import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import metalab.inscricao.dtos.FatherDTO;
import metalab.inscricao.mapper.MapperFathers;
import metalab.inscricao.model.ModelFather;
import metalab.inscricao.repository.RepositoryFather;

@Service
public class ServiceFathers {

    @Autowired
    private RepositoryFather repositoryFather;

    @Autowired
    private MapperFathers mapper;

    public List<FatherDTO> listFathers(){
        List<ModelFather> fathers = repositoryFather.findAll();
        return fathers.stream()
            .map(mapper::toDto) 
            .collect(Collectors.toList());
    }

    public FatherDTO listFathersById(int id){
        Optional<ModelFather> Father = repositoryFather.findById(id);
        
        Optional<FatherDTO> fatherDto = Father.map(mapper::toDto);
        
        return fatherDto.orElse(null);

    }
    
    public FatherDTO listFathersByStudentId(int id){
        ModelFather father = repositoryFather.findByStudentId(id);
        
        FatherDTO fatherDto = mapper.toDto(father);
        
        return fatherDto;

    }

    public ModelFather updateFather(ModelFather father, int id){
        Optional<ModelFather> fatherN = repositoryFather.findById(id);
        if(fatherN.isPresent()){
            ModelFather fatherUpdated = fatherN.get();

            if(father.getEmail() != null){
                fatherUpdated.setEmail(father.getEmail());
            }
            if(father.getTelefone() != null){
                fatherUpdated.setTelefone(father.getTelefone());
            }
            if(father.getNome() != null){
                fatherUpdated.setNome(father.getNome());
            }
            return repositoryFather.save(fatherUpdated);
        }
        return null;
    }

    

}
