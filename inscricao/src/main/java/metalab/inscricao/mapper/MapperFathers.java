package metalab.inscricao.mapper;

import org.springframework.stereotype.Component;

import metalab.inscricao.Model.ModelFather;
import metalab.inscricao.dtos.FatherDTO;

@Component
public class MapperFathers {

    public FatherDTO toDto(ModelFather father) {
        return new FatherDTO(
            father.getId(),
            father.getNome(),
            father.getIdade(),
            father.getTelefone()
        );
    }

}
